// private_member
import java.io.*;

class bank
{
	private double balance=100;
	public double getBalance()
	{
		return balance;
	}
}

class xyz_private_member
{
	public static void main(String args[]){
	bank x1=new bank();

	System.out.println("Balance is "+x1.getBalance());
	}
}