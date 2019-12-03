/*
 * interface Shape
 * member method: peri() is abstract member method of Shape
 * 
 * there is a class called Point
 * data members: x and y representing x and y coordinates of point
 * member method: constructor
 * 
 * there is subclass of Shape called Triangle
 * data member: p1,p2 and p3 of class Point representing endpoints of triangle
 * member method: constructor and peri
 * accept and display perimeters of multiple triangles
 */

import java.util.Scanner;

interface Shape1
{
	void peri();
}

class Point
{
	private int x,y;
	Scanner sc=new Scanner(System.in);
	
	Point()
	{
		System.out.println("\n Enter x:");
		x=sc.nextInt();
		
		
		System.out.println("\n Enter y:");
		y=sc.nextInt();
		
	}
	
	int getX()
	{
		return x;
		
	}
	
	int getY()
	{
		return y;
		
	}
}
class Triangle implements Shape1
{
	Point p1,p2,p3;
	
	Triangle()
	{
		p1=new Point();
		p2=new Point();
		p3=new Point();
	}
	
	public void peri()
	{
		double side1=Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2)+Math.pow(p2.getY()-p1.getY(), 2));
		/*
		 * sqrt() is a static member method of java.lang.Math class and it calculates the
		 * square root of its argument and returns square root in double format.
		 * 
		 * pow() is also a static member method of Math class of java.lang package and 
		 * Math.pow(a,b) returns a raised to b in double format.
		 * 
		 */
		double side2=Math.sqrt(Math.pow(p2.getX()-p3.getX(), 2)+Math.pow(p2.getY()-p3.getY(), 2));
		double side3=Math.sqrt(Math.pow(p3.getX()-p1.getX(), 2)+Math.pow(p3.getY()-p1.getY(), 2));
		
		
		System.out.println("\n The perimeter of triangle is "+(side1+side2+side3));
		//mentioning side1+side2+side3 inside brackets is compulsory in above S.o.p() statement
		//otherwise it is treated as concatenation
		
		
		
	}
}
public class Pgm3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter number of triangles");
		n=sc.nextInt();
		
	Triangle arr1[]=new Triangle[n];
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("\n Enter details of x and y coordinates for each of 3 endpoints of triangle no."+(i+1));
			arr1[i]=new Triangle();
		}
		
	System.out.println("\n\n The perimeters of "+n+" number of triangles are ");
	for(Triangle s1:arr1)//for each loop
		s1.peri();
	
	}

}

