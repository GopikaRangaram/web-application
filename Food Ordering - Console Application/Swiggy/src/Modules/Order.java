package Modules;

public class Order {
	Customer cust;
	Location s;
	Location d;
	int fare;
	Order(Customer cust,Location s,Location d,int fare)
	{
		this.cust=cust;
		this.s=s;
		this.d=d;
		this.fare=fare;
	}
}
