// Final_Method
import java.io.*;

class abc
{
	final void show()
	{
		System.out.println("show method abc");
	}
}
class pqr extends abc
{
	void show()
	{
		System.out.println("show method pqr");
	}
}

class xyz
{
	public static void main(String args[]){
	abc x1=new abc();
	pqr x2=new pqr();
x2.show();
	}
}