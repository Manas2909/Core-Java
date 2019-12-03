/*
write a java pgm to accept and display details of employee using class and object

using hard coded values

*/


class Employee
{
	String ename,egender;
	int eid,eage;
	float esalary;

	static String cname;

	void acc()
	{
		ename="abc def";
		eid=5;
		eage=50;
		esalary=50000;
		egender="male";
		cname="mno pqr";

	}


	void display()
	{
		System.out.println("\n The employee name is "+ename+"\n The employee id is "+eid+"\n the employee gender is "+egender+"\n The employee age is "+eage+"\n the employee salary is "+esalary+"\n the employee company name is "+cname);

	}

	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.acc();
		e1.display();

	}

}