#
# Autogenerated by Thrift Compiler (0.11.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
from thrift.TRecursive import fix_spec

import sys
import exchanger.BankStandard
import logging
from .ttypes import *
from thrift.Thrift import TProcessor
from thrift.transport import TTransport
all_structs = []


class Iface(exchanger.BankStandard.Iface):
    def getCredit(self, creditRequest):
        """
        Parameters:
         - creditRequest
        """
        pass


class Client(exchanger.BankStandard.Client, Iface):
    def __init__(self, iprot, oprot=None):
        exchanger.BankStandard.Client.__init__(self, iprot, oprot)

    def getCredit(self, creditRequest):
        """
        Parameters:
         - creditRequest
        """
        self.send_getCredit(creditRequest)
        return self.recv_getCredit()

    def send_getCredit(self, creditRequest):
        self._oprot.writeMessageBegin('getCredit', TMessageType.CALL, self._seqid)
        args = getCredit_args()
        args.creditRequest = creditRequest
        args.write(self._oprot)
        self._oprot.writeMessageEnd()
        self._oprot.trans.flush()

    def recv_getCredit(self):
        iprot = self._iprot
        (fname, mtype, rseqid) = iprot.readMessageBegin()
        if mtype == TMessageType.EXCEPTION:
            x = TApplicationException()
            x.read(iprot)
            iprot.readMessageEnd()
            raise x
        result = getCredit_result()
        result.read(iprot)
        iprot.readMessageEnd()
        if result.success is not None:
            return result.success
        if result.ex1 is not None:
            raise result.ex1
        if result.ex2 is not None:
            raise result.ex2
        raise TApplicationException(TApplicationException.MISSING_RESULT, "getCredit failed: unknown result")


class Processor(exchanger.BankStandard.Processor, Iface, TProcessor):
    def __init__(self, handler):
        exchanger.BankStandard.Processor.__init__(self, handler)
        self._processMap["getCredit"] = Processor.process_getCredit

    def process(self, iprot, oprot):
        (name, type, seqid) = iprot.readMessageBegin()
        if name not in self._processMap:
            iprot.skip(TType.STRUCT)
            iprot.readMessageEnd()
            x = TApplicationException(TApplicationException.UNKNOWN_METHOD, 'Unknown function %s' % (name))
            oprot.writeMessageBegin(name, TMessageType.EXCEPTION, seqid)
            x.write(oprot)
            oprot.writeMessageEnd()
            oprot.trans.flush()
            return
        else:
            self._processMap[name](self, seqid, iprot, oprot)
        return True

    def process_getCredit(self, seqid, iprot, oprot):
        args = getCredit_args()
        args.read(iprot)
        iprot.readMessageEnd()
        result = getCredit_result()
        try:
            result.success = self._handler.getCredit(args.creditRequest)
            msg_type = TMessageType.REPLY
        except TTransport.TTransportException:
            raise
        except AccountDoesNotExist as ex1:
            msg_type = TMessageType.REPLY
            result.ex1 = ex1
        except InvalidAccountType as ex2:
            msg_type = TMessageType.REPLY
            result.ex2 = ex2
        except TApplicationException as ex:
            logging.exception('TApplication exception in handler')
            msg_type = TMessageType.EXCEPTION
            result = ex
        except Exception:
            logging.exception('Unexpected exception in handler')
            msg_type = TMessageType.EXCEPTION
            result = TApplicationException(TApplicationException.INTERNAL_ERROR, 'Internal error')
        oprot.writeMessageBegin("getCredit", msg_type, seqid)
        result.write(oprot)
        oprot.writeMessageEnd()
        oprot.trans.flush()

# HELPER FUNCTIONS AND STRUCTURES


class getCredit_args(object):
    """
    Attributes:
     - creditRequest
    """


    def __init__(self, creditRequest=None,):
        self.creditRequest = creditRequest

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRUCT:
                    self.creditRequest = CreditRequest()
                    self.creditRequest.read(iprot)
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('getCredit_args')
        if self.creditRequest is not None:
            oprot.writeFieldBegin('creditRequest', TType.STRUCT, 1)
            self.creditRequest.write(oprot)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
all_structs.append(getCredit_args)
getCredit_args.thrift_spec = (
    None,  # 0
    (1, TType.STRUCT, 'creditRequest', [CreditRequest, None], None, ),  # 1
)


class getCredit_result(object):
    """
    Attributes:
     - success
     - ex1
     - ex2
    """


    def __init__(self, success=None, ex1=None, ex2=None,):
        self.success = success
        self.ex1 = ex1
        self.ex2 = ex2

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 0:
                if ftype == TType.STRUCT:
                    self.success = CreditResponse()
                    self.success.read(iprot)
                else:
                    iprot.skip(ftype)
            elif fid == 1:
                if ftype == TType.STRUCT:
                    self.ex1 = AccountDoesNotExist()
                    self.ex1.read(iprot)
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRUCT:
                    self.ex2 = InvalidAccountType()
                    self.ex2.read(iprot)
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('getCredit_result')
        if self.success is not None:
            oprot.writeFieldBegin('success', TType.STRUCT, 0)
            self.success.write(oprot)
            oprot.writeFieldEnd()
        if self.ex1 is not None:
            oprot.writeFieldBegin('ex1', TType.STRUCT, 1)
            self.ex1.write(oprot)
            oprot.writeFieldEnd()
        if self.ex2 is not None:
            oprot.writeFieldBegin('ex2', TType.STRUCT, 2)
            self.ex2.write(oprot)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
all_structs.append(getCredit_result)
getCredit_result.thrift_spec = (
    (0, TType.STRUCT, 'success', [CreditResponse, None], None, ),  # 0
    (1, TType.STRUCT, 'ex1', [AccountDoesNotExist, None], None, ),  # 1
    (2, TType.STRUCT, 'ex2', [InvalidAccountType, None], None, ),  # 2
)
fix_spec(all_structs)
del all_structs

