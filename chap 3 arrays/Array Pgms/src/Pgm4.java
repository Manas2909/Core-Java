import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * command line arguments
 * they are those  input arguments passed into a java pgm before the pgm begins execution.
 * so they are passed automatically as elements of 1d array object of String type into the args parameter
 * of main() method of java pgm.
 * 
 * so when we are writing the java pgm using command line arguments as elements of the args array parameter of main() method, we 
 * must assume that the args array already contains elements.
 * 
 */

/*
 * accept and display details of employee using command line arguments
 */

class Employee1
{
	private String ename,egender;
	private int eid,eage;
	private float esalary;

	private String cname;

	
	void acc(String ename,String egender,int eid,int eage,float esalary,String cname)
	{
		this.ename=ename;
		this.egender=egender;
		this.eid=eid;
		this.eage=eage;
		this.esalary=esalary;
		this.cname=cname;
		/*
		 * here thr names off the data members are same as the names of the parameters of the acc() method. so to avoid
		 * ambiguity in minds of JVM, we use the this keyword. 'this' is a predefined reference variable in java
		 * which refers to currently executing object of the class.
		 * 
		 * so the LHS of the above statements represent the data members of class Employee1 or the data members
		 * of that object of class Employee1 on which the acc() method was called.
		 * 
		 * the RHS represents the parameters or local variables of acc() method definition.
		 */
		
	}


	void display()
	{
		System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

	}
	
}

class Main2
{
	public static void main(String[] args) 
	{
		String ename=args[0];
		int eid=Integer.parseInt(args[1]);
		String egender=args[2];
		float esalary=Float.parseFloat(args[3]);
		int eage=Integer.parseInt(args[4]);
		String cname=args[5];
		
		Employee1 e1=new Employee1();
		e1.acc(ename, egender, eid, eage, esalary, cname);
		e1.display();
		
	}
}