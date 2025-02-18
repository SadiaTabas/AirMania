package classes;
import java.lang.*;
import interfaces.*;
import java.util.*;

public class Customer implements ITicket{
     

    protected String customerName;
    protected int age;
    protected  String nid;
    protected Account account;
    private Ticket tickets[] = new Ticket [10];

	public Customer(){}

	public Customer(String nid){

		this.nid = nid;
		
	}

	public void setCustomerName(String customerName){

		this.customerName=customerName;
	}

	public void setAge(int age){
		this.age=age;
	}

	public void setNid(String nid){

		this.nid = nid;
	}
	public  void setAccount(Account account){
		this.account = account;
	}

	public String getCustomerName(){

		return customerName;
	}

	public int getAge(){
		return age;
	}

	public String getNid(){
		return nid;
	}

	public Account getAccount(){
		return account;
	}

	public void BookTicket(Ticket t)
	{
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
			System.out.println("Ticket Booked");
		}
		else
		{
			System.out.println("Can Not Book ticket");
		}
	}
	
	public void cancelTicket(int ticketNumber)
	{
		int flag = 0;
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i].getTicketNo().equals(ticketNumber))
			{
				tickets[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Ticket Cancelled");}
		else{System.out.println("Can Not Cancel Ticket/Ticket Not found.");}
	}

	public void changeReservation(int ticketNumber)
   {
   	  int flag = 0;
      Ticket t1 = null;
      
      for(int i=0; i<tickets.length; i++)
      {
         if(tickets[i] != null)
         {
          	if(tickets[i].getTicketNo().equals(ticketNumber))
            {
               Scanner sc1 = new Scanner(System.in);
          System.out.println("Enter New Time of flight: ");
          String time1 = sc1.next();
          System.out.println("Enter New Date of flight: ");
          String date1 = sc1.next();
          System.out.println("Enter New Terminal No: ");
          int terminal1 = sc1.nextInt();
          System.out.println("Enter New Ticket No: ");
          int number1 = sc1.nextInt();
          System.out.println("Enter New Ticket Price: " );
          int price1 =sc1.nextInt();
          System.out.println("Enter New Ticket Type: ");
          String type1 = sc1.next();
          t1.setTime(time1);
          t1.setDate(date1);
         // t1.setTicketNo(number1);
          t1.setTerminalNo(terminal1);
          t1.setPrice(price1);
          t1.setTicketType(type1);
          t1 = tickets[i];
          flag = 1;
          break;
          }

         }

      if(flag == 1){System.out.println("Reservation Changed");}
      else{System.out.println("Can Not Change Reservation.");}
      }


       }
	}

	
		
