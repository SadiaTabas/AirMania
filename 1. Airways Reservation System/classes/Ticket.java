package classes;
import java.lang.*;
import interfaces.*;


public class Ticket extends FlightInfo{

   protected String ticketNo;
   protected int price;
   protected String ticketType;


   public Ticket(){}

   public Ticket(String ticketNo){
   	   this.ticketNo = ticketNo;   
   }
    
 
    
   public void setTicketNo(String ticketNo){
      this.ticketNo = ticketNo;
   }
   public void setPrice(int price){
   	this.price = price;
   }
   public void setTicketType(String ticketType){
   	this.ticketType = ticketType;
   }
   public String getTicketNo(){return ticketNo;}
   public int getPrice(){return price;}
   public String getTicketType(){return ticketType;}

}