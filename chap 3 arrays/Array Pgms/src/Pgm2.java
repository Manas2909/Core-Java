/*
 * accept and display elements in 2d array and find the transpose of the 2d array
 */

import java.util.*;
public class Pgm2 
{
	int rows1,cols1;
	int arr1[][];
	/*
	 * arr1 is the 2d array reference variable and as per rule of java compiler when we declare the 2d array reference variable
	 * we never mention the number of rows and columns but when we create the 2d array object using new keyword 
	 * we mention no. of rows and columns
	 */
	Scanner sc=new Scanner(System.in);
	void acc()
	{
		System.out.println("\n enter number of rows and columns of 2d array");
		rows1=sc.nextInt();
		cols1=sc.nextInt();
		
		arr1=new int[rows1][cols1];
		
		System.out.println("\n Enter the values in the 2d array of number of rows "+rows1+" and number of columns "+cols1);
		
		for(int i=0;i<arr1.length;i++)//arr1.length returns the total no. of rows of the 2d array object referred to by arr1
		{
			for(int j=0;j<arr1[i].length;j++)//arr1[i].length returns the total no. of columns in the row i of 2d array arr1
			{
				arr1[i][j]=sc.nextInt();
				
			}
		}
	}
	
	void display()
	{
		
		System.out.println("\nthe values in the 2d array of number of rows "+rows1+" and number of columns "+cols1+" using normak for loop are ");
		
		for(int i=0;i<arr1.length;i++)//arr1.length returns the total no. of rows of the 2d array object referred to by arr1
		{
			System.out.println();//so that every new row is displayed on new line in matrix format
			for(int j=0;j<arr1[i].length;j++)//arr1[i].length returns the total no. of columns in the row i of 2d array arr1
			{
			 System.out.print(arr1[i][j]+"  ");//keeping some spaces between 2 diff. columns of same row
				
			}
		}
		
		
System.out.println("\nthe values in the 2d array of number of rows "+rows1+" and number of columns "+cols1+" using  for each loop are ");
		
		for(int a[]:arr1)//every new row of arr1 is automatically assigned to the 'a' 1d array variable in title of outer for each loop
		{
			System.out.println();//so that every new row is displayed on new line in matrix format
			for(int j:a)//every new element or column value of the current row of arr1 assigned to 'a' 1d array variable, is assigned one by one to j variable declared as a normal int variable in title of outer for each loop
			{
			 System.out.print(j+"  ");//keeping some spaces between 2 diff. columns of same row
				
			}
		}
		
		
		
	}
	
	void transpose()
	{
		int arr3[][]=new int[cols1][rows1];
		
		System.out.println("\n Transpose is ");
	
		for(int i=0;i<cols1;i++)//arr1.length returns the total no. of rows of the 2d array object referred to by arr1
		{
			System.out.println();//so that every new row is displayed on new line in matrix format
			for(int j=0;j<rows1;j++)//arr1[i].length returns the total no. of columns in the row i of 2d array arr1
			{
				arr3[i][j]=arr1[j][i];
			 System.out.print(arr3[i][j]+"  ");//keeping some spaces between 2 diff. columns of same row
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pgm2 p2=new Pgm2();
p2.acc();
p2.display();
p2.transpose();

	}

}
