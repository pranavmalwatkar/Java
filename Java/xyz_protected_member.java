// protected_member
import java.io.*;

class a1
{
	 protected double balance=100;

}
class a2 extends a1
{
	void show()
	{
		System.out.println("Balance is "+balance);
	}
}

class xyz_protected_member
{
	public static void main(String args[]){
	a2 x1=new a2();
	x1.show();
	}
}