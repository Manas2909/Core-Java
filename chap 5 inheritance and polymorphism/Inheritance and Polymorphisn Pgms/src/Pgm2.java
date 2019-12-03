/*
 * superclass Square
 * data member:side1
 * member method: peri()
 * 
 * there is a direct subclass of Square called Rectangle
 * data member:side2
 * member method:peri()
 * 
 * there is a direct subclass of Rectangle called Triangle
 * data member:side3
 * member method: peri()
 * 
 * use side of square as either length or breadth of rectangle and side1 of square and side2 of rectangle as the 2 sides of triangle
 * 
 * 
 * 
 */

import java.util.*;

class Square
{
	private int side1;
	Scanner sc=new Scanner(System.in);
	
	void acc()
	{
		System.out.println("\n enter side of square which is also length of rectangle");
		side1=sc.nextInt();
	}
	
	void peri()
	{
		System.out.println("\n The perimeter of square is "+(4*side1));
	}
	
	int getSide1()
	{
		return side1;
	}
}


class Rectangle extends Square
{
	private int side1,side2;
	Scanner sc=new Scanner(System.in);
	
	void acc()
	{
		super.acc();
		
		side1=getSide1();
		System.out.println("\n enter breadth of rectangle");
		side2=sc.nextInt();
	}
	
	void peri()
	{
		super.peri();
		System.out.println("\n The perimeter of rectangle is "+2*(side1+side2));
	}
	
	int getSide2()
	{
		return side2;
	}
}

class  Triangle extends Rectangle
{
	private int side1,side2,side3;
	Scanner sc=new Scanner(System.in);
	
	void acc()
	{
		super.acc();
		
		side1=getSide1();
		side2=getSide2();
		System.out.println("\n enter 3rd side of triangle");
		side3=sc.nextInt();
	}
	
	void peri()
	{
		super.peri();
		System.out.println("\n The perimeter of triangle is "+(side1+side2+side3));
	}
	

}



public class Pgm2 
{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter number of shapes");
		n=sc.nextInt();
		
		Triangle arr1[]=new Triangle[n];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=new Triangle();
		}
		
		
		for(Triangle t1:arr1)
			t1.peri();
	}

}
