/*
imagine we are having a bank account.

This bank account in the java pgm is an object of the Bank class.

There are 2 threads which are Person1 and Person2 and both are operating on the same bank account.

so this means that both the threads Person1 and Person2 are operating on the same object of class Bank.

now if the 2 persons are operating on the same object of class Bank, then in that case there may be invalid tranmsactions like invalid display of balance, overdrawing etc if both perform transactions like withdraw or deposit on the same bank account object.

so here when 1 person is performing his withdraw or deposit transactions on the bank account at that time that person must not be interfered by the other thread or other person.

When the person who was earlier operating on the bank account object finishes his 1 transaction, at that time the JVM will choose between person 1 and person 2 as to which of the 2 persons should now operateon the bank account object and then the right to operate on the bank account object is given to one of the persons and again for that particular transaction the person wont be interfered by the other thread and this process will repeat.

so this doesnt mean that we are performing join here because join means that the 1st thread will become dead and then the thread joined at the end of it will start execution from the beginning.

here in this bank case there is a proper synchronization between the threads and in the run method of both threads we have called withdraw and deposit and so the withdraw or deposit of only 1 thread at a time will be performing the transactions on the common shared account but that doesnt mean that 1 thread will perform all this withdraw or deposit transactions on the account and then the other thread will start execution which is the same as join.



but it may happen also that in the synchronization pgms we get same output as performing join because everytime a thread finishes his withdraw or deposit operation on the common shared back account object the JVM may hand over the right to access the object to the same thread again and again  but it is not the case necessarily always.
*/



import java.util.*;

class Bank
{
	int balance=2000;

	Scanner s=new Scanner(System.in);

	
	synchronized void deposit()
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