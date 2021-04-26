package Modules;

import java.util.ArrayList;

public class CustomerLocations {

	int locId;
	String locName;
	int offer;
	CustomerLocations(int locId, String locName, int offers) {
		this.locId=locId;
		this.locName=locName;
		this.offer=offers;
	}
	public static ArrayList<CustomerLocations> initial()
	{
		ArrayList<CustomerLocations> cl=new ArrayList<CustomerLocations>();
		cl.add(new CustomerLocations(0,"A",5));
		cl.add(new CustomerLocations(1,"B",5));
		cl.add(new CustomerLocations(2,"C",5));
		cl.add(new CustomerLocations(3,"D",5));
		cl.add(new CustomerLocations(4,"E",5));
		cl.add(new CustomerLocations(5,"F",5));
		
		return cl;
		
	}
	static void display(Customer c)
	{
		ArrayList<Location> lList=User.getLocationList();
		System.out.println("\n\t\tLocation Details: ");
		System.out.format("%-20s %-20s %-20s %-20s","Hotel Id","Hotel Name","Items Available","Offers in that Hotel");
		System.out.println();
		for(int i=0;i<c.cl.size();i++)
		{
			String st="";
			for(int j=0;j<lList.size();j++)
			{
				if(c.cl.get(i).locId==lList.get(j).locId)
				{
					st=lList.get(j).locName;
				}
			}
			System.out.format("%-20d %-20s %-20s %-20d",c.cl.get(i).locId,c.cl.get(i).locName,st ,c.cl.get(i).offer);
			System.out.println();
		}
	}
	
}
