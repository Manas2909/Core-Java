/*
 * * 
 *//*
write a java pgm to accept and display details of employee using class and object

using  Scanner class

*/

import java.util.*;
/*
 * we are going to use many classes of java.io package in this pgm. As per rule of java compiler if the programmer
 * wants to use one or more classes of a package in the java pgm then the programmer will have to import those
 * classes from the corresponding package using import statement at the start of the java pgm.
 * 
 * here import java.io.*, will enable the programmer to use all classes of java.io package in this pgm because
 * * means all classes of that package. This is called implicit import statement where through a single import
 * statement the programmer can use all classes of that package because of using * symbol in that import statement
 * after the package name.
 */
class Employee2
{
	String ename,egender;
	int eid,eage;
	float esalary;

	static String cname;

	Scanner sc=new Scanner(System.in);
	
	void acc()
	{
		System.out.println("\n Enter the employee name:");
		ename=sc.next();
		/*
		 * next() is a non static member method of Scanner class to read string input value from user.
		 * sc.next() returns the input typed by user back into the String format.
		 * but it cannot read space character as part of input.
		 * 
		 * e.g. suppose the user types the employee name input value on output screen as:
		 *  abc def mno
		 *  and then presses Enter key, then sc.next() returns the employee name as "abc" and discards the remaining part of
		 *  the typed input value.
		 * 
		 * the member method i.e. next() of Scanner class doesnt generate any checked exception like IOException so
		 * there is no need to declare any checked exception in the title of method definition in whose body
		 * we have used Scanner class member methods.
		 */
		
		System.out.println("\n Enter the employee id:");
		eid=Integer.parseInt(sc.next());
		/*
		 * Integer is a predefined class of java.lang package which represents the primitive data type int.
		 * All the classes in java.lang package which represent the primitive data types in java are called as wrapper classes.
		 * 
		 * so every primitive data type in java has a fixed wrapper class associated with it.
		 * 
		 * parseInt() is a predefined static member method of Integer class and it converts its string argument to int type.
		 * 
		 * because sc.next() directly returns a string value, so we cannot directly assign sc.next() to the eid variable.
		 * 
		 * so the statement eid=Integer.parseInt(sc.next()) will convert the string value returned by sc.next()
		 * into int type and then assign it to eid.
		 * 
		 */
		
		
		System.out.println("\n Enter the employee age:");
		eage=Integer.parseInt(sc.next());
		
		System.out.println("\n Enter the employee salary:");
		esalary=Float.parseFloat(sc.next());
		
		System.out.println("\n Enter the employee gender:");
		egender=sc.next();
		
		System.out.println("\n Enter the employee company name:");
		cname=sc.next();
		
		
	}


	void display()
	{
		System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

	}

	public static void main(String args[])
	{
		/*
		 * because the main() method is calling the acc() method of class Employee and in the title
		 * of acc() method we have declared the checked exception java.io.IOException, so we need to declare the IOException
		 * in title of main() method else compiler error.
		 * 
		 */
		Employee2 e1=new Employee2();
		e1.acc();
		e1.display();

	}

}