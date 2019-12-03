import java.util.*;
class Student
{
	String name;
	int id;
	
	Student(String name1,int id1)
	{
		name=name1;
		id=id1;
	}
	
	public boolean equals(Object o)
	{
		Student s2=(Student)o;
		if((this.id==s2.id)&&(this.name.equalsIgnoreCase(s2.name)==true))
			return true;
		
		else
			return false;
	
			
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public String toString()
	{
		return name+" "+id;
	}
}


class Main1
{
		public static void main(String args[])
		{
			HashSet<Student>hs=new HashSet<Student>();
			Student s1=new Student("abc def",1);

			Student s2=new Student("mno pqr",2);

			Student s3=new Student("aaa bbb",3);

			hs.add(s1);
			hs.add(s2);
			hs.add(s3);

			Student s4=new Student("abc def",1);

			hs.add(s4);
			

		/* it=hs.iterator();
			
			while(it.hasNext())
			{
				Student str=it.next();
				System.out.println(str);
				
			}
	*/
			hs.remove(new Student("abc def",1));

			Iterator<Student> it=hs.iterator();
			
			while(it.hasNext())
			{
				Student str=it.next();
				System.out.println(str);
				
			}
		}
}