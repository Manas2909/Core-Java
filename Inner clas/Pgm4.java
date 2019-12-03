//anonymous inner class

class School
{
	String sname="symbiosis";

	void display()
	{
		System.out.println("\n The school name is "+sname);

	}

}



class Main1
{

	School s=new School()
		{
			String sname="kaveesh";
			void display()
			{
				super.display();
				System.out.println("\n Inside the anonymous subclass of School "+this.sname+"\n"+super.sname);

			}


	
			void display2()
			{

				System.out.println("\nHelllo");

			}

		};

/*
here we have not created the object of class School.here we have first created dyanamically at runtime the anonymous nameless subclass of class School whose definition is enclosed in the curly braces after new School,() {           }.

The anonymous subclass of class School is loaded in the RAM memory when the above statement is executed and then because we have used the new operator the object of this anonymous subclass of School is created at runtime and assigned to the reference variable s of class School.

so remember we have not created the object of class School.

Instead we have created object of the anonymous subclass of class School and which is the inner class of class Main1.

now this anonymous subclass of class School have overridden the method display of the superclass School.

here inside the main method when we call the display method on the reference variable s of class School, the method display is called of the anonymous subclass of class School because s refers to the object of the anonymous subclass of class School created only after the above statement is executed and because the entire anonymous class definition is  part of 1 statement we have mentioned the semicolon symbol after the class definition.

inside the display methodof the anonymous we have written super.display and this calls the display method of the superclass School of the anonymous subclass.


now the anonymous class contains 1 extra method named display2 which is not defined in class School.

so here if we try to call the  display2 method on the reference variable s of class School we get a compiler error because the java compiler will check whether the method display2 can be called on the reference variable of class School or not and there is no method named display2 in class School, so we get a compiler error if we call the display2 method on reference variable s directly but then if we wanted to call the display2 method we needed to convert s reference variable of class School to the subclas type to which the display2 method belongs through explicit type conversion but here the subclass has no name and so we can never call display2 method on the referenc variable of class School and we can call only those methods of object of anonymos subclass of School which have been either inherited only from School into the anonymous subclass or inherited as well as overridden.

*/

		public static void main(String args [ ])
		{
			Main1 m1=new Main1();

			m1.s.display();

		}

}			 