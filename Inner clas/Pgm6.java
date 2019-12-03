//argument defined anonymous inner class
/*
here we are having an interface School.

There is no class defined in the pgm implementing the interface School.

there is a method named display11 accepting as parameter the reference variable of the School clas.


so here when we are calling the display11 method, b ecause we are not having ane explicitly class explicitly implementing the interface School using implements keyword and we cannot use the new keyword directly on the interface name, we when we are calling the display11method we pass the object of the anonymous implementing class of interface School, as the argument to the display11 method using the same code we saw for the previous pgm of anonymous implementing subclass.

*/

interface School
{
	String sname="abc";	

	void display();

}



class Main3
{
	void display11(School k)
	{
		k.display();
/*
k.display() calls the display method of the argument defined anonymous implementing class of School interface where this object is passd as the argument to the display11 method which is called inside the display4 method
*/

	}


		void display4()
		{

			display11(new School()
				{
				String sname="kaveesh";
				public void display()
				{
				
				System.out.println("\n Inside the arrgument defined anonymous implementing class of School "+this.sname+"\n"+School.sname);
		
				}


	
			void display2()
			{

				System.out.println("\nHelllo");

			}

			});
	
		}

		public static void main(String args [ ])
		{
			Main3 m1=new Main3();

			m1.display4();
			

		}

}			 