
//sorting the array list of students

import java.util.*;

class Student implements Comparable<Student>
{
	String name;
	int id;
	
	Student(String name1,int id1)
	{
		name=name1;
		id=id1;
	}
	
	public String toString()
	{
		return(name+" "+id);
		
	}
	
	public int compareTo(Student s2)
	{
		if(this.id>s2.id)
			return 1;
		
		else if(this.id<s2.id)
			return -1;
		
		else
			return 0;
		
	}
}


/*
 * here we have an array list al with generic type as Student.
 * 
 * if we pass the al object directly to the Collections.sort(), we get a compiler error.
 * 
 * so here we make the generic type Student of the array list al, implement
 * the predefined java.lang.Comparabl interface.
 * 
 * when we make the class Student implement the Comparable interface, we overridee
 * method compareTo(Object o){  }
 * 
 * here we have mentioned the generic type of the Comparable interfa ce while
 * implementing it in the class Student definition as<Student>.
 * 
 * so when we override the abstract method public int compareTo()
 * of the Comparable interface we  dont use th parameter type of the parameter
 * of the  publ;ic int compareTo() method in the class Student as Object
 * type.
 * 
 * means when we are overriding the abstract method compareTo() of the Comparable
 * interface, we dont write:
 * public int compareTo(Object o)
 * {
 * 
 * 
 * }
 * in class Student definition.
 * 
 * but we will write the definition of the compareTo()method sas
 * follows inside thed class Student definition/
 * 
 * 
 * public int compareTo(Student s2)
 * {
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * class Student implements Comparable<Student>
{
	String name;
	int id;
	
	Student(String name1,int id1)
	{
		name=name1;
		id=id1;
	}
	
	public String toString()
	{
		return(name+" "+id);
		
	}
	
	public int compareTo(Student s2)
	{
		if(this.id>s2.id)
			return 1;
		
		else if(this.id<s2.id)
			return -1;
		
		else
			return 0;
		
	}
}

here imagine al is the array list to be sorted. here the generic type of al
is Student.

here we have added say 4 objects of class Student to the array list al.

now in order to sort al, we pass al as the direct argument to Collections.sort()

Collections.sort(al);

here as we know in order to sort al, at a time any 2 elements of al are compared
with each other automatically.

here imagine s1 and s2 objects of class Student are present in array list al.

imagine while comparing s1 with s2, compareTo() method of class Student gets
called on the s1 object of class Student and s2 object of class Student is automatically
passed as argument to the compareTo() method called on s1.

now this meeans that the s2 method of class Student passed as argument to the
compareTo()method of s1 is stored in the parameter s2 reference variable
'of class Student in the title of the compareTo()method where s1 and s2
are the objects of the array list,

now inside the body of the compareTo()method,
if this.id>s2.id
return 1;

means that if the id of the object of class Student on which the compareTo() method
is called is greater than the id of the object of class Student which is passed
as argument to the compareTo() method of the 1st Student object, we have returned
1.

so here if out of the objects of class Student being compared of the array list
al, if the id of the object of al on which compareTo() is called is greater than
the id of the object passed as argument to the compareTo()method called
on the 1st object in al, we have returned 1.

else if the id of the Student object in the array list al on which the compareTo method is called,
is less than the id of the Student object in array list passed as argument to the compareTo()
method called on 1st object, then we have returned -1.

and if both objects of class Student of array list al being compaqred by compareTo()
method automatically by JVM are having the same id, we have returned 0.

so this will ensure that the objects of class Student are arranged in
ascending order of ids.


 */
class Sort2 
{
	public static void main(String args[])
	{
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student("abc def3",11));
		al.add(new Student("abc def2",10));
		al.add(new Student("abc def1",9));

		
		Collections.sort(al);
		
		System.out.println("\n The list after sorting is "+al);
	}
}
