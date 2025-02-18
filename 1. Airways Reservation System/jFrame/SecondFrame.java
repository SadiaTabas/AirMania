package jFrame;
import classes.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class SecondFrame extends JFrame implements MouseListener, ActionListener{ 

	JButton signOutBtn, button1,button2,button3;
   JLabel imgLabel;
    JPanel panel;
    Login l;
    Color myColor;
    ImageIcon img;
    public SecondFrame()

    {

		super("MANAGEMENT PAGE.");
		this.setSize(800,457);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		myColor = new Color(31,190,214);

		panel=new JPanel(); 
		panel.setLayout(null);
		panel.setBackground(myColor);
        
      button1=new JButton("1.EMPLOYEE MANAGEMENT.");
      button1.setBounds(270,80,250,50);
      button1.addMouseListener(this);
      button1.addActionListener(this);
      button1.setBackground(Color.WHITE);
      panel.add(button1);

      button2=new JButton("2.CUSTOMER MANAGEMENT.");
      button2.setBounds(270,150,250,50);
      button2.addMouseListener(this);
      button2.addActionListener(this);
      button2.setBackground(Color.WHITE);
      panel.add(button2);

      button3=new JButton("3.TICKET MANAGEMENT.");
      button3.setBounds(270,220,250,50);
      button3.addMouseListener(this);
      button3.addActionListener(this);
      button3.setBackground(Color.WHITE);
      panel.add(button3);

      signOutBtn = new JButton("SIGN OUT");
      signOutBtn.setBounds(350,310,100,40);
      signOutBtn.addMouseListener(this);
      signOutBtn.addActionListener(this);
      signOutBtn.setBackground(Color.WHITE);
      panel.add(signOutBtn);

      img = new ImageIcon("management2.jpg");
      imgLabel = new JLabel(img);
      imgLabel.setBounds(0,0,800,457);
      panel.add(imgLabel);

     this.add(panel);

    }
  
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){

   if(me.getSource()== button1)
          {
             button1.setBackground(Color.PINK);
             button1.setForeground(Color.BLACK);
          }
     
         else if(me.getSource()== button2)
          {
             button2.setBackground(Color.PINK);
             button2.setForeground(Color.BLACK);
          }

           else if(me.getSource()== button3)
          {
             button3.setBackground(Color.PINK);
             button3.setForeground(Color.BLACK);
          }
           else if(me.getSource()== signOutBtn)
          {
             signOutBtn.setBackground(Color.PINK);
             signOutBtn.setForeground(Color.BLACK);
          }
	}

	public void mouseExited(MouseEvent me){

    if(me.getSource()== button1)
          {
             button1.setBackground(Color.WHITE);
             button1.setForeground(Color.BLACK);
          }
     
         else if(me.getSource()== button2)
          {
             button2.setBackground(Color.WHITE);
             button2.setForeground(Color.BLACK);
          }

           else if(me.getSource()== button3)
          {
             button3.setBackground(Color.WHITE);
             button3.setForeground(Color.BLACK);
          }
           else if(me.getSource()== signOutBtn)
          {
             signOutBtn.setBackground(Color.WHITE);
             signOutBtn.setForeground(Color.BLACK);
          }

	}

	public void actionPerformed(ActionEvent ae){
		String command=ae.getActionCommand();

	       if(ae.getSource()==button1)
		{
         EmployeeManagement e1 = new EmployeeManagement();
			e1.setVisible(true);
			this.setVisible(false);

	  }

		  else if(ae.getSource()==button2)
		{
         CustomerManagement c1 = new CustomerManagement();
			c1.setVisible(true);
			this.setVisible(false);

	  }


		else if (ae.getSource()==button3)
		{ 
           TicketManagement t2 = new TicketManagement();
			  t2.setVisible(true);
			  this.setVisible(false);

	  }
		 	

		 else if(ae.getSource()==signOutBtn)
		{
         Login l3 = new Login();
			l3.setVisible(true);
			this.setVisible(false);

	   }
	    
    }
}
