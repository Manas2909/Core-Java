/*
producer consumer problem:

there are 3 methods:
public void wait()throws InterruptedException
public void notify()
public void notifyAll()


These are the 3 methods of the Object class and not exclusively of the Thread class.

But because Thread is by default the subclass of Object so these 3 methods are inherited into the Thread class.

so generally these methods are never called on a thread.

Instead these 3 methods are called by a thread on the object whose lock is with the thread.

so these 3 methods wait,notify and notifyAll() can be called only in the synchronized context and they can be called by a thread only after it obtains the lock of the object.

but if a thread calls these methods on an object without acquiring the lock of the object we get the java.lang.IllegalMonitorStateException class which is a runtime exception in java.









PRODUCER CONSUMER PROBLEM:
The producer and consumer are 2 threads. The producer and consumer operate on the common object of class String1.

The class String1 has 2 methods produce and consume and both ar marked as synchronized and are non static.

so the object of class String1 on which the producer and consumer are operating is having an internal object lock associatd with it.


The producer  thrread calls only the synchronized produce method and the consumer thread calls only the synchronized consume method on the common shared object of class String1.




We use a flag which is an int data m,ember of class String1 to understand whether the producer or the consumer was started first.

This flag has an initial value 0.

When the producer is started first, then it calls the produce method and so in the produce method if the flag value is 0 means the producer is started first and then the flag value is made as 1.


then there is no need for calling the wait and notify methods.

The producer obtains the lock of the shared String1 object and the producer keeps the lock with itself till it appends the characters 0 to 9 to the string to generate a string value 0123456789 in the String1 classobject.

then when producer comes out of the produce method the lock goes to the JVM and JVM gives lock to the consumer and the consumer will display the string value of the common object of class String1 on screen.

so in this case there is no need for calling wait and notify because here synchronization is acheived automatically because the producer was started first and it kept the lock of the STring1 object with itself till its job was done.







If the consumer was started first then the value of flag in the consume method will be 0 and then flag is made 1 inside the consume method.

now the consumer will understand that there is no data in the common object of class String1 to display on screen and so the consumer calls the wait method on the common object and puts itself into an infinite waiting state.

the lock is released to the JVM and th JVM gives the lock to the producer and the producer will append the characters 0 to 9 into the common String1 object and then call the notify() method on that common object so that the notification is sent to the consumer and then  the consumer will come out of wait state and JVM gives the lock of the common object to the consumer and consumer will now display the characters obtained in the common String1 object which were appended by the producer.



*/





class String1
{
	String str=" ";
	int flag=0;


	synchronized void produce()
	{
		if(flag==0)
		{
			System.out.println("\n The producer is started first and has acquired the lock of the common String1 object");

			flag=1;

			try
			{
				Thread.sleep(2500);

			}

			catch(InterruptedException e)
			{


			}


			System.out.println("\n The producer is producing the string 0123456789");

			for(int i=0;i<=9;i++)
			str=str.concat(Integer.toString(i));

/*
here toString()is static method of the wrapper claseses and converts the corresponidng primitive value of that data type passed as the argument into the STring format

*/

			System.out.println("\n The producer has produced the String. Now producer is handing the lock to the consumer");


			try
			{
				Thread.sleep(2500);

			}

			catch(InterruptedException e)
			{


			}

		}

		else if(flag==1)
		{
			System.out.println("\n The Producer has acquired the lock of String1 object");

			
			System.out.println("\n The producer is producing the string 0123456789");

			for(int i=0;i<=9;i++)
			str=str.concat(Integer.toString(i));

			
			try
			{
				Thread.sleep(2500);

			}

			catch(InterruptedException e)
			{


			}

			
			System.out.println("\n Producer has completed its job of producing the string. \n Now notifying the consume");

			try
			{
				Thread.sleep(1500);

			}

			catch(InterruptedException e)
			{


			}

			notify();
				

		}


	}


	synchronized void consume()
	{
			if(flag==0)
			{
				System.out.println("\n Consumer is started first.\n There is no data to consume");
				flag=1;
				System.out.println("\n Consumer putting itself in wait state");

				try
			{
				Thread.sleep(1500);

			}

			catch(InterruptedException e)
			{


			}



				System.out.println("\n lock goes to the producer");


				try
			{
				Thread.sleep(2500);
				wait();

			}

			catch(InterruptedException e)
			{


			}


			System.out.println("\n Consumer out of wait state.");


			try
			{
				Thread.sleep(1000);

			}

			catch(InterruptedException e)
			{


			}

			System.out.println("\n The consumer has obtained the lock of the common String1 class object and the consumed string is "+str);
			}


			else if(flag==1)
			{
				System.out.println("\n The consumer has obtained the lock of the common String1 object from the producer");

				try
			{
				Thread.sleep(2500);

			}

			catch(InterruptedException e)
			{


			}



			System.out.println("\n The consumed string is "+str);




		}

	}
}



class Producer extends Thread
{
	String1 str;
	void getString(String1 str1)
	{
		str=str1;	
	}

	public void run()
	{

		str.produce();

	}

}







class Consumer extends Thread
{
	String1 str;
	void getString(String1 str1)
	{
		str=str1;	
	}

	public void run()
	{

		str.consume();

	}

}






class Main1
{
	public static void main(String args[ ])
	{
		Producer t1=new Producer();


		Consumer t2=new Consumer();	

		String1 s=new String1();

		t1.getString(s);

		t2.getString(s);
		

	
		t2.start();

		t1.start();
	}

}




//if the producer doesnt call notify then the consumer will be in indefinite //wait state and this is called as deadlock


