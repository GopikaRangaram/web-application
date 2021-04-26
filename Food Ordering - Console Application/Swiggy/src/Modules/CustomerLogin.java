package Modules;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CustomerLogin {
	static Scanner s=new Scanner(System.in);
	public static void Login() {
		ArrayList<Customer> cList=User.getCustomerList();
		System.out.println("\n\t\tEnter ur username");
		String name=s.next();
		for(int i=0;i<cList.size();i++)
		{
			if(cList.get(i).name.equals(name)==true)
			{
				System.out.println("\t\tEnter Password");
				String pass=s.next();
				if(pass.equals(cList.get(i).password)==true)
				{
					System.out.println("\n\t\t!!!Customer Login Successfull");
					customerMenu(cList.get(i));
				}
			}
		}
	}
	private static void customerMenu(Customer c) {
		while(true)
		{
			System.out.println("\n\t\t1.Summary\n\t\t2.Order Food\n\t\t3.Change Password\n\t\t4.Logout");
			int choice=User.getChoice();
			if(choice==1)
			{
				Customer.Summary(c);
			}
			else if(choice==2)
			{
				orderFood(c);
			}
			else if(choice==3)
			{
				
			}
			else {
				System.out.println("\n\t\tLogout successfull");
				break;
			}
		}
	}
	private static void orderFood(Customer c) {
		CustomerLocations.display(c);
		while(true)
		{
			System.out.println("\n\n\t\tChoose your Hotel id");
			int id=User.getChoice();
			boolean flag=false;
			int off=0;
			for(int i=0;i<c.cl.size();i++)
			{
				if(c.cl.get(i).locId==id)
				{
					if(c.cl.get(i).offer>0) {
					System.out.println("\n\t!!!50 % Offer Available for u!!");
					 off=1;
					}
					PlaceOrder(c,c.cl.get(i),off);
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("\t\t Hotel Id Not Available");
			}
			else
			{
				break;
			}
			
		}
	}
	private static void PlaceOrder(Customer c, CustomerLocations custLoc,int off) 
	{
		ArrayList<Location> lList=User.getLocationList();
		for(int j=0;j<lList.size();j++)
		{
			if(custLoc.locId==lList.get(j).locId)
			{
				System.out.println("\n\t\tItems Available: \n"+lList.get(j).item);
				System.out.println("\t\tTo confirm order ,Press 1");
				int ch=User.getChoice();
				if(ch==1)
				{
					System.out.println("\n\n\t\tEnter Quantity ");
					int q=s.nextInt();
					Location des = null;
					Location so=null;
					int k;
					for( k=0;k<lList.size();k++)
					{
						if(c.currentLocation==lList.get(k).locId)
						{
							 des=lList.get(k);
						}
						if(custLoc.locId==lList.get(k).locId)
						{
							so=lList.get(k);
						}
					}
					int fare=q*lList.get(j).amount;
					int delivery=Math.abs(des.distance-so.distance);
					fare+=(delivery*10);
					System.out.println(lList.get(j).item +":\n\t\t"+q+"*"+lList.get(j).amount+"+ delivery Charges = "+fare);
					System.out.println("\n\nApplying offer");
					fare/=2;
					System.out.println("fare ="+fare);
					System.out.println("\n\n\t\t1.Proceed to payment\n\t\t2.Cancel order");
					int cho=User.getChoice();
					if(cho==1)
					{
						System.out.println("\n\n1.Cash On Delivery\n2.GooglePay\n3.PhonePe");
						int choi=User.getChoice();
						if(choi==1)
							System.out.println("Order waiting");
						else if(choi==2 ||choi==3) {
							System.out.println("Enter OTP");
							s.nextInt();
							System.out.println("Payment Successfull");
						}
							PriorityQueue<Order> oList=User.orderList;
							oList.add(new Order(c,so,des,fare));
							System.out.println("Order  Placed");
					}	
				}
			}
		}
		
	}
	
}
