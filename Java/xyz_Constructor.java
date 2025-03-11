//Constructor program
import java.io.*;

class abc
{
	abc(int a)
	{
		System.out.println("Constructor :: "+a);
	}

}
class xyz_Constructor
{
	public static void main(String args[]){
		int a=10;
		abc a1=new abc(a);

	}
}