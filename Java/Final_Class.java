// Final_Class
import java.io.*;

final class abc
{
	void show()
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

class xyz_Final_Class
{
	public static void main(String args[]){
	abc x1=new abc();
	pqr x2=new pqr();
x2.show();
	}
}