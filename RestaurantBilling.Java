package ThursdayLabAssigment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import collectionframework.Employee;

public class Restaurant2ndMain {

	public static void main(String[] args) {
		HashMap<Integer,Restaurant2nd> resMap=new HashMap<Integer,Restaurant2nd>();
		resMap.put(1,new Restaurant2nd("VEG-CHAWMIN ",60));
		resMap.put(2,new Restaurant2nd("EGG-CHAW ",80));
		resMap.put(3,new Restaurant2nd("MOMO ",100));
		resMap.put(4,new Restaurant2nd("BIRIYANI ",400));
		System.out.println("Welcome to Bhuter Raja Dilo Bor");
		System.out.println("======================================");
		System.out.println("Menu");
		System.out.println("========================");
		System.out.println("Items *** Price");
		// display
		Set<Map.Entry<Integer,Restaurant2nd>> rest=resMap.entrySet();
    	for(Map.Entry re:rest)
    	{
    		Restaurant2nd restu=(Restaurant2nd) re.getValue();
    		System.out.println(re.getKey());
    		restu.display();
    	}
        System.out.println("======================");
        Scanner sc = new Scanner(System.in);
        char ch;
        int id;
		do {
			System.out.println("Please enter food id:");
			id = sc.nextInt();
			switch(id)
			{
			case 1:
				Restaurant2nd restu = (Restaurant2nd) resMap.get(1);
				RestaurantBilling.callOrder(restu.getF_name(), restu.getPrice());
				break;
			
			case 2:
				Restaurant2nd restu1 = (Restaurant2nd) resMap.get(2);
				RestaurantBilling.callOrder(restu1.getF_name(), restu1.getPrice());
				break;
				
			case 3:
				Restaurant2nd restu3 = (Restaurant2nd) resMap.get(3);
				RestaurantBilling.callOrder(restu3.getF_name(), restu3.getPrice());
				break;
				
			case 4:
				Restaurant2nd restu4 = (Restaurant2nd) resMap.get(4);
				RestaurantBilling.callOrder(restu4.getF_name(), restu4.getPrice());
				break;
			default:
				System.out.println("Sorry This Item is Not Available!!" 
						+ " PLEASE ENTER RIGHT NUMBER......");
			}
			RestaurantBilling.cont();
			
		}
		while(true);
	}

}

public class Restaurant2nd {
float price;
String f_name;
public Restaurant2nd(String f_name, float price) {
	super();
	this.price = price;
	this.f_name = f_name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getF_name() {
	return f_name;
}
public void setF_name(String f_name) {
	this.f_name = f_name;
	
}
public void display()
{
	System.out.println(getF_name()+" "+getPrice());
}

}


import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantBilling {
static ArrayList<Restaurant2nd> list=new ArrayList<Restaurant2nd>();
static Scanner sc=new Scanner(System.in);
static void callOrder(String f_name,float price)
{
	System.out.println(f_name+"Enter Quantity : ");
	float q=sc.nextFloat();
			list.add(new Restaurant2nd(f_name,price*q));
		}
		
		static void totalRestaurantBill()
		{
			System.out.println("total Restaurant Bill");
			System.out.println("============================");
			float total = (float) 0.0;
			for(Restaurant2nd rt: list)
			{
				System.out.println(rt.f_name+"  "+rt.price);
				total += rt.price;
			}
			
			System.out.println("Amount : "+total);
			float gst = (float) (total*0.05);
			System.out.println("GST(5%) : "+gst);
			float ftotal= total+gst;
			System.out.println("Total : "+ftotal);
		}
		
		static void cont()
		{
			System.out.println("\nDo you want to continue? y/n");
			char ch = sc.next().charAt(0); //taking the next character
			if(ch!='y') //if the char is not y or is n then the loop gets run 
			{
				System.out.println();
				totalRestaurantBill(); //we get the bill
				System.exit(0); //exit
			}
			System.out.println();
		}
		
		}