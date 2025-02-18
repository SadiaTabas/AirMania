package classes;
import java.lang.*;
import interfaces.*;


public class CustomerEmployeeManagement implements ICustomer, IEmployee{
   private Customer customers[] = new Customer [100];
   private Employee employees[] = new Employee [100];
   public void insertCustomer(Customer c)
   {
      int flag=0;
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
         System.out.println("Customer Inserted");
      }
      else
      {
         System.out.println("Can Not Insert Customer");
      }
   }
   
   public void removeCustomer(int cid)
   {
      int flag = 0;
      for(int i=0; i<customers.length; i++)
      {
         if(customers[i].getId() == cid)
         {
            customers[i] = null;
            flag = 1;
            break;
         }
      }
      if(flag == 1){System.out.println("Customer Removed");}
      else{System.out.println("Can Not Remove Customer.");}
   }

     public void showAllCustomers()
   {
      for(Customer c:customers)
      {
         if(c != null)
         {
            System.out.println("Customer Name: "+ c.getCustomerName());
            System.out.println("Customer Age: "+c.getAge());
            System.out.println("Customer ID: "+ c.getId());
         }
      }
   }
   
   

   public Customer getCustomer(int cid)
   {
      Customer c = null;
      
      for(int i=0; i<customers.length; i++)
      {
         if(customers[i] != null)
         {
            if(customers[i].getId() == cid)
            {
               c = customers[i];
               break;
            }
         }
      }
      if(c != null)
      {
         System.out.println("Customer Found");
      }
      else
      {
         System.out.println("Customer Not Found");
      }
      return c;
   }
   
   
   public void insertEmployee(Employee e)
   {
      int flag = 0;
      for(int i=0; i<employees.length; i++)
      {
         if(employees[i] == null)
         {
            employees[i] = e;
            flag = 1;
            break;
         }
      }
      if(flag == 1)
      {
         System.out.println("Employee Inserted");
      }
      else
      {
         System.out.println("Can Not Insert Employee.");
      }
   }
   
   public void removeEmployee(int id )
   {
      int flag = 0;
      for(int i=0; i<employees.length; i++)
      {
         if(employees[i].getEmpId() == id)
         {
            employees[i] = null;
            flag = 1;
            break;
         }
      }
      if(flag == 1){System.out.println("Employee Removed");}
      else{System.out.println("Can Not Remove Employee");
   }
   }
   public void showAllEmployees()
   {
      for(Employee e:employees)
      {
         if(e != null)
         {
            System.out.println();
            System.out.println("Employee Name: "+ e.getName());
            System.out.println("Employee ID: "+ e.getEmpId());
            System.out.println("Salary: "+ e.getSalary());
            System.out.println();
         }
      }
   }
   public Employee getEmployee(int empId)
   {
      Employee e = null;
      
      for(int i=0; i<employees.length; i++)
      {
         if(employees[i] != null)
         {
            if(employees[i].getEmpId() == empId)
            {
               e = employees[i];
               break;
            }
         }
      }
      if(e != null)
      {
         System.out.println("Employee Found.");
      }
      else
      {
         System.out.println("Employee Not Found.");
      }
      return e;
   }

}