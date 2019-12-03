/*
 * superclass:
Vehicle
data members: vehicle name,registration number,service station name,vehicle price

member methods: acc(),display()

there is a subclass of Vehicle called as Bike
data members: discount rate
member methods:acc(),display(),calculate discount

accept details for multiple bikes and display details of those bikes whose registration number is from Pune and whose bike price after applying discount is greater than 50000.


 */
import java.io.*;
import java.util.*;

class Vehicle
{
	private String vname,vregno,ssname;
	private double vprice;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	
	void acc()throws IOException
	{
		System.out.println("\n Enter name of bike");
		vname=br.readLine();
		
		System.out.println("\n Enter registration number of bike");
		vregno=br.readLine();
		
		
		System.out.println("\n Enter service station name of bike");
		ssname=br.readLine();
		
		System.out.println("\n Enter old price of bike before applying discount");
		vprice=sc.nextDouble();
		
		
		
	}
	
	void display()
	{
		System.out.println("\n The bike name is "+vname+"\n the registration number is "+vregno+"\n The service station name is "+ssname);
	}
	
	String getVRegno()
	{
		return vregno;
	}
	
	double getOldPrice()
	{
		return vprice;
	}
}

class Bike extends Vehicle
{
	double disrate,newvprice,discount;
	void acc()throws IOException
	{
		super.acc();
		//calls the overridden acc() method of direct superclass
		
		System.out.println("\n Enter discount rate");
		disrate=sc.nextDouble();
		
		
		
		
	}
	
	void calDiscount()
	{
		discount=(disrate*getOldPrice())/100;
		newvprice=getOldPrice()-discount;
		
		
	}
	
	double getNewVPrice()
	{
		return newvprice;
	}
	
	void display()
	{
		super.display();
		System.out.println("\n Thebike discount is Rs. "+discount+"\n The bike price after applying discount is Rs."+newvprice);
		
	}
	
	
	
}
public class Pgm1 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the number of bikes");
		n=sc.nextInt();
		
		Bike arr[]=new Bike[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=new Bike();
		
			arr[i].acc();
			arr[i].calDiscount();
		}
		
		for(Bike b1:arr)
		{
			String str=b1.getVRegno();
			double newprice=b1.getNewVPrice();
			if((str.contains("MH 12")==true)&&(newprice>=50000))
				b1.display();
		}
	}

}
