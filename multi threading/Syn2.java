//synchronized block

import java.util.*;

class Bank
{
	int balance=2000;

	Scanner s=new Scanner(System.in);

	
	 void deposit()
	{
		
		System.out.println("\n The person currently performing deposit is "+Thread.currentThread().getName());

		synchronized(this)
		{
		System.out.println("\n Enter the amount to be  deposited by  "+Thread.currentThread().getName());

		int amt=0;

		if(s.hasNext())
		amt=Integer.parseInt(s.next());

		balance=balance+amt;
		

	}	
		System.out.println("\n The current balance is "+balance);

		try
		{
			Thread.sleep(2000);

		}

		catch(InterruptedException e)
		{


		}
		
		
/*
here we have not marked the entire deposit non static method as synchronized. Instead we have marked a the part of the body of the non static method deposit as synchronized.

here the above synchronized block has 'this' as the parameter means that the synchronized block is synchronizing on the currently executing object of class Bank.

so if any thread wants to enter the synchronized block the thread will have to obtain the lock of the currently executing object of class Bank and because there is only 1 object of class Bank created in this pgm, so the thread which wants to enter the synchronizd block above must obtain the lock of the common shared Bank object which the nother thread operates on because that will be the only object of Bank class which is currently executing.

But the other thread can enter the statement in the body of the deposit method which are not in the synchronized block but then when the thread executes the statement outside the synchronized block then again the thread is blocked because it wants to enter the non static synchronized block after the 1st statement in deposit method. so again the thread is blocked until the lock of the common bank object goes to the thread.

here we cannot write synchronizd blocks in both the withdraw or deposit methods because atleast one of the 2 non static methods must be synchronized in the title because if both the non static methods withdraw or deposit are not marked as entirely synchronized and we write a synchronized block in both the methods where none of the 2 methods are synchronized then the synchronized block  on this object wont work because for the currently executing object of class Bank to have a lock atleast one of the non static methods of the Bank class must be marked as  synchronized only then every object of class Bank will have a object lock associated with it
*/
	}


	synchronized void withdraw()
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
	Bank b;

	void getAccount(Bank b1)
	{
		b=b1;

	}

	public void run()
	{
		b.withdraw();

		
		b.deposit();


		b.withdraw();

	}
}









class Person2 extends Thread
{
	Bank b;

	void getAccount(Bank b1)
	{
		b=b1;

	}

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


		Bank b=new Bank();

		t1.getAccount(b);

		t2.getAccount(b);

	
		t1.start();

		t2.start();
	}

}


/*
here imagine the thread t1 is started first whose name is KAVEESH.

Now if any non static method of the class is marked as synchronized where synchronized is a non access modifier in java, then every object of that class will have an internal lock associated with it.

Now if a thread say t1 i.e KAVEESH wants to enter the non static synchronized method withdraw or deposit of the common Bank class object on which it is operating, then in that case the thread KAVEESH will have to obtain the internal lock of the common Bank object.	here the Bank clas object has an internal lock because the non static method of class Bank is marked as synchronized.

here both the withdraw and th deposit methods of the Bank class common object shared bween thrads t1 and t1 is marked as synchronized.


so here t1 calls withdraw method of the common Bank object when t1 is started. now withdraw is a non static synchronized method and so in order to access this method the thread KAVEESH must obtain the internal lock of the common Bank object and if this lock is freely available then JVM automatically hands over the lock to the thread t1 i.e KAVEESH. nOW THE THREAD KAVEESH will be operating on the common Bank object after acquiring its lock by the JVM..
Then  it may happen that KAVEESH thread may suddenly halt and JVM will start t2 i.,e VIVEK thread.

But now because VIVEK wants to call withdraw method as the 1st statements of its run method so because withdraw is non static and synchronized so the JVM will block the VIVEK thread from entering any of the non static and synchronized methods of the common Bank object and also because every object of the class whose  non static method is synchronized has 1 and only 1 lock associated with it and if a thead wants to access the non static synchronized methods on that object the lock of that object should be freely available and then the JVM will hand it over to the thread which can then only access any of the instance and synchronizedmethods on the common Bank object.

But the thread can access other methods except for the non static and synchronized methods on the object without  the object  lock i.e non static and non synchronized, static synchronized and static non synchronized on the same object.

so the thread VIVEK will be blocked till the KAVEESH thread doesnt come out of the withdraw method which non static and synchronized and hand over the lock to the JVM.
Then JVM will choose between the  2 threads KAVEESH and VIVEK that which of the 2 thread can now be handed over the lock of the common Bank object because both threads are trying to access either withdraw or deposit where both are non static and synchronized.

so it may happen that the lock goes to the same threadKAVEESH and he carries out the next deposit instance synchronized operation during which he wont be interfered or it may happen that the lock goes to the thread VIVEK who can now perform his synchronized instance withdrawmethod and at that time the thread VIVEK wont be interfered. but when the particular thread whichever person it may be, performs the non static and synchronized withdraw or deposit operation then the lock is released to the JVM automatically of the common shared Bank object and then the JVM again randomly chooses between the 2 threads that which thread can carry out that synchronized operation on the common account whichn needs the lock of the bank object shared between the 2 threads.


if the thread with the lock of the object is put in the sleep state by calling the sleep method then  in that case the thread  will keep the lock of the object with it till the time period of the sleep gets expired and thread comes out of sleeping state
*/