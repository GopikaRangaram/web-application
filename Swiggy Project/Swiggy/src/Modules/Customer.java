package Modules;

import java.util.ArrayList;

public class Customer extends Person {
	ArrayList<CustomerLocations> cl=new ArrayList<CustomerLocations>();
	
	ArrayList<History> cusHist=new ArrayList<History>(); 
	static void Summary(Customer c)
	{
		System.out.println("\n\n\t\tCustomer Details");
		System.out.println("\n\n\tCustomer id = "+c.id);
		System.out.println("\tCustomer Name = "+c.name);
		System.out.println("\tTotal Orders given = "+c.cusHist.size());
		System.out.println("\tCurrent Location = "+c.currentLocation);
		if(c.cusHist.size()>0)
		{
			System.out.format("%-20s %-20s %-20s %-20s %-10s","SOURCE","DESTINATION","EMPLOYEE ID","EMPLOYEE CONTACT","AMOUNT");
			System.out.println();
			for(int i=0;i<c.cusHist.size();i++)
			{
				System.out.format("%-20s %-20s %-20d %-20d %-10d",c.cusHist.get(i).s,c.cusHist.get(i).d,c.cusHist.get(i).id,c.cusHist.get(i).contact,c.cusHist.get(i).f);
				System.out.println();
			}
		}
		else
			System.out.println("\n\t\t!!No details");
	}
	public  Customer(int id, String name, int age, String pass, long contact, int location) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.password=pass;
		this.contact=contact;
		this.currentLocation=location;
		this.cl=CustomerLocations.initial();
		
		ArrayList<CustomerLocations> clist=CustomerLocations.initial();
		this.cl=clist;
		
	}
	static void initial()
	{
		ArrayList<Customer> cList=User.getCustomerList();
		cList.add(new Customer(0,"x",20,"xx",9565,3));
		cList.add(new Customer(1,"y",30,"yy",9423,5));
		cList.add(new Customer(2,"z",25,"zz",4365,1));
		cList.add(new Customer(3,"w",35,"ww",9343,2));
		
	}
	public static void signUp(String name, int a, int c, String p, int l) {
		ArrayList<Customer> cList=User.getCustomerList();
		cList.add(new Customer(cList.get(cList.size()-1).id+1,name,a,p,c,l));
	}
	
	
	
	
}
