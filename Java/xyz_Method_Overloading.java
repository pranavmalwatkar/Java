//Method_Overloading Example (Same class, different method )
import java.io.*;

class abc
{
	void show(int a)
	{
		System.out.println(a);
	}
	void show(int a,int b)
	{
		System.out.println(a+b);
	}
}
class xyz_Method_Overloading
{
	public static void main(String args[]){
	abc x=new abc();
	x.show(10);
	x.show(10,20);
	}
}