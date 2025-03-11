// interface
import java.io.*;
interface abc
{
	void show();
}
class a1 implements abc
{
	public void show()
	{
		System.out.println("I am interface");
	}

}


class xyz_interface
{
	public static void main(String args[]){
	a1 x1=new a1();
	x1.show();
	}
}