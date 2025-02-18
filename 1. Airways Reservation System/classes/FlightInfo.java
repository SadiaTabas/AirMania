package classes;
import java.lang.*;
import interfaces.*;
public class FlightInfo{

    protected String time;
    protected String date;
    protected int terminalNo;

    public FlightInfo(){}

    public FlightInfo(String time, String date, int terminalNo){

    	this.time = time;
    	this.date = date;
    	this. terminalNo = terminalNo;
    }

    public void setTime(String time){
          this.time = time;
    }

    public void setDate(String date ){
         this.date = date;
    }

    public void setTerminalNo(int terminalNo){
        this.terminalNo = terminalNo;
    }
 
    public String getTime(){return time;}
    public String getDate(){return date;}
    public int getTerminalNo(){return terminalNo;}
     

    
    
}