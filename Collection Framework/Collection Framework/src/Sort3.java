/*
 * Comparator:
 * 
 * public int compare(Object o1,Object o2)
 * {
 * 		if(o1>o2)
 * 		return 1;
 * 
 * 	
 * 
 * }
 * 
 * 
 * al:
 * s1	s2
 * 
 * 
 */

import java.util.*;

class N1 implements Comparator<Student1>
{
	public int compare(Student1 s1,Student1 s2)
	{
		return(s1.name.compareTo(s2.name));
		
		
	}
}

class Id1 implements Comparator<Student1>
{
	public int compare(Student1 s1,Student1 s2)
	{
		if(s1.id>s2.id)
			return 1;
		
		else if(s1.id<s2.id)
			return -1;
		
		else
			return 0;
		
		
	}
}





class Student1
{
	String name;
	int id;
	
	Student1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return(name+" "+id);
	}
	
	
}

class Sort3 
{
	public static void main(String args[])
	{
		ArrayList<Student1>al=new ArrayList<Student1>();
		al.add(new Student1("kaveesh nadkarni",11));
		al.add(new Student1("kaveesh nadkarni1",9));
		al.add(new Student1("kaveesh nadkarni2",2));
		
		System.out.println("\n the array list before sorting on id"+al);
		
		Id1 i1=new Id1();
		Collections.sort(al,i1);
		
		System.out.println("\n the array list after sorting on id"+al);
		
		int id1=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("\n Enter the id to be searched");
		if(s.hasNext())
			id1=Integer.parseInt(s.next());
		
		Student1 s3=new Student1(null,id1);
		
		
		int flag=Collections.binarySearch(al, s3,i1);
		
		if(flag>=0)
		{
			System.out.println("\n the element is present at index "+flag);
		}
		
		else
			System.out.println("\n the element is not present");
		
		
		
		
		ArrayList<Student1>al1=new ArrayList<Student1>();
		al1.add(new Student1("manoj",11));
		al1.add(new Student1("bikram",9));
		al1.add(new Student1("avinash",2));
		
		System.out.println("\n the array list before sorting on name "+al1);

		
		N1 n=new N1();
		Collections.sort(al1,n);
		
		System.out.println("\n the array list after sorting on name"+al1);
		
	}
}
