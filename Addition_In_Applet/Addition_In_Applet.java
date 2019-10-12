import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Addition_In_Applet" width="300" height="300"></applet> */
public class Addition_In_Applet extends Applet
{
	Label l1 , l2 , l3;
	TextField t1 , t2;
	Button b1;

	public void init()
	{
		l1 = new Label("First Number");
		l2 = new Label("Second Number");
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("Add");
		l3 = new Label();

		setLayout(null);
		l1.setBounds(50,50,100,20);
		l2.setBounds(50,110,100,20);
		t1.setBounds(180,50,70,20);
		t2.setBounds(180,110,70,20);
		b1.setBounds(100,160,100,20);
		l3.setBounds(70,200,130,20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		b1.addActionListener(new Add());

	}


	public class Add implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			long a , b , s;
	
			a = Long.parseLong(t1.getText());
			b = Long.parseLong(t2.getText());
			s = a + b;
			l3.setText( "SUM is" + " " + s);
		}
	}
		
}