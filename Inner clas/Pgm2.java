//static inner class
/*
the static inner class is the inner class defined in a class marked with the word static and in case of static inner clas the object of the static inner class is not associated with the object of the outer class and the static inner class behavs like any static member of the outer class and it is linked to the outer class name

The static inner class cannot directly access the non static members of the outer class,else we get a compiler error. This rule is same as the static method of a class cannot directly access the non static members of the same class and can access them only indirectly by creating the object of the class and using the dot operator on the object.


The static inner class can also contain static members
*/

class School
{
	String name1="abc def";

	static class Student
	{
		String name1="mno pqr";

		void acc_data1()
		{
			School s=new School();
			System.out.println("\n The school name is "+s.name1+"\n the student name is "+name1);
		}

/*
here if we want to acces the non static data member name1 inside the static inner class method acc_data1, we cannot write School.this.name because 'this' keyword cannot be used inside the static context, we will get a compile r error.

so we have explicitly created the object of class School inside the non static member method acc_data1 of static inner class Student and then we have accessd the name1 data member of School on that object directly by using the dot operator.

Also if we want to access the name1 non static member of static inner class Student inside the class Student  we again cannot write this.name1 because 'this' can not be used inside the static inner class , but we write only name1
where name1 will access the non static member name of class Student.

*/
	  } 


	void acc_data2()
	{
		Student s=new Student();
		s.acc_data1();

/*

here acc_data2 is a non static member method of the outer class School. The rule in java says that the non static member method of the class scan directly access also the static members of the same class.

here class Student which is marked as the static inner class of the outer class School, behaves like any other static member of class SChool.

so we can directly create the object of the static inner class Student inside the non static member method of the outer class School using the normal syntax.


*/

	}


	public static void main(String args[ ])
	{
		School s=new School();

		s.acc_data2();



		
		Student s4=new Student();
		s4.acc_data1();

/*
here the static member method of the class can directly operate on the static members of  the same class.

here class Student is the static inner class of class School and is like any other static member of class School.

so the main method of class School marked as static can directly operate on the static inner class Student because it is like any static member of class School.

so if we want to create the object of the static inner class inside the static member method of the outer class, we use the normal syntx and create the objec of the static inner class directly.

*/
		School2 s2=new School2();
		s2.acc_data3();
	}

}





class School2
{

	void acc_data3()
	{
		School.Student s1=new School.Student();


/*
here Student is like any other static member of class School and so if we want to access Student outside the class School and within the static or non static method of some other independent class as compard to SChool, then we need to access the Student class by writing the dot operator on  the School class name but remember the object of the static inner clas is not linked or bounded to the object of the outer class School and so to create the object of the static inner class Student we dont need to create the object of the outer class School and so here in above code we have  created only object of static inner class Student but because we aqccess Student by writing the dot operator on the class SChool name like we acess any other static member of the class outside the class, so we have mention the SChool name before the inner class Student name but we have not created object of outer class School when we are outside the class School in some other class, to create the object of the static inner class Student

*/
		s1.acc_data1();


	}


}