
//sets using Student as generic type
import java.util.*;
class Student11
{
	String name;
	int id;
	Student11(String name,int id)
	{
		this.name=name;
		this.id=id;
				
	}
	
	public String toString()
	{
		return(name+" "+id);
	}
	
	public boolean equals(Object o)
	{
		Student11 s=(Student11)o;
		
		if(this.id==s.id)
			return true;
		
		else
			return false;
		
		
		
	}
	
	/*
	 * hs
	 * s1		s2
	 * 
	 * s1.equals(s2)
	 */
	
	public int hashCode()
	{
		
		return id;
	}
}
class HashSet2 
{
	public static void main(String args[])
	{
		HashSet<Student11>hs=new HashSet<Student11>();
		
		Student11 s1=new Student11("kaveesh nadkarni",1);
		Student11 s2=new Student11("kaveesh nadkarni",1);
		Student11 s3=new Student11("vivek nadkarni",2);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
	
		System.out.println(hs);
		
		System.out.println("\n the fact that vivek nadkarni with id 2 is present is "+hs.contains(new Student11("vivek nadkarni",2)));
		
	}
}
