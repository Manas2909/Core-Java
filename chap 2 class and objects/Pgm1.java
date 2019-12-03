/*
write a java pgm to accept and display details of employee using class and object

using hard coded values

*/


class Employee
{
	String ename,egender;
	int eid,eage;
	float esalary;
/*
the above are the non static data members of class Employee because they are declared inside the class Employee definition without using static keyword. For every new object created of class Employee, there will be a separate copy of the non static data members ename,egender,eid,eage and esalary created in RAM memory.

suppose we create 3 objects of class Employee.

Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();

RAM memory:

e1	e2	e3
ename..............
eid
esalary
eage
egender

so the RAM memory allocation to the non static data members of the class is done by the constructor of the class because the non static data members are always loaded into RAM memory whenever a new object of the class is created.




*/
	static String cname;
/*
the above data member cname is the static data member of class Employee because it is declared inside the class Employee definition using static keyword. For every new object created of class Employee, there will not be a separate copy of the static data members cname created in RAM memory and instead all objects of class Employee will share the same copy of the static data member cname.

suppose we create 3 objects of class Employee.

Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();

RAM memory:

e1	e2	e3

	cname


so the RAM memory allocation to the static data members of the class is not done by the constructor of the class because the static data members are not loaded into RAM memory whenever a new object of the class is created. Instead the static data members of class are loaded into RAM memory at the start of the pgm execution itself when the class to which they belong is being loaded into RAM memory. 
So the static data members of class are stored into the class memory which is shared between different objects of the class and the non static data members of class are stored into the heap memory of the object to which they belong.




*/

	void acc()
	{
		ename="abc def";
		eid=5;
		eage=50;
		esalary=50000;
		egender="male";
		cname="mno pqr";

	}
/*
the above method acc() is non static member method of class Employee.
RULE:
The non static member method of class can directly access both static and non static members of same class. So the above non static member method acc() can directly access the non static data members ename,eid,eage,esalary and egender of same class Employee and can also directly access the static data member cname.

*/


	void display()
	{
		System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

/*
System is a predefined class in java.lang package of java system library.
out is a static data member of System class and out is itself a reference variable of PrintStream class of java.io package where PrintStream class represents the monitor of the system on which our pgm is running.

class System
{
	static PrintStream out=new PrintStream();

}
so when we write System.out we get the object of PrintStream class which represents the monitor.

println() is a predefined non static member method of PrintStream class and so in the statement System.out.println() we are actually calling the println() member method on object of PrintStream class, returned by writing System.out.

System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

here the + operator used in the above System.out.println() statement means string concatenation. so because we have to mention the variable names after double quotes so we need to follow the double quotes by the + operator followed by name of variable.


*/

	}

	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.acc();
		e1.display();

	}
/*
main() is that member method in every java pgm which is automatically called and loaded and executed by JVM at the start of pgm execution as the entry point into the pgm execution.

so for the main() method to be called automatically by JVM we define it as a public and static member method of any class definition of the java pgm.

the args mentioned as a 1d array of String class type is the parameter of the main() method. we can use any variable name to declare the parameter of the main() member method of any java pgm but the parameter of the main() method of every java pgm must be a 1d array variable of String class type.

this 1d array variable of String class type is mentioned as parameter of main() method definition in every java pgm to provide an option to user to be able to pass one or more input arguments into the pgm before the pgm begins execution. These are called as command line arguments.

RULE:
The static member method of a class can never directly access the non static members of same class. so main() being a static member method of class Employee cannot directly access the non static member methods acc() and display() of class Employee. So to access the non static members of a class inside the body of the static member method of same class we need to first create an object of the class and then use the dot operator on the object to access the non static members of the class inside the body of the static member method of the class. So here we have created the object e1 of class Employee and have indirectly accessed the non static member methods acc() and display() of class Employee inside the body of the static member method of class Employee by using the dot operator on the e1 object.



HOW TO RUN PGM ON ECLIPSE:
1. create a workspace folder. Workspace is the folder where we  create the java pgms on eclipse.

2. open eclipse using the path of workspace folder.

3. then create a java project in that workspace folder and then right click on the java project -> New -> Class(in eclipse the Class option means core java pgm)-> give class a name say Pgm1-> then a Pgm1.java pgm is created in that java project of that workspace and a class named class Pgm1 will automatically be created inside it.

Whenever we create any java project on eclipse, there will be 2 subfolders automatically created in that java project one is src and one is bin. All the java pgms created in a java project are automatically stored in the src sub folder of the java project and all the .class files of the classes defined in the java pgms of that java project will be automatically stored in the bin sub folder of that java project.




*/
}