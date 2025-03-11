// frame using awt

import java.io.*;
import java.awt.*;

class a1 extends Frame
{
	Panel p;
	Button b1;
	public a1()
	{
		super("hi");//title
		p=new Panel();
		b1=new Button("Login");


		p.add(b1);
		setSize(1000,500);
		setVisible(true);
	}
}

class xyz
{
	public static void main(String args[]){
	a1 x1=new a1();

	}
}