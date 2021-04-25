package Modules;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class EmployeeLogin {
	static Scanner s=new Scanner(System.in);
	public static void Login() {
		ArrayList<Employee> eList=User.getEmployeeList();
		System.out.println("\n\t\tEnter ur username");
		String name=s.next();
		for(int i=0;i<eList.size();i++)
		{
			if(eList.get(i).name.equals(name)==true)
			{
				System.out.println("\t\tEnter Password");
				String pass=s.next();
				if(pass.equals(eList.get(i).password)==true)
				{
					System.out.println("\n\t\t!!!Employee Login Successfull");
					employeeMenu(eList.get(i));
				}
			}
		}
	}
	static void employeeMenu(Employee e)
	{
		while(true)
		{
			System.out.println("\n\n\t\t1.Summary\n\t\t2.Awaiting Order\n\t\t3.LogOut");
			int choice=User.getChoice();
			if(choice==1)
			{
				Employee.Summary(e);
			}
			else if(choice==2)
			{
				PriorityQueue<Order> q=Employee.display();
				
				acceptingOrder(e,q);
			}
			else 
			{
				System.out.println("\n\n\t\tLogout Successfull");
				break;
			}
		}
	}
	private static void acceptingOrder(Employee e,PriorityQueue<Order> q) {
		 System.out.println("\n\nPress 1 to accept the Priority order");
		 int n=s.nextInt();
		 {
			 if(n==1)
			 {
				 System.out.println("Order Accepted");
				 Order qHead=q.poll();
				 e.empHist.add(new History(qHead.cust.id,qHead.cust.contact,qHead.s.locName,qHead.d.locName,qHead.fare));
				 ArrayList<Customer> cList=User.getCustomerList();
				 Customer cus=null;
				 for(int i=0;i<cList.size();i++)
				 {
					 if(qHead.cust.id==cList.get(i).id)
					 {
						 cus=cList.get(i);
						 break;
					 }
				 }
				 cus.cusHist.add(new History(cus.id,cus.contact,qHead.s.locName,qHead.d.locName,qHead.fare));
				 for(int i=0;i<cus.cl.size();i++)
				 {
					 if( cus.cl.get(i).locName.equals(qHead.s.locName)==true)
					 {
						 cus.cl.get(i).offer--;
						 break;
					 }
				 }
				 System.out.println("Order Delivered Successfully");
			 }
		 }
		 
	}
	

	

}
