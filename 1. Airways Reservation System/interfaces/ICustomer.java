package interfaces;
import java.lang.*;
import classes.*;
public interface ICustomer{


	void insertCustomer(Customer c);
	void removeCustomer(int cid);
	void showAllCustomers();
	Customer getCustomer(int cid);
}