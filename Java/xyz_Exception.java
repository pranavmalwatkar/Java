//Exception handling program
import java.io.*;

class xyz_Exception
{
	public static void main(String args[]){
	try
	{
		//1. ArithmeticException (Divide by zero)
		int result =10/0;
		System.out.println("Result"+result);
		//2. NullPointerException (Accessing the null reference)
		String str=null;
		System.out.println(str.length());
		//3.NumberFormatException (Invalid Number conversion)
		int num=Integer.parseInt("abc");
		//4.ClassNotFoundException (Trying to load a non-existing class)
		Class.forName("com.unknown.class");
		//5.FileNotFoundException (Tring to open non-existing file)
		FileReader file = new FileReader("non_existing_file.text");
		//6. ArrayIndexOutOfBoundException (Invalid Number)
		int arr[]={1,2,3};
		System.out.println(arr[5]);
		//7.StringIndexOutOfBoundException (Invalid String Index)
		String text="Java";
		System.out.println(text.charAt(10));
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Always run finally block");
	}
	}
}