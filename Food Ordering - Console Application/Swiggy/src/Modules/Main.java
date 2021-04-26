package Modules;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Customer.initial();
		Employee.initial();
		Location.Initial();
		//Scanner s=new Scanner(System.in);
	
		System.out.println();
		while(true)
		{
			System.out.println("\t\t1.Admin Login\n\t\t2.Employee Login\n\t\t3.Customer Login\n\t\t4.Exit");
			int ch=User.getChoice();
			if(ch==1)
			{
				Admin.login();
			}
			else if(ch==2)
			{
				
				EmployeeLogin.Login();
			}
			else if(ch==3)
			{
				CustomerLogin.Login();
			}
			else 
			{
				System.out.println("\t\t!!!Thank you!!!\n\t\t   Welcome again   ");
				break;
			}
		}
		
	}
}
