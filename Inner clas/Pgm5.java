//anonymous inner class

interface School
{
	String sname="symbiosis";

	void display();

}



class Main2
{

	School s=new School()
		{
			String sname="kaveesh";
			public void display()
			{
				
				System.out.println("\n Inside the anonymous implementing class of School "+this.sname+"\n"+School.sname);

			}


	
			void display2()
			{

				System.out.println("\nHelllo");

			}

		};

/*

here we have not created the object of interface School. But we have again at runtime created an anonymous implementing class or subclass of interface School whose definition  ius enclosd in the above statement after new School()  and within the curly brackets {   }

so wehave actually created the object of the anonymous implementing class of interface School and which is again the inner class of Main 1 class

here we must mark the display method in the anonymous implementing class as public because it is overriding the by default public and abstract method of interface School and so by the rules of method overdring the display method in the anonymous implementing class which is the overriding method in that implementing classs must be marked as public else we get a compiler error
and again as discussed above we cannot call the display2 method on s reference variable.
*/

		public static void main(String args [ ])
		{
			Main2 m1=new Main2();

			m1.s.display();

		}

}			 