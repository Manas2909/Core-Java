/*
 * sort the array list whose generic type is Student.
 */
import java.util.*;

class Student implements Comparable<Student>
{
	String name;
	int id;
	
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return(name+" "+id);
	}
	
	public int compareTo(Student s3)
	{
		/*
		 * al:
		 * s1	s2
		 * 
		 * Collections.sort(al);
		 * 
		 */
		
		if(id>s3.id)
		{
			return 1;
		}
		
		else if(id<s3.id)
		{
			return -1;
		}
		
		else
			return 0;
	}
}

class Sort2
{
	public static void main(String args[])
	{
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student("kaveesh nadkarni",11));
		al.add(new Student("kaveesh nadkarni1",9));
		al.add(new Student("kaveesh nadkarni2",2));
		
		System.out.println("\n the array list before sorting "+al);
		
		Collections.sort(al);
		
		System.out.println("\n the array list after sorting "+al);
		
	}
}
