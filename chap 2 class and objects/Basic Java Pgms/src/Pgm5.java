/*
 * pgm to accept a number from user and find the sum of its digits, no. of digits and whether the number is palindrome
 * 
 */

import java.util.*;

public class Pgm5 
{
	int no;
	Scanner sc=new Scanner(System.in);
	
	void acc()
	{
		System.out.println("\n Enter number");
		no=sc.nextInt();
	}
	
	int no_of_Digits()
	{
		int no1=no;
		int cnt=0;
		while(no1!=0)
		{
			no1=no1/10;
			cnt++;
		}
		return cnt;
		
	}
	
	int sum_of_Digits()
	{
		int no1=no;
		int sum=0;
		while(no1!=0)
		{
			sum=sum+(no1%10);
			no1=no1/10;
			
		}
		return sum;
		
	}
	
	boolean palindrome()
	{
		int no1=no;
		int reverse=0;
		
		while(no1!=0)
		{
			reverse=(reverse*10)+(no1%10);
			no1=no1/10;
			
		}
		
		if(reverse==no)
		 return true;
		
		else
			return false;
		
		
	}
	
	public static void main(String[] args) 
	{
		Pgm5 p5=new Pgm5();
		p5.acc();
		int cnt=p5.no_of_Digits();
		int sum=p5.sum_of_Digits();
		boolean flag=p5.palindrome();
		
		System.out.println("\n The total number of digits of entered number is "+cnt+"\n the sum of the digits is "+sum);
		
		if(flag==true)
			System.out.println("\n entered number is palindrome");
		
		
		else
			System.out.println("\n entered number is not palindrome");
		
		
		
	}
}
