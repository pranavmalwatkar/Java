//switch program
import java.io.*;

class abc
{
	int a,b,ch;
	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter First Number:: ");
			a=Integer.parseInt(br.readLine());
			System.out.println("Enter Second Number:: ");
			b=Integer.parseInt(br.readLine());
			do{
			System.out.println("1)Addition");
			System.out.println("2)Subtraction");
			System.out.println("3)Multiplication");
			System.out.println("4)Division");
			System.out.println("5)Exit");
			System.out.println("Enter your choise::");
			ch=Integer.parseInt(br.readLine());
			}while(ch!=5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		System.out.println("ANSER KEY");
		switch(ch)
		{
			case 1:
			System.out.println("Addition is :: "+(a+b));

			case 2:
			System.out.println("Subtraction is :: "+(a-b));

			case 3:
			System.out.println("Multiplication is :: "+(a*b));

			case 4:
			if(b>0)
			{
				System.out.println("Division is :: "+(a/b));

			}else{
				System.out.println("second value must be grater than zero.");

			}
			case 5:
			break;
		}
	}
}
class xyz_switch
{
	public static void main(String args[]){
		abc a=new abc();
		a.accept();
		a.display();
	}
}