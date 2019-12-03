/*
create 3 thread additon subtraction and multiplication and properly schedule them

*/

import java.util.*;

class Addition extends Thread
{

	public void run()
	{

		System.out.println("\n The name of th currently executing thread is "+Thread.currentThread().getName());

/*
here currentThread() is a predefined static method of Thread class and it returns the instance or the object of the currntly executing thread.

and getName() is a non static member method of Thread class which returns the name of the thread.

so here we are calling the getName() method on the currently executing thread object and so here we get the name of the currently executing thread.

here we habe written the statement Thread.currentThread().getName() in the run() method of class  Addition and so when the run method of the thread created by the class Addition is executing then the currently executing thread will be the addition thread and in this case in the above statement we get the name of the thread created by the Addition class and where the name was set through the public void setName(String str) method of Thread class, where that non static method was called on the thread object representing the addition thread and we passed a string as the argument to the setName method.

in that case the name of the thread returned by the above statement will be the name of the thread set by calling the setName() non static method on the thread object representing the thread for addition.

If we didnt set the name of the thread for addition explicitly by calling the setName() method on the thread class object reprsenting the addition thread, then  the abov statement Thread.currentThread().getName() will return the default name of the currently executing thread i.e in this case the addition thread and this default name is assigned to the thread by the parent thread i.e the main thread.

*/

		Scanner s=new Scanner(System.in);

		System.out.println("\n Enter the nos to be added");

		int no1=0,no2=0;

		if(s.hasNext())
		no1=Integer.parseInt(s.next());


		if(s.hasNext())
		no2=Integer.parseInt(s.next());

		

		int no3=no1+no2;

		System.out.println("\n The  addition is "+no3);

	}

}











class Subtraction implements Runnable
{

	public void run()
	{

		System.out.println("\n The name of th currently executing thread is "+Thread.currentThread().getName());



		Scanner s=new Scanner(System.in);

		System.out.println("\n Enter the nos to be subtracted");

		int no1=0,no2=0;

		if(s.hasNext())
		no1=Integer.parseInt(s.next());


		if(s.hasNext())
		no2=Integer.parseInt(s.next());

		

		int no3=no1-no2;

		System.out.println("\n The  subtraction is "+no3);

	}

}



class Main1
{
	public static void main(String args[ ])throws InterruptedException
	{
		Addition t1=new Addition();

		t1.setName("ADDITION");

/*
here we have set the explicit name of  the thread represented by  t1 as ADDITION using the setName() predefined method of the Thread class and when the currently executing thread is the thread represented  by t1, the name of the thread displayed in the Thread.currentThread().getName() in the body of the run() method of that thread will always be ADDITION.

*/

	Subtraction t2=new Subtraction();

	Thread t3=new Thread(t2);

	t3.setName("SUBTRACTION");

/*
here t2 is the object of class implementing the Runnable interface and there is no method with setName() in Runnable an d so we are passing the t2 into the Thread class constructor and getting object t3 and now we can call setName() on t3 to set the name of the subtraction thread and so when the run method of the thread represented by the class Subtraction is executing then Thread.currentThread().getName() returns the name as "SUBTRACTION"

*/



	t1.start();

	t1.join();		

/*
if we directly call the start method on t1 and t3 then the 2 threads with names ADDITION and SUBTRACTION will run in any random orderand we wont be able to understand the output properly.

here join() is a predefined non static method of Thread class and here we have called join inside the body of the main method and we have called join on the t1 object.

so here the main thread will be joined at the end of t1.

This means that until the thread represented by t1 doesnt enter the dead state till then the main thread wont enter the runnable state and so because the main thread creates other thread the other threads also wont start.


The join() method may cause a compile time exception java.lang.InteruptedException to occur in the body of the main method where it is called and so we must compulsarily handle or declare this checkd exception in the main method else we get a compiler error.


The join()method must be compulsarily called on t1 only after the t1 is started i.e the start() method has been already called on t1 else join has no effect.

*/
		Thread.sleep(3000);

/*
here sleep() is a predefined static method of Thread class and it puts the currently executing thread to sleep or temporarily halt state for the time period mentioned in milli sconds so here the main thread is put to sleep state for 3 seconds because we have called sleep inside the body of the main method and so when the sleep executes the currently executinmg thread will be the main thread

*/	

		t3.start();

		t3.join();
		
		Thread.sleep(2000);

		System.out.println("\n End of the main thread");

	}

}