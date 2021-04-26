package Modules;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	 final static String Username="ADMIN";
	 final static String Password="ADMIN";
	 static Scanner s=new Scanner(System.in);
	static void login()
	{
		System.out.println("Enter Admin username");
		String name=s.next();
		if(name.equals(Username)==true)
		{
			System.out.println("Enter Admin Password");
			String pass=s.next();
			if(pass.equals(Password)==true)
			{
				System.out.println("\t\t!!!Admin Login Successful!!!");
				adminMenu();
			}
		}
		else
		{
			System.out.println("Admin UserName Wrong");
		}		
	}
	private static void adminMenu() {
		while(true)
		{
			System.out.println("\n\n\t\t1.Employee Summary\n\t\t2.Customer Summary\n\t\t3.Add New Employee\n\t\t4.Add New Location\n\t\t5.LogOut");
			int ch=User.getChoice();
			if(ch==1)
			{
				System.out.println("Enter id");
				int id=s.nextInt();
				ArrayList<Employee> eList=User.getEmployeeList();
				boolean flag=false;
				for(int i=0;i<eList.size();i++)
				{
					if(eList.get(i).id==id)
					{
						Employee.Summary(eList.get(i));
						flag=true;
					}
				}
				if(flag==false)
					System.out.println("\n\n\t\tEmployee id not found");
				
			}
			else if(ch==2)
			{
				System.out.println("Enter id");
				int id=s.nextInt();
				ArrayList<Customer> cList=User.getCustomerList();
				boolean flag=false;
				for(int i=0;i<cList.size();i++)
				{
					if(cList.get(i).id==id)
					{
						Customer.Summary(cList.get(i));
						flag=true;
					}
				}
				if(flag==false)
					System.out.println("\n\n\t\t Customer id not found");
			}
			else if(ch==3)
			{
				System.out.println("Enter a name");
				String name=s.next();
				System.out.println("Enter age");
				int a=s.nextInt();
				System.out.println("Enter contact No");
				int c=s.nextInt();
				System.out.println("Enter a password");
				String p=s.next();
				Employee.signUp(name,a,c,p);
			}
			else if(ch==4)
			{
				System.out.println("Enter a Hotel Name");
				String name=s.next();
				
				System.out.println("Enter  distance from the origin");
				int l=s.nextInt();
				System.out.println("Enter the item available");
				String item=s.next();
				System.out.println("Enter  amount for the item");
				int am=s.nextInt();
				Location.signUp(name,l,item,am);
			}
			else 
			{
				System.out.println("\n\t\t!!!Admin Logout Successfull!!!");
				break;
			}
		}
	}
}
