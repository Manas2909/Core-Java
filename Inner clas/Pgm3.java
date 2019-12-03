//method local inner class

class School
{
	String name="symbiosis";

	void acc_data1()
	{
		final int i=45;
		class Student
		{
			String name="kaveesh nadkarni";
			void acc_data2()
			{
				System.out.println("\n The school name is "+School.this.name+"\n the Student name is "+this.name);

				System.out.println(i);
			}


		}

		Student s6=new Student();
		s6.acc_data2();	
	}
/*
here we have defined the inner class Student inside the body of th acc_data 1 method.

here this inner class Student defined inside the body of a method is called as method local inner class.

The method local inner class cannot be marked as private nor protected nor static nor public.

The local variables of the member method of a class declared inside the body of the method cannot have any access modifier and the only non access modifier for the local variables of the method is final.

so the class Student acts like any local variable of method acc_data1 and so we cannot mark it public or private or protected or static but we can mark them as abstract or final but not both at the same time,else we get a compiler error


here the Schoo.this.name accesss the name data member of the outer class School and the this.name or only name inside the methodlocal inner class Student access the non static data member name of class Student.

If the method in which the method locla inner clas is defined is itself a static member ,method of the outer classm then the method local inner class cannot directly access the non static members of the outer class because it is same as the rule that the static member method of the class cannot directly accss the non static members of the outer class,else compilererror.

We can create the object of the method local inner class only inside the method definition and below the methodlocal inner class definition. If we try to create the object of the method local inner class from anywhere elese we get a compiler error.

here the method local inner class canot directly access the local variables of the method in which they are defined unless the local variable is marked as final and defined as  a constant with fixed value.

This is because the non final local variables are stored on the stack memory for the method definition and the objects are on the heap memory.
*/

	public static void main(String args[ ])
	{
		School s=new School();
		s.acc_data1();

	}
}