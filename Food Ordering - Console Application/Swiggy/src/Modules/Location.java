package Modules;

import java.util.ArrayList;

public  class Location {
	int locId;
	String locName;
	int distance;
	String item;
	int amount;
	Location(int locId,String locName,int distance,String item,int amount )
	{
		this.locId=locId;
		this.locName=locName;
		this.distance=distance;
		this.item=item;
		this.amount=amount;
	} 
	
	static void Initial()
	{
		ArrayList<Location> lList=User.getLocationList();
		lList.add(new Location(0,"A",0,"Dosai",30));
		lList.add(new Location(1,"B",4,"Briyani",100));
		lList.add(new Location(2,"C",7,"Idiyaapam",20));
		lList.add(new Location(3,"D",10,"Idli",15));
		lList.add(new Location(4,"E",15,"Parotaa",15) );
		lList.add(new Location(5,"F",20,"North Indian Foods",50));
	}

	public static void signUp( String name, int l, String item2,int am) {
		ArrayList<Location> lList=User.getLocationList();
		lList.add(new Location(lList.get(lList.size()-1).locId+1,name,l,item2,am));
		System.out.println("\n\t\tLocation added successfully");
	}
}
