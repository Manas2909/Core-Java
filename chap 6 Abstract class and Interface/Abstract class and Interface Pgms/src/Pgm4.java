/*
 * interface TeleInformationSystem
 * data members signalfrequency,cabletvname are constant data members of interface
 * member method show() is abstract member method of interface
 * 
 * there is an independent class called Program
 * data member: program name,program sponsor name
 * member method: acc() and display()
 * 
 * there is a class called Broadcast which is direct subclass of interface TeleInformationSystem
 * and of class Program i.e. multiple inheritance
 * data members: broadcast time,date
 * member method:acc() and display() which override the acc() and display() of superclass Program and
 * show() which overrides the show of super interface TeleinformationSystem.
 * 
 *  accept details for multiple programs and display details of those programs whose program sponsor is STAR TV
 *  and whose broadcast time is 5 pm.
 *  
 */

import java.io.*;
import java.util.*;

interface TeleInformationSystem
{
	double signalfrequency=10.5;
	String ctvname="abc def";
	void show();
}

class Program
{
	private String pname,psponsor;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	void acc() throws IOException
	{
		System.out.println("\n Enter program name and program sponsor name");
		pname=br.readLine();
		psponsor=br.readLine();
	}
	
	void display()
	{
		System.out.println("\n Program name is "+pname+"\n Program sponsor name is "+psponsor);
		
	}
	
	String getPSponsor()
	{
		return psponsor;
		
	}
	
	String getPName()
	{
		return pname;
		
	}
}

class Broadcast extends Program implements TeleInformationSystem
{
	private String btime,bdate;
	
	void acc() throws IOException
	{
		super.acc();
		System.out.println("\n Enter program broadcast time and broadcast date");
		btime=br.readLine();
		bdate=br.readLine();
	}
	
	void display()
	{
		super.display();
		System.out.println("\n Program broadcast time is "+btime+"\n Program broadcast date is "+bdate);
		
	}
	
	String getBDate()
	{
		return bdate;
		
	}
	
	String getBTime()
	{
		return btime;
		
	}
	
	public void show()
	{
		System.out.println("\n The cable tv name is "+ctvname+"\n The signal frequency is "+signalfrequency);
	}
	
}
public class Pgm4 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Enter no. of programmes");
		n=sc.nextInt();
		
		Broadcast arr1[]=new Broadcast[n];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=new Broadcast();
			arr1[i].acc();
		}
		
		System.out.println("\n The details of required programs are ");
		Broadcast b1=new Broadcast();
		b1.show();
		for(Broadcast p1:arr1)
		{
			String psponsor=p1.getPSponsor();
			String btime=p1.getBTime();
			
			if((psponsor.equalsIgnoreCase("STAR TV")==true)&&(btime.equalsIgnoreCase("5 pm")==true))
			{
				System.out.println("\n Program name is "+p1.getPName()+"\n Sponsor name is "+p1.getPSponsor()+"\n Broadcast time is "+p1.getBTime()+"\n Broadcast date is "+p1.getBDate());
			}
		}
	}

}
