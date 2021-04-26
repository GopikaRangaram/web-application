package Modules;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Employee extends Person {
	ArrayList<History> empHist=new ArrayList<History>(); 
	static void Summary(Employee e)
	{
		System.out.println("\n\n\t\tEmployee Details");
		System.out.println("\n\n\tEmployee id = "+e.id);
		System.out.println("\tEmployee Name = "+e.name);
		System.out.println("\tTotal Orders taken = "+e.empHist.size());
		System.out.println("\tCurrent Location = "+e.currentLocation);
		if(e.empHist.size()>0) {
			System.out.format("%-20s %-20s %-20s %20s %-10s","SOURCE","DESTINATION","CUSTOMER ID","CUSTOMER CONTACT","AMOUNT");
			System.out.println();
			for(int i=0;i<e.empHist.size();i++)
			{
				System.out.format("%-20s %-20s %-20d %-20d %-10d",e.empHist.get(i).s,e.empHist.get(i).d,e.empHist.get(i).id,e.empHist.get(i).contact,e.empHist.get(i).f);
				System.out.println();
			}
		}
		else
			System.out.println("\n\n\t\tNo details");
	}
	 Employee(int id, String name, int age, String pass, int contact) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.password=pass;
		this.contact=contact;
	}
	static void initial()
	{
		ArrayList<Employee> eList=User.getEmployeeList();
		eList.add(new Employee(0,"aa",30,"11",93565));
		eList.add(new Employee(1,"bb",40,"22",42123));
		eList.add(new Employee(2,"cc",35,"33",67321));
		eList.add(new Employee(3,"dd",25,"44",43456));
	}
	static void signUp(String name,int age,int con,String pass)
	{
		ArrayList<Employee> eList=User.getEmployeeList();
		eList.add(new Employee(eList.get(eList.size()-1).id+1,name,age,pass,con));
		System.out.println("\n\n\t\t!!!Employee added successfully");
	}
	public static PriorityQueue<Order> display() {
		 PriorityQueue<Order> queue=User.getQueue();
		 System.out.println("Orders in Queue");
		 System.out.format("%-20s %-20s %-20s %-20s %-10s","Customer Id","Customer Contact","Source","Destination","Fare");
		 System.out.println();
		 for(Order i:queue)
		 {
			 System.out.format("%-20d %-20s %-20s %-20s %-10d",i.cust.id,i.cust.contact,i.s.locName,i.d.locName,i.fare);
			 System.out.println();
		 }
		 return queue;
		
	}
	
}
