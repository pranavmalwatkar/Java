// Static_variables
import java.io.*;

class a1
{
	static String company="TATA";
	String name;
	a1(String name)
	{
		this.name=name;
	}
	void show()
	{
		System.out.println("Name : "+name+", company : "+company);
	}
}


class xyz_Static_variables
{
	public static void main(String args[]){
	a1 x1=new a1("pranav");
	a1 x2=new a1("rahul");
	x1.show();
	x2.show();
	a1.company="Bajaj";
	x1.show();
	x2.show();
	}
}