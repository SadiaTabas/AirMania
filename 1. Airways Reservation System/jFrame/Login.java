package jFrame;
import classes.*;
import exception.*;
import java.lang.*;      
import javax.swing.*; 
import java.awt.*;      
import java.awt.event.*;  
import static javax.swing.JOptionPane.showMessageDialog;
public class Login extends JFrame implements MouseListener, ActionListener{
	JLabel label1,label2,userLabel,passLabel,success,imgLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton signinBtn,exitBtn;
	JPanel panel;
	Color myColor;
	ImageIcon img;
	public Login(){
		super("AIRWAYS RESERVATION SYSTEM");
		this.setSize(900,554);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		myColor = new Color(31,190,214);
		
		panel=new JPanel(); 
		panel.setLayout(null);
		panel.setBackground(myColor);

		label1=new JLabel("AIRWAYS MANAGEMENT SYSTEM.");
	   label1.setBounds(100,90,300,90);
	   panel.add(label1);
	    

	   userLabel=new JLabel("USER NAME: ");
	   userLabel.setBounds(70,170,150,40);
	   panel.add(userLabel);

	   userTF=new JTextField();
      userTF.setBounds(150,170,150,40);
      panel.add(userTF);

      passLabel=new JLabel("PASSWORD: ");
      passLabel.setBounds(70,220,150,40);     
      panel.add(passLabel);


      passPF=new JPasswordField();
      passPF.setBounds(150,220,150,40);
      passPF.setEchoChar('*');
      panel.add(passPF);

      signinBtn=new JButton("SIGN IN");
      signinBtn.setBounds(140,270,80,30);
      signinBtn.addMouseListener(this);
      signinBtn.addActionListener(this);
      signinBtn.setBackground(Color.WHITE);
      panel.add(signinBtn);


      exitBtn=new JButton("EXIT");
      exitBtn.setBounds(230,270,80,30);
      exitBtn.addMouseListener(this);
      exitBtn.addActionListener(this);
      exitBtn.setBackground(Color.WHITE);
      panel.add(exitBtn);

      img = new ImageIcon("airplane.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,900,554);
		panel.add(imgLabel);

	    this.add(panel);
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){ 

       if(me.getSource()== signinBtn)
          {
             signinBtn.setBackground(Color.PINK);
             signinBtn.setForeground(Color.BLACK);
          }
     
         else if(me.getSource()== exitBtn)
          {
             exitBtn.setBackground(Color.PINK);
             exitBtn.setForeground(Color.BLACK);
          }

	   }
	public void mouseExited(MouseEvent me){

      if(me.getSource()== signinBtn)
          {
             signinBtn.setBackground(Color.WHITE);
             signinBtn.setForeground(Color.BLACK);
          }
     
         else if(me.getSource()== exitBtn)
          {
             exitBtn.setBackground(Color.WHITE);
             exitBtn.setForeground(Color.BLACK);
          }
   	}
	

	public void actionPerformed(ActionEvent ae){
	    
	   if(ae.getSource()==signinBtn)
   	{
		
		String s1=userTF.getText();
		String s2=passPF.getText();

		try{
			if(s2.length()<8){
         throw new PassException();
         }
      }
         catch(PassException p){
         	showMessageDialog(null,p.getMessage());
         }
     
         

		 if((s1.equals("touhidalam") ||s1.equals("sajidsir") || s1.equals("ratifuzzaman")) && s2.equals("admin123"))
        {
             showMessageDialog(null,"LOGIN SUCCESSFUL!");
  
             SecondFrame sf = new SecondFrame();
             sf.setVisible(true);
             this.setVisible(false);

         }

         /*  else if(s2.length()<8){
              
              showMessageDialog(null, "PASSWORD NEEDS TO BE 8 CHARACTER.");
         }
       */  

         else {

            	showMessageDialog(null, "INVALID USERNAME OR PASSWORD.");
            }


	   }

		else if(ae.getSource()==exitBtn)
		{
			System.exit(0);
		}
	}
	
}
