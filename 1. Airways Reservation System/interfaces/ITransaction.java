package interfaces;
import java.lang.*;
import classes.*;

public interface ITransaction{


	public abstract void showDetails();
	double addMoney(double amount);
	double withdraw(double amount);
	double sendMoney(double amount, Account a);


}