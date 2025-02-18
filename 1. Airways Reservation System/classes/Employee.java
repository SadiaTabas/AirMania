package classes;
import java.lang.*;
import interfaces.*;

public class Employee
{


	protected String empId;
	protected String name;
	protected double salary;
	
    public Employee(){}
    public Employee(String empId){
    	this.empId = empId;

    }

	public void setEmpId(String empId){
		this.empId = empId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getEmpId(){return empId;} 
	public String getName(){return name;}
	public double getSalary(){return salary;} 
}