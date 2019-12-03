/*
 * Array is collection of elements of same data type and a fixed size. In java an array variable is an aray reference variable
 * and as per rule of java compiler when we declare the array reference variable we never mention the size of the array
 * but when we create the array object using new keyword we mention size of aray.
 * 
 * int arr[]=new int[100];
 * here arr is the 1d array reference variable and it has been assigned the reference to the 1d array object
 * new int[100].
 */
/*
 * write pgm to accept input values into 1d array and display values and sort the array and find sum and average of all odd
 * nos in array
 */
import java.util.*;

public class Pgm1 
{
	int arr1[],n1;
	Scanner sc=new Scanner(System.in);
	
	void acc()
	{
		System.out.println("\n enter no. of elements in 1d array");
		n1=sc.nextInt();
		arr1=new int[n1];
		
		System.out.println("\n enter the "+n1+" number of values in array ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
	}
	
	void display()
	{
		System.out.println("\n The elements in array using normal for loop are ");
		for(int i=0;i<arr1.length;i++)//every 1d array variable of any data type has a predefined non static data member called as length which returns the total number of elements in the array
		{
			System.out.print(arr1[i]+" ");
		}
		
		
		System.out.println("\n The elements in array using  for each loop are ");
		for(int m:arr1)
			System.out.print(m+" ");
		
		/*
		 * the above for loop is new for loop in java called for each loop. It is specially meant for accessing elements
		 * of array and collection. It cannot be used for normal looping pgms like prime or composite.
		 * 
		 * the JVM automatically finds the value of arr1.length in the above for each loop and automatically
		 * executes the for each loop those many no. of times equal to no. of elements in the arr1 array.
		 * 
		 * during each new execution of for each loop, JVM automatically accesses a new next element of the 1d array object
		 * arr1 and assigns it value to m in the title of the for each loop.
		 * 
		 * the for each loop executes faster than normal for loop whbile accessing elements of array.
		 */
		
		
	}
	
	int sum()
	{
		int s=0;
		
		for(int m:arr1)
		{
			if(m%2!=0)
			{
				s=s+m;
			}
			
			
		}
		
		return s;
	}
	
	float average(int s1)
	{
		int cnt=0;
		
		for(int m:arr1)
		{
			if(m%2!=0)
			{
				cnt++;
			}
			
			
		}
		
		return(((float)s1)/cnt);
		
	}
	
	void sort()
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					arr1[i]=arr1[i]+arr1[j];
					arr1[j]=arr1[i]-arr1[j];
					arr1[i]=arr1[i]-arr1[j];
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pgm1 p1=new Pgm1();
		
		p1.acc();
		
		System.out.println("\n Before sorting");
		p1.display();
		
		
		p1.sort();
		
		System.out.println("\n After sorting");
		p1.display();
		
		int s=p1.sum();
		
		float ave=p1.average(s);
		
		System.out.println("\n the sum of all odd values in array is "+s+"\n and their average is "+ave);
		
	}

}
