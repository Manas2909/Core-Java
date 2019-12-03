//static synchronized method 

import java.util.*;

class Bank
{
	static int balance=2000;

	static Scanner s=new Scanner(System.in);

	
	static synchronized void deposit()
	{
		System.out.println("\n The person currently performing deposit is "+Thread.currentThread().getName());

		System.out.println("\n Enter the amount to be  deposited ");

		int amt=0;

		if(s.hasNext())
		amt=Integer.parseInt(s.next());

		balance=balance+amt;


		System.out.println("\n The current balance is "+balance);

		try
		{
			Thread.sleep(2000);

		}

		catch(InterruptedException e)
		{


		}
		

	}


	synchronized static void withdraw()
	{

		System.out.println("\n The person currently performing withdraw is "+Thread.currentThread().getName());

		System.out.println("\n Enter the amount to be  withdrawn ");

		int amt=0;

		if(s.hasNext())
		amt=Integer.parseInt(s.next());

		if(balance>=0)
		{
			balance=balance-amt;
			System.out.println("\n The current balance is "+balance);
		}

		else
		System.out.println("\nAccount may be  Overdrawn");

		




		try
		{
			Thread.sleep(2000);

		}

		catch(InterruptedException e)
		{


		}




	}


}



class Person1 extends Thread
{
	Bank b=new Bank();

	public void run()
	{
		b.withdraw();

		
		b.deposit();


		b.withdraw();

	}
}









class Person2 extends Thread
{
	Bank b=new Bank();


	public void run()
	{
		b.withdraw();

		
		b.deposit();


		b.withdraw();

	}
}




class Main1
{
	public static void main(String args[ ])
	{
		Person1 t1=new Person1();

		t1.setName("KAVEESH");

		Person2 t2=new Person2();	

		t2.setName("VIVEK");


		

	
		t1.start();

		t2.start();
	}

}


/*
here we have marked the static methods of class Bank as synchronized. When any static method of the class is marked as synchronized then the class has a lock associated with it which is different from the object lock which is created when the non static method of the class is marked as synchronized.


so if a thread wants to enter the static synchronized method, the thread will have to obtain the one and only 1 class lock and if it is freely available then the JVM will hand over the class lock to the thread. At that time if another thread wants to enter the static synchronized method of the same object or the different object of the sameclass, the thread will be blocked until the 1st thread finishes its static synchronized operation and releases the lock automatically to the JVM after which the JVM will choose between the 2 threads as to which to give the lock to.

so in case of static synchronized method the 2 threads dont need to operate on the same object of the class which is having the classlock. Even if the 2 threads operate on the 2 different objects of the same class still they will properly synchronized with each other if they want to access the static synchronizd methods of the class.

If the thread wants to access the other methods of the class apart from the static syunchronized method then the thread can freely do so without acquiring any classlock


so here the 2 person threads are operating on different objects of same class Bank and here the class Bank has  classlock and both the persons are accessing only the static synchronized method of class Bank and so here they will properly synchronize each other.
*/