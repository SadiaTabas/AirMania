package jFrame;
import classes.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class TicketManagement extends JFrame implements MouseListener, ActionListener{
    private Ticket tickets[]=new Ticket[100];
    JLabel label1,label2,label3,label4,label5,label6,imgLabel;
    JTextField idTF,typeTF,timeTF,idTF2,idTF3,placeTF;
    JButton backBtn,insertBtn,removeBtn,searchBtn;
    JPanel panel;
    Ticket t;
    Color myColor;
    ImageIcon img;

 public TicketManagement(){

    super("TICKET MANAGEMENT.");
    this.setSize(800,456);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);

   myColor = new Color(31,190,214);
	panel=new JPanel(); 
	panel.setLayout(null);
   panel.setBackground(myColor);

	label1= new JLabel("TICKET NO: ");
	label1.setBounds(50,50,100,40);
    panel.add(label1);

    idTF = new JTextField();
    idTF.setBounds(150,50,100,40);
    panel.add(idTF);

    label2 = new JLabel("FLIGHT TIME: ");
    label2.setBounds(50,100,100,40);
    panel.add(label2);

   timeTF = new JTextField();
    timeTF.setBounds(150,100,100,40);
    panel.add(timeTF);

    label3 = new JLabel("FLIGHT TYPE: ");
    label3.setBounds(50,150,100,40);
    panel.add(label3);
    
    typeTF = new JTextField();
    typeTF.setBounds(150,150,100,40);
    panel.add(typeTF);

    label6 = new JLabel("DESTINATION: ");
    label6.setBounds(50,200,100,40);
    panel.add(label6);

    placeTF = new JTextField();
    placeTF.setBounds(150,200,100,40);
    panel.add(placeTF);
    
    insertBtn = new JButton("BOOK");
   insertBtn.setBounds(150,250,100,30);
   insertBtn.addMouseListener(this);
   insertBtn.addActionListener(this);
   insertBtn.setBackground(Color.WHITE);
    panel.add(insertBtn);
    
    label4 = new JLabel("TICKET NO: ");
    label4.setBounds(280,50,100,40);
    panel.add(label4);
    
    idTF2 = new JTextField();
    idTF2.setBounds(380,50,100,40);
    panel.add(idTF2);

   removeBtn = new JButton("CANCEL");
   removeBtn.setBounds(380,100,100,30);
   removeBtn.addMouseListener(this);
   removeBtn.addActionListener(this);
   removeBtn.setBackground(Color.WHITE);
    panel.add(removeBtn);

   label5 = new JLabel("TICKET NO: ");
   label5.setBounds(280,150,100,40);
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



   public void bookTicket(String id)
   {
      t = new Ticket(id);
      int flag = 0;
      for(int i=0; i<tickets.length; i++)
      {   
         if(tickets[i] == null)
         {
            tickets[i] = t;
            flag = 1;
            break;
         }
      }
      if(flag == 1)
      {
         showMessageDialog(null,"TICKET BOOKED.");
      }
      else
      {
         showMessageDialog(null,"CAN NOT BOOKED TICKET.");
      }
   }

       public void cancelTicket(String id)
   {
      t = new Ticket(id);
      int flag = 0;
      try{
      for(int i=0; i<tickets.length; i++)
      {   
         if(tickets[i].getTicketNo().equals(id))
         {
            tickets[i] = null;
            flag = 1;
            break;
         }
      }
   }
   catch(NullPointerException t1){
      System.out.println("CAN NOT CANCEL RESERVATION/WRONG TICKET ID.");
   }
      if(flag == 1)
      {
         showMessageDialog(null,"RESERVATION CANCELLED.");
      }
      else
      {
         showMessageDialog(null,"CAN NOT CANCEL RESERVATION/WRONG TICKET ID.");
      }
   }

       public void searchTicket(String id)
   {
      t = new Ticket(id);
      int flag = 0;
      try{
      for(int i=0; i<tickets.length; i++)
      {   
         if(tickets[i].getTicketNo().equals(id))
         {
            flag = 1;
            break;
         }
      }
   }
   catch(NullPointerException t1){
      System.out.println("CAN NOT FIND TICKET/WRONG TICKET NUMBER.");
   }
      if(flag == 1)
      {
         showMessageDialog(null,"TICKET FOUND.");
      }
      else
      {
         showMessageDialog(null,"CAN NOT FIND RESERVATION/WRONG TICKET ID.");
      }
   }


   public void mouseClicked(MouseEvent me){}
   public void mousePressed(MouseEvent me){}
   public void mouseReleased(MouseEvent me){}
   public void mouseEntered(MouseEvent me){
      
         if(me.getSource()== insertBtn){
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
         bookTicket(s1);}
         else {showMessageDialog(null,"TICKET NO BOX IS EMPTY.");}  
      }

      else if(ae.getSource()== removeBtn){
       cancelTicket(s2);

     } 

    else if(ae.getSource()== searchBtn){
         searchTicket(s2);

     }   

     else if(ae.getSource()== backBtn){
       
       SecondFrame sf7 = new SecondFrame();
       sf7.setVisible(true);
       this.setVisible(false);
     }
   



   }


 
}
