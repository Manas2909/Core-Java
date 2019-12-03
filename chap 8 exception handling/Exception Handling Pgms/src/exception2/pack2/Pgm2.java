package exception2.pack2;


/*
write a java pgm to generate your own user defined unchecked exception in such a way 
that the teacher is entering student percentage and we must generate an unchecked exception
suppose the teacher enters user percentage less than 0 or greater than 100.

*/

import java.util.Scanner;


class MarkException extends RuntimeException
{
		MarkException(String str)
		{
			
			super(str);
		}	
}

/*
 * when we want to generate our own user defined unchecked exception we need to define a subclass of java.lang.Exception class in
 * such a way that the user defined subclass of Exception will have a String parameterised constructor and we will
 * be passing the String parameter as argument to the super() call statement inside the body of the constructor.
 * 
 */

class Marks
{
	int nstudents;
	Scanner sc=new Scanner(System.in);
	Marks()
	{
		System.out.println("\n Enter number of students");
		
		nstudents=sc.nextInt();
		int flag=0;
		int arr1[]=new int[nstudents];
		
		System.out.println("\n Enter percentages of "+nstudents+" no. of students ");
		
		for(int i=0;i<arr1.length;i++)
		{
			try
			{
			System.out.println("\n Enter percentage of student no."+(i+1));
			arr1[i]=sc.nextInt();
			if((arr1[i]<0)||(arr1[i]>100))
			{
				MarkException e1=new MarkException("INVALID PERCENTAGE");
				throw e1;
			}
			}
			
			catch (MarkException e)
			{
				// TODO: handle exception
				e.printStackTrace();
				flag=1;
			}
			
			
			finally 
			{
				if(flag==1)
				{
					System.out.println("\n Please reneter percentage of student no."+(i+1));
					i--;
					flag=0;
					
				}
			}
		}
	}
	
	
}

public class Pgm2 
{
	public void generateException() 
	{
		Marks m1=new Marks();
		
					
		
	}
	
}
