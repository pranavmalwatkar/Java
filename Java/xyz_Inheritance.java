//Inheritance program
import java.io.*;
class one
{
	int a=20;
}
class two extends one
{
	two()
	{
		System.out.println(a);
	}
}
class xyz_Inheritance
{
	public static void main(String args[]){
		two x=new two();
	}
}