package Modules;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class User {
	static ArrayList<Customer> cusList=new ArrayList<Customer>();
	static ArrayList<Employee> empList=new ArrayList<Employee>();
	static ArrayList<Location> locList=new ArrayList<Location>();
	static PriorityQueue<Order> orderList=new PriorityQueue<Order>();
	static Scanner s=new Scanner(System.in);
	static int getChoice()
	{
		System.out.println("Enter ur choice");
		return s.nextInt();
	}
	static ArrayList<Customer> getCustomerList()
	{
		return cusList;
	}
	static ArrayList<Employee> getEmployeeList()
	{
		return empList;
	}
	static ArrayList<Location> getLocationList()
	{
		return locList;
	}
	static PriorityQueue<Order> getQueue()
	{
		return orderList;
	}
	
	
}
