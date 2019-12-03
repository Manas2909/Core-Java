package exception3.pack3;
/*
 * nested try catch
 */

public class Pgm3 
{
	public void nested1()
	{
		int arr1[]= {1,0,2,0,3};
		try
		{
		for(int i=0;i<=5;i++)
		{
			try
			{
				int res=6/arr1[i];
				System.out.println("\n The result of division between 6 and "+arr1[i]+" is "+res);
			}
			catch (ArithmeticException e1) 
			{
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			e2.printStackTrace();
		}
		
		/*
		 * during execution of above for loop, for i=0,i=2 and i=4, the value of arr1[i]
		 * is not 0 so the remainder of the division between 6 and arr1[i] is not 0
		 * in the inner try block and so the statement System.out.println() will be displayed
		 * in the try block because no exception will be generated in the try block 
		 * for i=0,2,4.
		 * 
		 * during execution of above for loop, for i=1,i=3 the value of arr1[i]
		 * is 0 so the remainder of the division between 6 and arr1[i] is 0
		 * in the inner try block and so the statement System.out.println() will not be displayed
		 * in the try block because an ArithmeticException unchecked exception will be generated in the try block 
		 * for i=1,3 in the statement int res=6/arr1[i] and the inner catch block inside the for loop
		 * will catch and handle the ArithmeticException object each time it is generated
		 * for i=1 and i=3.
		 * 
		 * 
		 * When value of i reaches 5, then the arr1[i] in the statement int res=6/arr1[i] in the inner try block
		 * will generate an java.lang.ArrayIndexOutOfBoundsException which cannot be caught by inner catch block
		 * so execution of for loop is also immediately terminated and the control goes to the outer catch block
		 * which will catch and store the exception object and the execution of any remaining statements(if any)
		 * after the outer catch block inside the body of the nested1() method continues normally.
		 * 
		 * 
		 *  
		 */
	}
}
