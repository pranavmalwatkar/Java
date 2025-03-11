// thread with applet

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class xyz_thread_with_applet extends Applet implements ActionListener,Runnable
{
	Thread t;
	Button b1;
	int i=0;
	public void init()
	{
		t=new Thread(this);
		i=1;
		b1=new Button("Click");
	}
	public void start()
	{
		super.init();
		add(b1);
		setSize(5000,5000);
		setVisible(true);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if (ob==b1)
		{
			t.start();
		}
	}
	public void run()
	{
		try
		{
			for(i=1;i<=10;i++){
				System.out.println("\n"+i);
				t.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

