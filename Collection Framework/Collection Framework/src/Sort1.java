//sorting the list

import java.util.*;

class Sort1 
{
	ArrayList<String>al=new ArrayList<String>();
	
	void opns()
	{
		al.add("mno pqr");
		al.add("def tyu");
		al.add("abc def");
		
		Collections.sort(al);
		/*
		 * here the Collections is a class and sort is a static member method
		 * of that class.
		 * here we can pass only those lists to the sort method as the argument
		 * whose generic type implements the java.lang.Comparable interface
		 * and overrides the public int compareTo(Object o) method of the Comparable
		 * interface.
		 * 
		 * here the String class implements the Comparable interface
		 */
		
		System.out.println(al);
		/*
		 * public String toString()
		 * {
		 * 
		 * 
		 * }
		 * 
		 * Student s=new Student();
		 * System.out.println(s); internally calls the s.toString
		 * if Student not overridden toString() method then output of System.out.println(s):Student@hashcode of Student object s
		 * 
		 * if Student class has overridden toString() member method of java.lang.Object super class, then the toString() method explicitly defined in class
		 * Student is called and whatever
		 * 
		 * here in the statement System.out.println(al), where al is the ArrayList object, the toSTring()method is called on every element of al and its output value of each object
		 * toString() method is displayed inside the [ ] brackets[    ]
		 */
		
	}
	
	public static void main(String args[])
	{
		Sort1 s1=new Sort1();
		s1.opns();
		
	}
}
