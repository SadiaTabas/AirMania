package jFrame;
import classes.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class CustomerManagement extends JFrame implements MouseListener, ActionListener{
    private Customer customers[]=new Customer[100];
    JLabel label1,label2,label3,label4,label5,imgLabel;
    JTextField nameTF, idTF, salaryTF,idTF2,idTF3;
    JButton backBtn,insertBtn,removeBtn,searchBtn;
    JPanel panel;
    Customer c;
    Color myColor;
    ImageIcon img;

 public CustomerManagement(){

    super("CUSTOMER MANAGEMENT.");
    this.setSize(800,456);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);

    myColor = new Color(31,190,214);

	panel=new JPanel(); 
	panel.setLayout(null);
   panel.setBackground(myColor);

	label1= new JLabel("NAME: ");
	label1.setBounds(50,50,100,40);
    panel.add(label1);

    nameTF = new JTextField();
    nameTF.setBounds(150,50,100,40);
    panel.add(nameTF);

    label2 = new JLabel("NID: ");
    label2.setBounds(50,100,100,40);
    panel.add(label2);

   idTF = new JTextField();
    idTF.setBounds(150,100,100,40);
    panel.add(idTF);

    label3 = new JLabel("AGE: ");
    label3.setBounds(50,150,100,40);
    panel.add(label3);
    
    salaryTF = new JTextField();
    salaryTF.setBounds(150,150,100,40);
    panel.add(salaryTF);
    
    insertBtn = new JButton("INSERT");
   insertBtn.setBounds(150,200,100,30);
   insertBtn.addMouseListener(this);
   insertBtn.addActionListener(this);
   insertBtn.setBackground(Color.WHITE);
    panel.add(insertBtn);
    
    label4 = new JLabel("NID: ");
    label4.setBounds(315,50,100,40);
    panel.add(label4);
    
    idTF2 = new JTextField();
    idTF2.setBounds(380,50,100,40);
    panel.add(idTF2);

   removeBtn = new JButton("REMOVE");
   removeBtn.setBounds(380,100,100,30);
   removeBtn.addMouseListener(this);
   removeBtn.addActionListener(this);
   removeBtn.setBackground(Color.WHITE);
    panel.add(removeBtn);

   label5 = new JLabel("NID: ");
   label5.setBounds(315,150,100,40);
   panel.add(label5);

    idTF3 = new JTextField();
    idTF3.setBounds(380,150,100,40);
    panel.add(idTF3);

    searchBtn = new JButton("SEARCH");
   searchBtn.setBounds(380,200,100,30);
   searchBtn.addMouseListener(this);
   searchBtn.addActionListener(this);
   searchBtn.setBackground(Color.WHITE);
    panel.add(searchBtn);


    backBtn = new JButton("GO BACK");
    backBtn.setBounds(300,300,150,30);
    backBtn.addMouseListener(this);
    backBtn.addActionListener(this);
    backBtn.setBackground(Color.WHITE);
    panel.add(backBtn);

    img = new ImageIcon("management.jpg");
    imgLabel = new JLabel(img);
    imgLabel.setBounds(0,0,800,456);
    panel.add(imgLabel);

    this.add(panel);

 }



   public void insertCustomer(String nid)
   {
      c = new Customer(nid);
      int flag = 0;
      for(int i=0; i<customers.length; i++)
      {   
         if(customers[i] == null)
         {
            customers[i] = c;
            flag = 1;
            break;
         }
      }

      if(flag == 1)
      {
         showMessageDialog(null,"CUSTOMER INSERTED.");
      }
      else
      {
         showMessageDialog(null,"CAN NOT INSERT CUSTOMER.");
      }
   }

       public void removeCustomer(String nid)
   {
      c = new Customer(nid);
      int flag = 0;
      try{
      for(int i=0; i<customers.length; i++)
      {   
         if(customers[i].getNid().equals(nid))
         {
            customers[i] = null;
            flag = 1;
            break;
         }
      }
   }
   catch(NullPointerException c1){
      System.out.println("CAN NOT REMOVED CUSTOMER/WRONG NID.");
   }
      if(flag == 1)
      {
         showMessageDialog(null,"CUSTOMER REMOVED.");
      }
      else
      {
         showMessageDialog(null,"CAN NOT REMOVE CUSTOMER.");
      }
   }

       public void searchCustomer(String id)
   {
      c = new Customer(id);
      int flag = 0;
      try{
      for(int i=0; i<customers.length; i++)
      {   
         if(customers[i].getNid().equals(id))
         {
            flag = 1;
            break;
         }
      }
   }
   catch(NullPointerException c1){
      System.out.println("CAN NOT FIND CUSTOMER/WRONG NID.");
   }
      if(flag == 1)
      {
         showMessageDialog(null,"CUSTOMER FOUND.");
      }
      else
      {
         showMessageDialog(null,"CAN NOT FIND CUSTOMER/WRONG NID.");
      }
   }


   public void mouseClicked(MouseEvent me){}
   public void mousePressed(MouseEvent me){}
   public void mouseReleased(MouseEvent me){}
   public void mouseEntered(MouseEvent me){
     if(me.getSource()== insertBtn)
          {
             insertBtn.setBackground(Color.PINK);
             insertBtn.setForeground(Color.BLACK);
          }
     
         else if(me.getSource()== removeBtn)
          {
             removeBtn.setBackground(Color.PINK);
             removeBtn.setForeground(Color.BLACK);
          }

           else if(me.getSource()== searchBtn)
          {
             searchBtn.setBackground(Color.PINK);
             searchBtn.setForeground(Color.BLACK);
          }
           else if(me.getSource()==backBtn )
          {
             backBtn.setBackground(Color.PINK);
             backBtn.setForeground(Color.BLACK);
          }

   }
   public void mouseExited(MouseEvent me){

        if(me.getSource()== insertBtn)
          {
             insertBtn.setBackground(Color.WHITE);
             insertBtn.setForeground(Color.BLACK);
          }
     
         else if(me.getSource()== removeBtn)
          {
             removeBtn.setBackground(Color.WHITE);
             removeBtn.setForeground(Color.BLACK);
          }

           else if(me.getSource()== searchBtn)
          {
             searchBtn.setBackground(Color.WHITE);
             searchBtn.setForeground(Color.BLACK);
          }
           else if(me.getSource()==backBtn )
          {
             backBtn.setBackground(Color.WHITE);
             backBtn.setForeground(Color.BLACK);
          }


   }
   public void actionPerformed(ActionEvent ae){

     String s1 = idTF.getText();
     String s2 = idTF2.getText();
     String s3 = idTF3.getText();

     if(ae.getSource()== insertBtn){
      if(s1 != null && !s1.isEmpty()){
         insertCustomer(s1);}
         else {showMessageDialog(null,"NID BOX IS EMPTY.");} 
   }
   

      else if(ae.getSource()== removeBtn){
       removeCustomer(s2);

     } 

    else if(ae.getSource()== searchBtn){
         searchCustomer(s3);

     }   

     else if(ae.getSource()== backBtn){
       
       SecondFrame sf6 = new SecondFrame();
       sf6.setVisible(true);
       this.setVisible(false);
     }
   



   }


 
}
