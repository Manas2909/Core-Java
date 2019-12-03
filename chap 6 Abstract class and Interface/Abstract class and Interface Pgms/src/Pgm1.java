/*
pgm 1

interface Shape
member method: area() which is abstract

there is a subclass of interface Shape called Square.
member method: constructor and area
accept sides for multiple squares and calculate their areas


*/

import java.util.*;

interface Shape
{
	void area();
}

class Square implements Shape
{
	int side;
	Scanner sc=new Scanner(System.in);
	Square()
	{
		System.out.println("\n Enter side of square");
		side=sc.nextInt();
		
	}
	
	public void area()
	{
		System.out.println("\n The area of square is "+((4*side)));
	}
}
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter number of squares");
		n=sc.nextInt();
		
		Square arr1[]=new Square[n];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=new Square();
		}
		
	System.out.println("\n\n The areas of "+n+" number of squares are ");
	for(Square s1:arr1)//for each loop
		s1.area();
	
	}

}
