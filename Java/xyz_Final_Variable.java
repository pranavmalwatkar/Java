// Final_Variable
import java.io.*;

class abc
{
	final int value=100;
	void show()
	{
		//value=200;
		System.out.println(value);
	}

}


class xyz_Final_Variable
{
	public static void main(String args[]){
	abc x=new abc();
x.show();
	}
}