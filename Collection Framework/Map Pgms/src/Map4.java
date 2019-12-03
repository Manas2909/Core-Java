/*
 * Properties
 * Dictionary
 * 
 * Hashtable
 * 
 * Properties
 */

import java.util.*;
import java.io.*;

class Map4 
{
	Properties p1=new Properties();
	
	void opns()throws IOException
	{
		p1.setProperty("name", "kaveesh nadkarni");
		p1.setProperty("age", "29");
		p1.setProperty("occupation", "teacher");
		
		FileOutputStream fos=new FileOutputStream("d:\\sanjay4445.txt");
		p1.store(fos,"   ");
		
		
		fos.close();
		
		Properties p2=new Properties();
		FileInputStream fis=new FileInputStream("d:\\sanjay4445.txt");
		p2.load(fis);
		
		Enumeration e=p2.propertyNames();
		
		
		while(e.hasMoreElements())
		{
			String str=(String)(e.nextElement());
		
			System.out.println("\nProperty name "+str+"\nProperty value="+p2.getProperty(str));
			
		}
	}
	
	public static void main(String args[])throws IOException
	{
		Map4 m1=new Map4();
		m1.opns();
	}
}
