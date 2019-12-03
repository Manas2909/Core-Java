/*
 * Sets:
 * Set interface is the sub interface of the Collection interface.
 * 
 * in sets we cannot store duplicate elements. In the sets,the elements cannot
 * be accessed by index like we can do in case of list.
 * 
 * In case of list, the insertion order of the elements is maintained i.e the
 * order in which the elements are inserted in the list is the same order
 * as the order in which the elements are stored in the list in RAM memory.
 * 
 * 
 * in sets the insertion order of the elements is not maintained. The order
 * in which the elements are inserted in the set is not the same order as the
 * order in which the elements are stored in set.
 * 
 * in lists we can store multiple null elements but in case of set we cannot
 * store multiple null elements
 * 
 * 
 * There are some classes implementing the Set interface:
 * 1. HashSet class:
 */


import java.util.*;

class Set1 
{
	HashSet<String> hs=new HashSet<String>();
	
	/*
	 * here HashSet class of java.util package is a predefined class implementing
	 * the Set interface.
	 * 
	 * In case of HashSet the elements are stored as per the hashcode of the
	 * elements. so the insertion order of the elements of the hashset is not
	 * maintained.
	 * 
	 * HashSet hs=new HashSet(int capacity,float loadfactor);
	 * 
	 * here capacity is the maximum number of elements which can be stored
	 * initially in the hashset.
	 * 
	 * load factor is the point at which the capacity of the hashset increases
	 * internally.
	 * 
	 * e.g by default the capacity is 16 and the load factor is 0.75f
	 * 
	 * now 16*0.75=12
	 * 
	 * this means that when the size of the hashset reaches 12 then the capacity
	 * of the hashset is increased internally by some randome value
	 *
	 *The sub class of the HashSet class is the LinkedHashSet class.
	 *HashSet is based on concept of hash table.
	 *
	 *In linked hashset the elements are stored in hashtable as well as doubly
	 *linked list format.
	 *
	 *The elements are stored as per the hashcode and also in doubly linkedlist format.
	 *
	 *In case of linked hashset the insertion order of the elements is maintained
	 *
	 *There are no extra member methods of Set interface. They are all
	 *inherited from the Collection interface
	 */
	
	void opns()
	{
		hs.add("kaveesh nadkarni");
		hs.add("abc def");
		hs.add("mno pqr");
		hs.add("xyz tyu");
		hs.add("vivek anand");
		hs.add("sss ttt");
		
		/*
		 * here the 6 elements of the HashSet hs are inserted in any random order.
		 * 
		 */
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			String str=it.next();
			System.out.println(str);
			
		}
		
		System.out.println("\n The fact that the element xyz tyu is removed from the hashset is "+hs.remove("xyz tyu"));
	/*
	 * here the hs.remove("xyz tyu") returns true or false based on whether the
	 * element xyz tyu was removed from the hashset or not.
	 */
		
		it=hs.iterator();
		
		while(it.hasNext())
		{
			String str=it.next();
			System.out.println(str);
			
		}
		
		
		System.out.println("\n The fact that the element abc def ispresent in hashset is "+hs.contains("abc def"));
		
		/*
		 * hs.contains("abc def") returns true or false based on whether the 
		 * element abc def is present in hashset or not.
		 */
		
		System.out.println("\n The number of elements in the hashset is "+hs.size());
		
		hs.clear();
		
		//willremove all the elements of the hashset
		
		System.out.println("\n The fact that the hashset is empty is "+hs.isEmpty());
		
		
		
		}
	
	public static void main(String args[])
	{
		Set1 s1=new Set1();
		s1.opns();
	}
}


