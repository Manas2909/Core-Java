/*
 * soering the list of Strings
 */

import java.util.*;
class Sort1
{
	ArrayList<String>al=new ArrayList<String>();
	
	void opns()
	{
		al.add("mno");
		al.add("kaveesh");
		al.add("eee");
		
		Collections.sort(al);
		
		/*
		 * here Collections is a predefined class of java.util package.
		 * 
		 * It has a predefined  static member method called as sort().
		 * 
		 * we pass any kind of list object to be sorted of any class implementing
		 * the List interface to the sort() method.
		 * 
		 * here whatever list we want to sort and pass as the argument to the
		 * sort() method of Collections class, that generic class type of the
		 * list needs to completely implement the Comparable interface of java.lang package.
		 * 
		 * here out list is al.
		 * 
		 * so the generic type of al must compulsarily implement the java.lang.Comparab;e
		 * interface else we get a compiler error.
		 * 
		 * here String is the generic class typeof al.
		 * 
		 * so here String class already implements the Comparable interface of java.lang package.
		 * 
		 * Also all the wrapper classes of java.lang package implement the
		 * Comparable interface.
		 * 
		 * here sort() method of the Collections class will sort the string
		 * elements of al in ascending order format.
		 * 
		 * so here the al after beinbg sorted will now have elements eee,kaveesh
		 * and mno at the 0th,1st and 2nd indexes resp.
		 * 
		 * 
		 */
		
		System.out.println("\n The sorted array list al is "+al);
		
		ArrayList<Float> al1=new ArrayList<Float>();
		
		al1.add(9.9f);
		al1.add(8f);
		al1.add(3f);
		al1.add(1.1f);
		
		Collections.sort(al1);
		
		System.out.println("\n The sorted array list al is "+al1);
		
		
	}

	public static void main(String args[])
	{
		Sort1 l1=new Sort1();
		l1.opns();
	}
}

