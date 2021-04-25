package Modules;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Person {
	protected int id;
	protected String name;
	int age;
	protected String password;
	 protected long contact;
	int currentLocation;
	ArrayList<Location> locList;
	PriorityQueue<Order> orderList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
}
