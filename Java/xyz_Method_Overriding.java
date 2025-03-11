//Method_Overriding Example (Subclass modifies parent class method)
import java.io.*;

class a1
{
	void show()
	{
		System.out.println("class a1");
	}

}
class a2 extends a1
{

	void show()
	{
		//super.show();
		System.out.println("class a2");
	}
}

class xyz_Method_Overriding
{
	public static void main(String args[]){
	a1 x1=new a1();
	a2 x2=new a2();

	x2.show();
	}
}