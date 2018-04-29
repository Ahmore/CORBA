package sr.thrift.server;

import org.apache.thrift.TException;

// Generated code
import sr.rpc.thrift.*;

public class CalculatorHandler implements Calculator.Iface {

	int id;

	public CalculatorHandler(int id) {
		this.id = id;
	}

	@Override
	public int add(int n1, int n2) {
		System.out.println("CH#" + id + " add(" + n1 + "," + n2 + ")");
		if(n1 > 1000 || n2 > 1000) { 
			try { Thread.sleep(6000); } catch(InterruptedException ex) { }
			System.out.println("DONE");
		}
		return n1 + n2;
	}

	@Override
	public int subtract(int num1, int num2) throws TException {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public long multiply(int num1, int num2, int num3) throws TException {


		System.out.println("CH#" + id + " mul(" + num1 + "," + num2 + "," + num3 + ")");

		return num1 * num2 * num3;
	}

}

