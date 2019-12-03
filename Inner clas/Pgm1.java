/*
inner class:

The inner class is a class which is defined in another class definition.

class School
{
	class Student
	{


	}

}

here Student is the normal non static inner class of School class.

Here we have defined the class Student inside the definition of the outer class School.

The normal non static inner class cannot contain any static members  else we get a compiler error.

here  the class Student is the normal non static inner class of class School and so the class Student cannot contain any static members in itself else we get a compiler error.




class School
{
	class Student
	{
		static int a=3;

	}

}

here we get a compiler error because the member of the normal inner class Student is marked as static.




The normal inner class can directly access the private members of the outer class without any error.


class School
{
	private int a=3;
	class Student
	{
		void acc_data()
		{
			print a;

		}

	}
here we are directly displaying a private data member inside the method acc_data of the normal non static inner class Student and we dont get any compilererror here.
}




We cannot create the object of the normal non static inner class unless we cannot create the object of the normal non static inner class i.e the object of the normal non static inner class is bound to the object of the outer class.




class School
{

	class Student
	{


	}

}

here we cannot create the object of the normal inner class Student unless we create the object of the outer class School and this means that the object of the normal inner class Student is linked or is bound a particular object of the outer class School.




We can use the following keywords or modifiers for the inner class:
private or protected or static or abstract or final or public or default.


The inner class cannot be marked as abstract and final at the same time else we get a compiler error and the same rule applies to the outer class if it is marked as abstract and final at the sametime.

The normal outer class can never  be marked as private or protected or static.



The inner class is different that inheritance because here where Student is the inner class of School,so we cannot access the members of class Student on the object of class School because Student is not the superclass of School and so the exclusive members of Student are not inherited by class School
*/


//normal inner class


class School
{
	String name1="abc def";

	class Student
	{
		String name1="mno pqr";

		void acc_data1()
		{
			System.out.println("\n The school name is "+School.this.name1+"\n the student name is "+name1+"\n the student name again is "+this.name1);

		}

/*
here the non static instance data members of class School and class Student have the same name which is name1.

here if we directly mention name1 inside the method acc_data1 of class Student it will access the name1 data member of class Studen and print value "mno pqr" on screen.

similarly if we use this.name1 inside the normal non static inner class Student here we are accessing again the non static data member of class Student and value mno pqr is displayed.

If we write School.this.name1, we are accessing the non static data member name1 of class School and here "abc def" is displayed on screen.

We use this special syntax for accessing the name1 data member of class School inside the class Student because both the data members of class School as well as class Student have the same name.

If the data members of classes School and its normal inner class Student had different names then we can directly access them by thir name directly inside the normal non static inner class Student

*/

	  } 


	void acc_data2()
	{
		Student s=new Student();
		s.acc_data1();

/*
here acc_data2 is a non static member method of the outer class School.so it has a direct relationship with the object of the class School.

so if we want to execte the acc_data2 method we need to explicitly call it on the object of the outer class School by using the dot operator on that object of class School.

so when the acc_data2 method is executing there is already an object of class School present in RAM memory  with which the non static member method acc_data2 is associated and so we dont need to separately create the object of class School again inside the acc_data2 method to create object of the normal non static inner class because as we know the object of the normal non static inner class Student cannot be created unless the object of the outer class School is created.

hence we can directly create the object of the  normal non static inner class inside the non static member method of the outer class

*/

	}


	public static void main(String args[ ])
	{
		School s=new School();

		s.acc_data2();

		School.Student s1=new School().new Student();
/*
here we are trying to directly create the object of normal inner class inside the static method of the outer class.

but the static method of the outer class doesnt need an object of the outer class School to be executed in the RAM memory.

so when main method is executing there is no object of the class School to which main belongs, which is present in RAM mmeory because main is a static method and belongs to the class School.


so when the main method is executing it is not internally linked to any object of class School and so we cannot use 'this' keyword inside the main statoc method of the class.


so because the main method doesnt need any object for being loaded in the RAM memory, and also  because unless we create the object of the outer class School we cannot create the object of the normal inner class Student and so we need to explicitly create the object of the outer class SChool and on that object we create the object of normal non static inner class Student and also when we declare the reference variable of the normal non static inner class inside the static member method of the outer class School we write the outer class name.inner class name.

here instead of writing new Schol().new Student(), we could have also written s.new Student(), where s is a reference variable of the School class which also refers to the object of class School inside the body of the main method


so if we had written s.newStudent() then we would have sabed heap memory because in the code we have created 2 different objects of class Schoolon heapmemory because we have used the new keyword 2 times.
*/



		s1.acc_data1();




		School2 s2=new School2();
		s2.acc_data3();
	}

}





class School2
{

	void acc_data3()
	{
		School.Student s1=new School().new Student();

		s1.acc_data1();


	}

/*
here acc_data3 is a non static method of class SChool2 and it has no relation with the object of class School which is a separate independent class as compared to School. so the syntax for creatinng the object of the normal non static inner class Student inside the static or non static method of the another class which is not same class School and neither is it an inner class of School, is the above code

*/

}