/*
 * * 
 *//*
write a java pgm to accept and display details of employee using class and object

using  Scanner class and BufferedReader class

*/

import java.util.*;


import java.io.*;
class Employee3
{
	String ename,egender;
	int eid,eage;
	float esalary;

	static String cname;

	Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	void acc()throws IOException
	{
		System.out.println("\n Enter the employee name:");
		ename=br.readLine();

		System.out.println("\n Enter the employee id:");
		eid=Integer.parseInt(sc.next());
		
		System.out.println("\n Enter the employee age:");
		eage=Integer.parseInt(sc.next());
		
		System.out.println("\n Enter the employee salary:");
		esalary=Float.parseFloat(sc.next());
		
		System.out.println("\n Enter the employee gender:");
		egender=sc.next();
		
		System.out.println("\n Enter the employee company name:");
		cname=br.readLine();
		
		
	}


	void display()
	{
		System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

	}

	public static void main(String args[])throws IOException
	{
		
		Employee3 e1=new Employee3();
		e1.acc();
		e1.display();

	}

}