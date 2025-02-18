package interfaces;
import java.lang.*;
import classes.*;


public interface IEmployee{


	void insertEmployee(Employee e);
	void removeEmployee(int id );
	void showAllEmployees();
	Employee getEmployee(int empId);
	
}