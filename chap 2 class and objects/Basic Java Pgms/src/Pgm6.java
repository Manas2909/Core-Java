/*
 * accept a string from user and find total number of vowels and consonents in it and find whether it palindrome or not
 */

import java.io.*;

public class Pgm6 {

	String str;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	void acc()throws IOException
	{
		System.out.println("\n Enter string");
		str=br.readLine();
		
	}
	
	int no_of_Vowels()
	{
		int cntv=0;
		for(int i=0;i<str.length();i++)//length() is a non static member method of String class
		{
			if((str.charAt(i)>=65)&&(str.charAt(i)<=90))//charAt(int index) is a non static member method of String class and returns the character at the paricular index in the string object string value where index counting of string begins from 0 just like array
			{
				if((str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U'))
				{
					cntv++;
				}
			}
			
			else if((str.charAt(i)>=97)&&(str.charAt(i)<=122))//charAt(int index) is a non static member method of String class and returns the character at the paricular index in the string object string value where index counting of string begins from 0 just like array
			{
				if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
				{
					cntv++;
				}
			}
		}
		
		return cntv;
		
	}
	
	int no_of_consonents()
	{
		int cntc=0;
		for(int i=0;i<str.length();i++)//length() is a non static member method of String class
		{
			if((str.charAt(i)>=65)&&(str.charAt(i)<=90))//charAt(int index) is a non static member method of String class and returns the character at the paricular index in the string object string value where index counting of string begins from 0 just like array
			{
				if((str.charAt(i)!='A')&&(str.charAt(i)!='E')&&(str.charAt(i)!='I')&&(str.charAt(i)!='O')&&(str.charAt(i)!='U'))
				{
					cntc++;
				}
			}
			
			else if((str.charAt(i)>=97)&&(str.charAt(i)<=122))//charAt(int index) is a non static member method of String class and returns the character at the paricular index in the string object string value where index counting of string begins from 0 just like array
			{
				if((str.charAt(i)!='a')&&(str.charAt(i)!='e')&&(str.charAt(i)!='i')&&(str.charAt(i)!='o')&&(str.charAt(i)!='u'))
				{
					cntc++;
				}
			}
		}
		
		return cntc;
		
	}
	
	boolean isPalindrome()
	{
		int i,j;
		for( i=0,j=str.length()-1;i<=j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				
				break;
			}
		}
		
		if(i<=j)
			return false;
		
		else
			return true;
		
			
	}
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		Pgm6 p6=new Pgm6();
		p6.acc();
		int cntv=p6.no_of_Vowels();
		int cntc=p6.no_of_consonents();
		
		System.out.println("\n the number of vowels are "+cntv+"\n and no. of consonents are "+cntc);
		
		boolean flag=p6.isPalindrome();
		
		if(flag==true)
			System.out.println("\n entered string is palindrome");
		
		else
			System.out.println("\n entered string is not palindrome");
		
		
		
		
	}

}
