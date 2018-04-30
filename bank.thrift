namespace java sr.rpc.bank

enum AccountType {
    STANDARD = 1,
    PREMIUM = 2
}

struct Account {
    1: string name,
    2: string surname,
    3: string pesel,
    4: double income,
    5: double amount,
    6: string currency,
    7: optional AccountType type,
    8: optional string guid
}

struct Date {
    1: i32 day,
    2: i32 month,
    3: i32 year
}

struct CreditRequest {
    1: string guid,
    2: string currency
    3: Date fromDate,
    4: Date toDate,
    5: double amount
}

struct CreditResponse {
    1: string currency1,
    2: string currency2,
    3: double amount1,
    4: double amount2
}

exception AccountExists {
  1: string pesel,
  2: string message
}

exception AccountDoesNotExist {
  1: string guid,
  2: string message
}

exception InvalidAccountType {
  1: string guid,
  2: string message
}

service BankManager {
    Account create(1: Account newAccount) throws (1: AccountExists ex)
    Account login(1: string guid) throws (1: AccountDoesNotExist ex)
}

service BankStandard {
    Account getInfo(1: string guid) throws (1: AccountDoesNotExist ex1, 2: InvalidAccountType ex2)
}

service BankPremium extends BankStandard {
    CreditResponse getCredit(1: CreditRequest creditRequest) throws (1: AccountDoesNotExist ex1, 2: InvalidAccountType ex2)
}