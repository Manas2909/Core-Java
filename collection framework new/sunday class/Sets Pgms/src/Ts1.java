
/*
 * 
 * Set interface
 * 
 * SortedSet interface
 * 
 * NavigableSet interface
 * 
 * 
 * TreeSet class
 * 
 * here SortedSet interface is the sub interface of Set interface
 * 
 * NavigableSet interface extends the SortedSet interface.
 * 
 * TreeSet class implemnets the NavigableSet interface.
 * 
 * so in case of the treeset the eelements are always present by default
 * in the sorted ascending and also they can be easily accessed.
 * 
 * 
 */

import java.util.*;

class Ts1 
{
	TreeSet<Integer>ts=new TreeSet<Integer>();

	void opns()
	{
		ts.add(new Integer(17));
		ts.add(9);
		
		/*
		 * here 9 is a primitive int value and as we know that in the collection
		 * we cannot add primitive elements else we get a compiler error.
		 * 
		 * but here in java there is a concept called as autoboxing where
		 * the primitive for the further operation is automatically converted
		 * to the wrapper class objectt.
		 * 
		 * e.g \
		 * here ts.add(9) will convert the 9 primitive value into the new Integer(9)
		 * and then add it to the tree set. so this is called as auto boxing.
		 */
		
		ts.add(8);
		ts.add(4);
		
		Iterator<Integer> it=ts.iterator();
		
		while(it.hasNext())
		{
			Integer str=it.next();
			System.out.println(str);
			
		}
		
		System.out.println("\n The elements in the tree set less than 8 "+ts.headSet(8));
		/*
		 * headSet() is a predefined non static member method of the TreeSet
		 * class and ts.headSet(8) returns the elements in the treeset which
		 * are less than new Integer(8)
		 */
		
		System.out.println("\n The elements in the tree set greater than or equal to 8 are "+ts.tailSet(8));
		
		System.out.println("\n The elements in the tree set greater than or equal to 4 and less than 9 are "+ts.subSet(4, 9));
		
		System.out.println("\n The 1st and last elements of tree set are "+ts.first()+"   "+ts.last());
		
		System.out.println("\n The lowest element in the treeset heigher than or equal to 8 is "+ts.ceiling(8));
		System.out.println("\n The lowest element in the treeset heigher than 8 is "+ts.higher(8));
		
		System.out.println("\n The heighest element in the treeset lower than or equal to 8 is "+ts.floor(8));
		System.out.println("\n The heighest element in the treeset lower than 8 is "+ts.lower(8));
		
		System.out.println("\n The 1st and last elements of tree set returned and removed are "+ts.pollFirst()+"  "+ts.pollLast());
it=ts.iterator();
		
		while(it.hasNext())
		{
			Integer str=it.next();
			System.out.println(str);
			
		}
		
		System.out.println("\n The treeset in the descending order is "+ts.descendingSet());
		
	}
	
	public static void main(String args[])
	{
		Ts1 s1=new Ts1();
		s1.opns();
	}
}


/*

in case of TreeSet if we had a null value to a empty tree set then it will be
successfully added to the tree set.,

But after that if we try to add any other element which is either  null or
a non null element we get a java.lang.NullPointerException because in tree set
the elements are present in the sorted order and so when we add the 2nd element
in the tree set which already contains a null value then that element added
wil be compared with null so that they are in  sorted ordder and so we get a 
NullPointerException


and in other sets which are not tree sets, we can add null value only once and
then we can add other elements because that in sets we cannot have duplicate elements.

*/