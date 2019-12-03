/*
 * SortedSet interface in java.util package
 * 
 * NavigableSet interface
 * 
 * 
 * TreeSet class
 * 
 * null value only once
 * 
 * 
 * 
 * TreeSet 
 * sorted order
 * 
 * if 
 * 
 * 
 * if the treeset is not empty, thn we cannot 
 * 
 * 
 * NullPointerException
 * 
 * 
 */
import java.util.*;

class Tree1
{
	TreeSet<Integer>ts=new TreeSet<Integer>();
	
	void opns()
	{
		ts.add(11);
		ts.add(19);
		ts.add(25);
		ts.add(1);
		ts.add(45);
		
		System.out.println(ts);
	

		System.out.println("\n the headset is "+ts.headSet(11)+"\n the tailset is "+ts.tailSet(9));
		
		System.out.println("\n"+ts.subSet(11,45));
	
		System.out.println("\n"+ts.ceiling(18));
		//ceiling: 
		
		System.out.println("\n"+ts.higher(19));
		
		System.out.println("\n"+ts.floor(19));
		//height element which is lesser than or equal to 19:19
		
		System.out.println("\n"+ts.lower(19));
		//heighest element which islesser than 19
		
		System.out.println("\n the first and last elements without removing are "+ts.first()+" "+ts.last());
		
		System.out.println("\n the first and last element after removing them from the tree set are "+ts.pollFirst()+" "+ts.pollLast());
		
		System.out.println(ts);
		
		System.out.println("\nThe descending set is "+ts.descendingSet());
		
		
		//heigher(): it returns the lowest element
		
		/*
	 * headSet
	 * 
	 * tailSet(9): all the elements in the tree set greater than or equal to 9
	 */
	}
	
	public static void main(String args[])
	{
		Tree1 t1=new Tree1();
		t1.opns();
		
	}

}
