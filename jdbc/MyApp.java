import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyApp extends JFrame
{

  /** 
  * File 4/4 of jdbc series
  * Call this class to input data from CL to sql table
  */
  
MyApp()
{
	Container c=getContentPane();
	c.setLayout(null);
	
	JLabel title = new JLabel("Insert values to table");
	JLabel l1 = new JLabel("product name");
	JTextField t1 =new JTextField(20);
	JLabel l2 = new JLabel("product price");
	JTextField t2 =new JTextField(20);
  JButton Jb=new JButton("Add to table");
	title.setBounds(200,50,150,30);
	c.add(title);
	l1.setBounds(100,100,200,20);
	c.add(l1);
	l2.setBounds(100,200,200,20);
	c.add(l2);
	t1.setBounds(300,100,200,20);
	c.add(t1);
	t2.setBounds(300,200,200,20);
	c.add(t2);
	Jb.setBounds(200,300,150,30);
	c.add(Jb);

  /**
  * Method defining click button event
  */
  
	Jb.addActionListener(new ActionListener()
  {
	public void actionPerformed(ActionEvent e)
	{
		
		String a = t1.getText();
		int b = Integer.parseInt(t2.getText());
		
		System.out.println("hello");
		System.out.println(a);
		System.out.println(b);
		
		JdbcHelper jh = new JdbcHelper();
			
		jh.getStatement();
		jh.insert(a,b);
		
		t1.setText(null);
		t2.setText(null);
	}
});
	setSize(600,600);
	setVisible(true);

}
public static void main(String[]args)
{
	MyApp app=new MyApp();
	
	JdbcHelper jh = new JdbcHelper();
			
			jh.getStatement();
      
			//jh.insert("chips",40);
}
}
