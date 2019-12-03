import java.io.*;
/*

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



here to sort the array list al using the Comparable interface we need to compulsarily
make the generic type of the array list al implement the Comparable interface.


so here we make the class Student which is the generic type of array list al
implement the Comparable interface and then  we override its public int compareTo()
method and write our logic fo comparing any 2 objects of array list al inside the
body of the compareTo()method.

now so because of this we cannot sort the same array list al on multiple
attributes like id,marks,name etc in the same java pgm using the Comparable
interface.

so here we have sorted the array list al based on id of the objects of al,
by writing the logic in the compareTo() method in class Student which is the 
generic type of al.

so now if we want to sort the array list al based on name or on marks etc ,
we will need to write a separate pgm for that using the Comparable interface
and write the different logic in the body of the compareTo() method in the
class Student for comparing the Student objects of array list based on name
or marke etc.

so in the same java pgm we cannot sort the same array list al based on multiple
attributes.
'

we now use another predefined interface if the java.util package called as
Comparator interface.


In case of the Comparator interface it contains actually 2 abstract methids
in itself.

public int compare(Object o1,Object o2);

public boolean equals(Object o);


here the above abstract method equals of the Comparator interface has already
been overridden by the predefined java.lang.Object class because Object class
is the by defaultsuperclass of every class in java.

so when we implement the Comparatpr interface we need to override compulsarily
only 1 abstract method of it which is the public int compare(Object o1,Object o2).
wedont need to override equals because that has bene done already by Object class.

*/

import java.util.*;



class Student1
{
	String name;
	int id;
	
	Student1(String name1,int id1)
	{
		name=name1;
		id=id1;
	}
	
	public String toString()
	{
		return(name+" "+id);
		
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



class Name1 implements Comparator<Student1>
{
	public int compare(Student1 s1,Student1 s2)
	{
		if(s1.name.compareToIgnoreCase(s2.name)>0)
			return 1;
		
		
		else if(s1.name.compareToIgnoreCase(s2.name)<0)
			return -1;
		
		else
			return 0;
	}
}



class Sort3
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Student1> al=new ArrayList<Student1>();
		
		al.add(new Student1("abc def3",11));
		al.add(new Student1("abc def2",10));
		al.add(new Student1("abc def1",9));

		Id1 i1=new Id1();
		
		Collections.sort(al,i1);
		
		System.out.println("\n Enter the id to be searched");
		
		int id18=Integer.parseInt(br.readLine());
		Student1 s19=new Student1(null,id18);
		
		int f2=Collections.binarySearch(al, s19,i1);
		
		
		if(f2>=0)
			System.out.println("\n The id is found at index "+f2);
		
		else
			System.out.println("\n The id is not found");
		

		/*
		 * here we have created the separate class ID1 which implements the
		 * 'Comparator interface and when implementing the Comparator interface
		 * we have mentioned its generic type as Student1.
		 * 
		 * so when we override the public int compare() method of Comparator
		 * interface inside the class Id1, we write the definition of the
		 * overriding method compare inside Id1 as:
		 * 
		 * public int compare(Student1 s1,Student1 s2)
		 * {
		 * 
		 * 
		 * }
		 * and if we hadnt mentioned the generic type of the Comparator interface
		 * while implementing it in the class definition of Id1, then we would
		 * need to use the Object class as the class type of the parameters
		 * s1 and s2 instead of Student1 as the parameter type in the title of
		 * the compare() method in class Id1.
		 * 
		 * here we have passed al array list to be sorted as the 1st argument
		 * of the sort()method of Collections class and passed the object
		 * of class Id1 i.e i1 as the 2nd argument to sort().
		 * 
		 * so here the JVM will understand thatr al is to be sorted based on
		 * the id.
		 * 
		 * so here when the JVM is sorting al automatically, 2 objects at a time
		 * of Student1 class and belonging to array list al are passed as the
		 * arguments automatically to the compare()method of the object i1
		 * of class Id1 when these objects are compared by JVM to place
		 * them in the proper order in al in ascending order.
		 * 
		 * inside the method compare() of the i1 object, we have written code
		 * for comparing the individual id data members of the objects
		 * of class Student1 of the array list al being sorted.
		 * 
		 * so here if the id of the 1st object of Student1 class of array list al being
		 * compared with the id of the 2nd object of the array list al being compared
		 * by the JVM while sorting it is found to be greater than the id of the
		 * 2nd object being compared we have returned 1 and so on.
		 * 
		 */
		//System.out.println("\n The list after sorting is "+al);
		
		
		al=new ArrayList<Student1>();
		
		al.add(new Student1("amc k",9));
		al.add(new Student1("def",10));
		al.add(new Student1("amc",11));

		Name1 n1=new Name1();
		
		Collections.sort(al,n1);
	
		
		//System.out.println("\n The list after sorting is "+al);
		
		
		
		
		
		
		
		
		
		
		
		
System.out.println("\n Enter the name to be searched");
		
		
		String str11=br.readLine();
		
		Student1 s18=new Student1(str11,0);
		
		int f=Collections.binarySearch(al, s18, n1);
		
		
		/*
		 * binarySearch() is a static member method of Collections class.
		 * 
		 * here the array list to be binary searced must be first sorted and
		 * then only it can be searched.else we get improper output.
		 * 
		 * here we have sorted al 2nd time based on name of the objects of class
		 * Student1 of al list.
		 * 
		 * This is done by passing n1 object to the Collections.sort()method
		 * along with the array list al.
		 * 
		 * 
		 * 
		 * so here we can search al only based on name and not on id because
		 * it has been sorted based on name using the object n1 implementing
		 * the Comparator interface.
		 * 
		 * 
		 * here we have passed as the 1st argument the array list to be binary searched,
		 * as the 2nd argument we passed the objevt s18 of class Student1 
		 * where s18 name data member value has been accepted from usr as the name
		 * to be searched and we can have any valud for the data member id of s18
		 * object of class Student1 because we are searching s18 in al array list
		 * based on name attribute of clas sStudent1.
		 * 
		 * now we had sorted al based on the name by passinbg n1 to the sort method.
		 * 
		 * so we must compulsarily pass the same object n1 as the 3rd argument 
		 * to the binarySearch()method.
		 * 
		 * now if the name of s18 is found in one of the Student1 class objects of al,
		 * then we get a value which is greater than or equal to 0 which tels
		 * us what is the position of the Student1 object with that particular value
		 * of name in the sorted array list al and else we get a negative value
		 * which is actually the insertion point which tells that in case the name
		 * was present in one of the Student1 objects of al at what location it should
		 * be present in al to maintain the sorted sorted of the array list al.
		 */
		
		if(f>=0)
			System.out.println("\n The name is found at index "+f);
		
		else
			System.out.println("\n The name is not found");
	}
}
