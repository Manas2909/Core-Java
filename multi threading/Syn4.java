//static synchronized block

import java.util.*;

class Bank
{
	static int balance=2000;

	static Scanner s=new Scanner(System.in);

	
	static  void deposit()
	{
		synchronized(Bank.class)
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
	}
	

/*
here atleast one static method of class Bank must be marked as synchronized  only then the class will have a lock associated with it.

here inside the static deposit method we have written a synchronized block. This synchronized block has Bank.class as the parameter.


so it means that if a thread wants to enter this synchronized block, it will need to acquire the classlock of Bank class and for that atleats one static method of Bank must be marked as synchronized.

so here any thread can easily access the deposit method without obtaining the Bank class lock because the deposit method is not entirely synchronized in its definition and we have written a static synchronized block inside so if some statements are above static synchronized block
but insid the noon synchronized static deposit method then any thread without obtaining the class lock can access these statements of deposit above the static synchronized block

*/	
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


