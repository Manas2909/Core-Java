/*
 * there are 2 predefined classes using which we can accept input values from user.
 * 
 * 1st class is BufferedReader of java.io package.
 * 
 * class System
 * {
 * 
 * 		static InputStream in=new InputStream();
 * 
 * }
 * 
 * when we write System.in, we get the value of InputStream class of java.io package object which represents the standard input device
 * or keyboard on which our pgm is running.
 * 
 * InputStreamReader isr=new InputStreamReader(System.in);
 * here we have passed System.in directly as argument to the constructor of InputStreamReader class and a new object
 * of InputStreamReader class is created whose reference is assigned to reference variable isr.
 * 
 * InputStreamReader isr=new InputStreamReader(System.in);
 * BufferedReader br=new BufferedReader(isr);
 * here we have passed the isr object of InputStreamReader class directly as argument to the constructor of BufferedReader class
 * and so a new object of BufferedReader class is created which is connected indirectly to the keyboard i.e. System.in through
 * the intermediate object of InputStreamReader class.
 * 
 * using the member methods of BufferedReader class we can now read input values from keyboard.
 * 
 *//*
write a java pgm to accept and display details of employee using class and object

using hard coded values

*/

import java.io.*;
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
class Employee1
{
	String ename,egender;
	int eid,eage;
	float esalary;

	static String cname;

	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	void acc()throws IOException
	{
		System.out.println("\n Enter the employee name:");
		ename=br.readLine();
		/*
		 * readLine() is a non static member method of BufferedReader class and it is used to read input value
		 * from the keyboard and returns the value typed by the user on keyboard back into the String format.
		 * 
		 * the readLine() can read all the spaces typed by user in the typed input value.
		 * 
		 * so suppose the user types the employee name during execution of ename=br.readLine() as 
		 * abc def mno
		 * on output screen and then presses ENTER key, then the br.readLine() returns the value as "abc def mno" in string format
		 * i.e. as object of String class and assigns it to ename.
		 * 
		 * RULE:
		 * Whenever we call the readLine() member method of BufferedReader class inside the body of a method definition
		 * then we always need to declare a checked exception called IOException which is also a predefined class in java.io package.
		 * 
		 * Checked exceptions are those exceptions which occur at runtime but the possibility of their occurance is detected
		 * by java compiler at compile itself and as per rule of java compiler if the compiler detects a possibility of
		 * occurance of checked exception inside the body of a method definition during compilation, then it expects the method
		 * definition to have either handled the checked exception isndie its body(using matching try catch block) or declared
		 * the checked exception in its title using throws keyword else compiler error.
		 * 
		 */
		
		System.out.println("\n Enter the employee id:");
		eid=Integer.parseInt(br.readLine());
		/*
		 * Integer is a predefined class of java.lang package which represents the primitive data type int.
		 * All the classes in java.lang package which represent the primitive data types in java are called as wrapper classes.
		 * 
		 * so every primitive data type in java has a fixed wrapper class associated with it.
		 * 
		 * parseInt() is a predefined static member method of Integer class and it converts its string argument to int type.
		 * 
		 * because br.readLine() directly returns a string value, so we cannot directly assign br.readLine() to the eid variable.
		 * 
		 * so the statement eid=Integer.parseInt(br.readLine()) will convert the string value returned by br.readLine()
		 * into int type and then assign it to eid.
		 * 
		 */
		
		
		System.out.println("\n Enter the employee age:");
		eage=Integer.parseInt(br.readLine());
		
		System.out.println("\n Enter the employee salary:");
		esalary=Float.parseFloat(br.readLine());
		
		System.out.println("\n Enter the employee gender:");
		egender=br.readLine();
		
		System.out.println("\n Enter the employee company name:");
		cname=br.readLine();
		
		
	}


	void display()
	{
		System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

	}

	public static void main(String args[])throws IOException
	{
		/*
		 * because the main() method is calling the acc() method of class Employee and in the title
		 * of acc() method we have declared the checked exception java.io.IOException, so we need to declare the IOException
		 * in title of main() method else compiler error.
		 * 
		 */
		Employee1 e1=new Employee1();
		e1.acc();
		e1.display();

	}

}