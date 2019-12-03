package pack2.pgm2;

import java.io.*;
import java.util.Scanner;
public class MyClass2
{
	BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	String str;
	int i;
	public void acc()throws IOException
	{
		System.out.println("\n enter string value");
		str=br.readLine();
		i=sc.nextInt();
	}
	
	public void display() 
	{
		System.out.println("\n string value is "+str+"\n integer va,lue is "+i);
		
	}
}