/*
we know that in case of sets we cannot store duplicate elements. But if we try
to add an element already present in the set, then we dont get any compiler
or runtime error but the element is not added to the set and the add() method
returns false.


but how does the JVM know that the element we are adding is a duplicate of 
the element already present in the set


There is a predefined class called as Object of java.lang package,

This Object is the by default superclass of every userdefined and predefined
class in java.


There is a predefined non static member method of Object class:

public boolean equals(Object o)
{


}

HashSet<Student> hs=new HashSet<Student>();

Student is some user defined class.

and here it is the generic type of the hashset hs.

means we can add only objects of class Student into the hs hashset,



imagine class Student is defined as:

class Student
{
	String name;
	int id;
	
	Student(String name1,int id1)
	{
		name=name1;
		id=id1;
	}
	
}

Student s1=new Student("abc def",1);

Student s2=new Student("mno pqr",2);

Student s3=new Student("aaa bbb",3);


we add the 3 objects of class Student to the hashset hs.

hs.add(s1);
hs.add(s2);
hs.add(s3);

supposewe want to add a Student object s4 with name as "abc def" and id as 1.

here the JVM first checks whether the object s4 has a duplicate element already
present in the hashset.

for that the JVM calls the public boolean equals(Object o) method on every object
of class Student ie. s1,s2 and s3 already present in the hashset.

here when the JVM automatically calls the equals() method on s1 object of hashset
hs, then it will pass s4 object to be added into the equals() method of s1
as argument.

s1.equals(s4).

now the class type of s1 is Student.

The JVM sees that whether the class Student has overridden the public boolean equals(Object o)
method of the superclass Object class or not.

here the JVM sees that class Student has not overridden the public boolean equals(Object o)
method of the superclass Object.

so for s1.equals(s4), the JVM calls the predefined equals() method already defined
in Object class and which is inherited by the subclass Student for the statement
s1.equals(s4).

The predefined equals() method of superclass Object uses the == operator
to compare the 2 objects of class Student s1 and s4.

Now we know that s1==s4is true only when the objects which s1 and s4 refer to
have the same hashcode or the address in RAM memory.

here we have created s1 and s4 using 2 different new operators and so they have different
physical memory.

so here s1==s4 inside the body of the equals() method when called by JVM 
of the superclass Object, will return false.

so this means that when JVM compares s1 and s4 to check whether to add s4
into the hashset or not using s1.equals(s4) JVM gets false value.

hence s1 and s4 wont be considered as duplicates of each other and s4 will
be added to the hashset even with the same name and same id as s1.

so for solving this problem we must override public boolean equals(Object o)
method of the superclass Object into the subclass Student.




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
		here we have converted the referenbce type of o from superclass Object
		to subclass Student by narrowing conversion.
		
		if(this.id==s2.id)
		return true;
		
		else
		return false;
	
	
	this is the predefined reference variable which refers to the
	currently executing object of class Student and so when we use the this
	keyword inside the body of equals method, then this refers to the object of
	class Student 	on which JVM has called the equals() method and s2
	is the object of class Student passed as argument to the equals() method
	called on the other object of class Student by JVM
	}
	
	here if we had mentioned the parameter o type as Student then it is method
	overloading of equals inside class Student and not method overriding
}

SO IN case the JVM when comparing s1 object already present in the hashset with
s4 object of class Student being added to the hashset,now JVM calls the
equals()method on s1 object and passes the s4 object as argument to it.

so here JVM calls the equals() method  inside the class Student which overrides
the predefined equals method of superclass Object and passes s4 as the argument
to the equals method called on s1.

so here inside the body of the equals() method calledon s1, 'this' variab;e rfefers
to s1 object and o parameter refers to s4 object.






There is a rule in JVM that when 2 objects are proved to be equivalent to each
other using the equals()method i.e the equals() method when called between the 2
objects in the collection pgm returns true, then as per the rule of JVM
the 2 objects must have identical value for hashcode,else they are again not proved to
be equivalent.

There is another predefined non static member method of Object class called as
public int hashCode().

class MyClass
{

}

MyClass mc1=new MyClass();
MyClass mc2=new MyClass();

here we have created 2 different objects of the same class MyClass using new
keyword 2 times.

so this means that the 2objects of class MyClass have different hashcodesor addresses

so mc1.hashCode() and mc2.hashCode() returns 2 different values because
 the 2 objects mc1 and mc2 have different addresses.
 
 
 so this means that when the predefined hashCode() method is called of Object
 class on 2 different objects of the same class where the 2 different objects
 have been created using 2 different new operators, we get 2unique int
 values when hashCode() method is called individually on each of the 2 objects.
 
 
 
 Now as per the rule of JVM, if the equals() method has proven  the 2 objects to be duplicates
 of each other in the collection pgm, then if the hashCode() method called
 inidivuALLY on the 2 objects(which are duplicates using equals() method),
 then the return values of the hashCode() method when caled on those 2 objects
 also must be the same else if they are different then they are not considered
 to be duplicates or equivalent to each other.
 
 
 
 
 
 
 
 
 
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
		here we have converted the referenbce type of o from superclass Object
		to subclass Student by narrowing conversion.
		
		if(this.id==s2.id)
		return true;
		
		else
		return false;
	
	}
	
	}
	
	here s1 and s4objects of class Student have same name and same id.
	
	so when the JVM calls the equals method to compare s1 and s4 it gets 
	true value but because s1 and s4 have been created using newoperator 2times
	so they have separate unique hashcode values and so s1.hashCode() and
	s2.hashCode()wont return the same value and so again s1 and s4 are
	not considered as duplicates.
	
	so the solution to this is to also override the public int hashCode()
	method of Object class in the subclass Student in such a way that if the
	2objects have same id then their equals returns true and their hashCode()
	method must also compulsarily return the same value
	
	
	
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
		here we have converted the referenbce type of o from superclass Object
		to subclass Student by narrowing conversion.
		
		if(this.id==s2.id)
		return true;
		
		else
		return false;
	
	}
	
	public int hashCode()
	{
	
			return id;
	
	
	}
	}
	

*
*String class and wrapper class of java.lang package have already overridden
*the public boolean equals(Object o) and public int hashCode() methom in them
*internally.
*
*this means that if 2 objects of String class have the same String value but
*different physical addresses, still the equals() method when called between them
*returns true value and the hashCode() method when called individually on
*the 2 objects returns the same int value and so they are considered as duplicates
*if they have the same String value but different addresses.
*
*String str1=new String("abc def");
*
*String str2=new String("abc def");
*
*here str1 and str2 have different addresses but same value.
*
*so str1.equals(str) returns true value and str1.hashCode() and str2.hashCode()
*returns the same int value.
*
*
*
*
*Float f1=new Float(8.89f);
*Float f2=new Float(8.89f);
*
*here f1 and f2 have different addresses but same value.
*
*
*so here again f1.equals(f2) returns true and f1.hashCode() and f2.hashCode()
*return the same int value.
*
*so generally we keep String class and wrapper classes as the generic type
*of the collection
*/

