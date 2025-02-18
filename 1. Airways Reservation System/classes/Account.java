package classes;
import java.lang.*;
import interfaces.*;

public class Account implements ITransaction{

	protected int accountNo;
	protected double balance;
	protected String accType; 

	public Account(){}

    public Account(int accountNo, double balance, String accType){

    	this.accountNo = accountNo;
    	this.balance = balance;
    	this.accType = accType;
    }

    public void setAccountNo(int accountNo){

    	this.accountNo = accountNo;
    }
    
    public void setBalance(double balance){
    	this.balance = balance;
    }

    public void setAccType(String AccType){

    	this.accType = accType;
    }

    public int getAccountNo(){
    	
    	return accountNo;
    }

    public double getBalance(){

    	return balance;

    }

    public String getAccType(){

    	return accType;
    }

    public void showDetails(){

    	System.out.println("Account No: "+getAccountNo());
    	System.out.println("Account Balance: "+getBalance());
    	System.out.println("Account Type: "+getAccType() );
    }

        public double addMoney(double amount){
            System.out.println("Previous Balance: "+this.balance);
            System.out.println("Added Amount: "+amount);
        this.balance = balance + amount;
        System.out.println("Current Balance: "+this.balance);
        return balance;
    }

    public double withdraw(double amount){
        System.out.println("Previous Balance: "+this.balance);
        System.out.println("Withdrew Amount: "+ amount);
        this.balance = balance - amount;
        System.out.println("Current Balance: "+this.balance);
        return balance;
    }

     public double sendMoney(double amount,Account a){

          System.out.println("Previous Balance: "+this.balance);
          System.out.println("Transferred Amount: "+amount);
          this.balance = balance -amount;
          a.balance = a.balance + amount;
          System.out.println("Current Balance: "+this.balance );
          return balance;
     }

}