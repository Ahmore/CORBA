import argparse
import sys

from thrift.protocol.TMultiplexedProtocol import TMultiplexedProtocol
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

sys.path.append('gen-py')

from bank import BankManager, BankStandard, BankPremium
from bank.ttypes import AccountExists, AccountDoesNotExist, InvalidAccountType, Account, CreditRequest, Date, \
    InvalidCurrency


def main(port):
    # Make socket
    transport = TSocket.TSocket('localhost', port)

    # Buffering is critical. Raw sockets are very slow
    transport = TTransport.TBufferedTransport(transport)

    # Wrap in a protocol
    protocol = TBinaryProtocol.TBinaryProtocol(transport)

    # Create a client to use the protocol encoder
    bank_manager = BankManager.Client(TMultiplexedProtocol(protocol, "Manager"))
    bank_standard = BankStandard.Client(TMultiplexedProtocol(protocol, "Standard"))
    bank_premium = BankPremium.Client(TMultiplexedProtocol(protocol, "Premium"))

    # Connect!
    transport.open()

    print("[CLIENT STARTED] Port: " + str(port))

    account_management_loop(bank_manager, bank_standard, bank_premium)

    # Close!
    transport.close()


def account_management_loop(bank_manager, bank_standard, bank_premium):
    while True:
        res = input("Do you have an account? [Y/N] ").lower()

        if res == "y":
            guid = input("Guid: ")
            code = 0

            try:
                account = bank_manager.login(guid)
                print(account)

                if account.type == 1:
                    code = account_standard_loop(bank_standard, guid)
                elif account.type == 2:
                    code = account_premium_loop(bank_premium, guid)

                if code == 1:
                    break

            except AccountDoesNotExist as e:
                print('AccountDoesNotExist: %r' % e)

        elif res == "n":
            new_account(bank_manager)
        else:
            print("Invalid answer")


def new_account(bank_manager):
    account = Account()

    account.name = input("Name: ")
    account.surname = input("Surname: ")
    account.pesel = input("Pesel: ")
    account.income = float(input("Income: "))
    account.amount = float(input("Amount: "))
    account.currency = input("Currency: ")

    # account.name = "a"
    # account.surname = "b"
    # account.pesel = "12345678908"
    # account.income = 3000
    # account.amount = 1000
    # account.currency = "PLN"

    try:
        account = bank_manager.create(account)
        print(account)
    except AccountExists as e:
        print('AccountExists: %r' % e)


def account_standard_loop(bank_standard, guid):
    while True:
        command = input("==>").lower()

        if command == "info":
            try:
                info = bank_standard.getInfo(guid)
                print(info)
            except AccountDoesNotExist as e:
                print('AccountDoesNotExist: %r' % e)
            except InvalidAccountType as e:
                print('InvalidAccountType: %r' % e)

        elif command == "logout":
            return
        elif command == "quit":
            return 1
        else:
            print("Invalid command")


def account_premium_loop(bank_premium, guid):
    while True:
        command = input("==>").lower()

        if command == "info":
            try:
                info = bank_premium.getInfo(guid)
                print(info)
            except AccountDoesNotExist as e:
                print('AccountDoesNotExist: %r' % e)
            except InvalidAccountType as e:
                print('InvalidAccountType: %r' % e)

        elif command == "credit":
            credit_request = CreditRequest()

            credit_request.guid = guid
            credit_request.amount = float(input("Amount: "))
            credit_request.currency = input("Currency: ")

            print("From date: \n")
            from_date = Date()
            from_date.day = int(input("Day: "))
            from_date.month = int(input("Month: "))
            from_date.year = int(input("Year: "))

            print("To date: \n")
            to_date = Date()
            to_date.day = int(input("Day: "))
            to_date.month = int(input("Month: "))
            to_date.year = int(input("Year: "))

            credit_request.fromDate = from_date
            credit_request.toDate = to_date


            # credit_request.guid = guid
            # credit_request.amount = 1000.0
            # credit_request.currency = "EUR"
            #
            # from_date = Date()
            # from_date.day = 1
            # from_date.month = 1
            # from_date.year = 2018
            #
            # to_date = Date()
            # to_date.day = 1
            # to_date.month = 1
            # to_date.year = 2019
            #
            # credit_request.fromDate = from_date
            # credit_request.toDate = to_date

            try:
                credit = bank_premium.getCredit(credit_request)
                print(credit)
            except AccountDoesNotExist as e:
                print('AccountDoesNotExist: %r' % e)
            except InvalidAccountType as e:
                print('InvalidAccountType: %r' % e)
            except InvalidCurrency as e:
                print('InvalidCurrency: %r' % e)

        elif command == "logout":
            return
        elif command == "quit":
            return 1
        else:
            print("Invalid command")


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--port", type=int, required=True)
    args = parser.parse_args()

    main(args.port)