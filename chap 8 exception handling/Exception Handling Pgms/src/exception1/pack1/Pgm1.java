package exception1.pack1;
/*
write a java pgm to generate your own user defined checked exception in such a way that the user defined checked exception must be generated when the person overdraws the money from account

*/

import java.util.Scanner;


class BankException extends Exception
{
		BankException(String str)
		{
			
			super(str);
		}	
}

/*
 * when we want to generate our own user defined checked exception we need to define a subclass of java.lang.Exception class in
 * such a way that the user defined subclass of Exception will have a String parameterised constructor and we will
 * be passing the String parameter as argument to the super() call statement inside the body of the constructor.
 * 
 */

class Account
{
	int balance;
	Scanner sc=new Scanner(System.in);
	Account()
	{
		System.out.println("\n Enter initial balance");
		balance=sc.nextInt();
	}
	
	void deposit()
	{
		System.out.println("\n Enter amount to be deposited");
		int amt=sc.nextInt();
		balance=balance+amt;
		System.out.println("\n Deposit transaction is successful");
	}
	
	void displayBalance()
	{
		System.out.println("\n The current balance is Rs."+balance);
		
	}
	void withdraw()
	{
		int flag=0;
		System.out.println("\n Enter amount to be withdrawn");
		int amt=sc.nextInt();
		try
		{
			balance=balance-amt;
			if(balance<0)
			{
				BankException e1=new BankException("ACCOUNT OVERDRAWN");
				throw e1;
				
			}
			/*
			 * In the statement BankException e1=new BankException("ACCOUNT OVERDRAWN") just a BankException class
			 * object is created and the string argument "Account Overdrawn" is stored inside it as a message, but this
			 * e1 object is still a passive inactive exception object.
				So the statement throw e1, will actually generate an executing checked exception from the object e1
				and so the e1 object is converted from inactive passive state to the executing active state.
				
				After execution of statement throw e1, the control will be exited immediately from the try block
				and the remaining statements in try block are not executed after execution of statement throw e1 and
				then the control will go to the matching catch block where the parameter e of the catch block
				wil catch hold of and store the exception object thrown in the statement throw e1 of the try block.
				
				suppose there was no matching catch block for the e1 object thrown in try block then the execution of the
				withdraw() method would be abrutly terminated and the control along with the exception
				object e1 would be propogated to the calling method and the process continues.
				
				 NOTE:
				 Since e1 object thrown in the try block using throw e1 statement, is a checked exception
				 class object because its class type BankException extends java.lang.Exception class
				 so if there was no matching catch block for the try block mentioned in the withdraw()
				 method, then we would need to atleast declare the checked exception BankException
				 else we would get a compiler error because of the handle or declare rule 
				 of java compiler for checked exceptions.
				 
				 
				
			 */
			
			System.out.println("\n The withdraw transaction is successful");
		}
		
		catch (BankException e)
		{
			// TODO: handle exception
			System.out.println("\nOutput of e.getMessage():"+e.getMessage()+"\nOutput of e.toString():"+e.toString()+"\n\nOutput of e.printStackTrace():");
			/*
			 * e.toString() will return in string format the name of the exception class type followed by colon :
			 * symbol followed by the message describing the exception i.e. the Account Overdrawn
			 * string argument passed to the BankException class constructor.
			 * 
			 * e.getMessage() will return in string format the message describing the exception i.e. the Account Overdrawn
			 * string argument passed to the BankException class constructor.
			 * 
			 */
			e.printStackTrace();
			/*
			 * e.PrintStack() will display the name of the exception class type followed by colon :
			 * symbol followed by the message describing the exception i.e. the Account Overdrawn
			 * string argument passed to the BankException class constructor and on next line
			 * the stack trace of the exception i.e. at which line and in which method definition
			 * did the exception occur, and on next line which method and at which line no. called
			 * the above method where the exception actually occured ..... till at which line
			 * in main method was the method called which directly or indirectly called the method
			 * in which the exception actually occurred.
			 * 
			 */
			
			flag=1;
		}
		
		finally
		{
			if(flag==1)
			{
				balance=balance+amt;
				flag=0;
			}
		}
		/*
		 * as you know the finally block always executes whether an exception occurs in try block or not.
		 * so when the control comes to above finally block, we need to check whether the control
		 * had passed through the catch block earlier before entering the finally block i.e. when 
		 * the control enters finally block we need to first check whether exception of type BankException occurred or not.
		 * 
		 * so suppose the value of flag variable is 1, it meeans that the control first passed
		 * through catch block before entering finally block because we have made the value of flag
		 * variable as 1 inside catch block. And the fact that control has passed through catch block
		 * means the exception of type BankException has occured in the try block and so it means
		 * that the throw e1 statement was executed in the try block which means that the value
		 * of balance has become negative and in that case when value of flag variable is 1
		 * inside finally block we will add the amount withdrawn back to the balance 
		 * to nullify the overdrawing effect and then reinitialise flag variable to 0.
		 * 
		 */
		
	}
}
public class Pgm1 
{
	public void generateException() 
	{
		Account acc=new Account();
		int option=1;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n Enter your choice...1.Deposit 2. Withdraw 3.Display Balance 4. Exit ");
			
			option=sc.nextInt();
			if(option==1)
				acc.deposit();
			
			else if(option==2)
				acc.withdraw();
			
			else if(option==3)
				acc.displayBalance();
			
			else
				break;
			
		}
	}
	
}
