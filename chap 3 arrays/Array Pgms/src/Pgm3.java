/*
 * accept details for multiple employees and display details of only those employees whose employee id is
 * between 5 and 50 and whose employee salary is greater than 50000
 */

/*
 * * 
 *//*
write a java pgm to accept and display details of employee using class and object

using  Scanner class and BufferedReader class

*/

import java.util.*;


import java.io.*;
class Employee
{
	private String ename,egender;
	private int eid,eage;
	private float esalary;

	private String cname;

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

	int getId()
	{
		return eid;
	}
	
	float getSalary()
	{
		return esalary;
	}
}

class Main1
{
	public static void main(String args[])throws IOException
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter no. of  employees");
		n=sc.nextInt();
		Employee arr[]=new Employee[n];
		/*
		 * above statement doesnt create n number of objects of class Employee. Instead above statement creates a single
		 * 1d array object of class Employee of n elements where each element value is initially null.
		 * 
		 * so suppose we try to directly access any non static member of class Employee on any element of arr array
		 * after execution of above statement, we get java.lang.NullPointerException.
		 * 
		 */
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Employee();
			arr[i].acc();
		}
		
		/*
		 * in above for loop, we have created n number of objects and stored the references to n objects
		 * in n elements of arr array.
		 *  
		 */
		
		for(Employee e1:arr)
		{
			int id=e1.getId();
			float salary=e1.getSalary();
			
			if(((id>=5)&&(id<=50))&&(salary>=50000))
			e1.display();
		}
		
		
		
	}

}
