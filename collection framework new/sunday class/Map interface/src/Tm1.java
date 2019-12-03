/*
 * TreeMap class:
 * 
 * 
 * Map interface
 * 
 * 
 * SortedMap interface
 * 
 * NavigableMap interface
 * 
 * TreeMap class
 * 
 * 
 * here java.util.SortedMap interface is the sub interface of java.util.Map
 * interface. java.util.NavigableMap interface is the sub interface of java.util.SortedMap
 * interface,
 * 
 * java.util.TreeMap class is the class implementing the java.util.NavigableMap interface.
 * 
 * In treemapm the elements are present in the sorted order of the keys b y
 * default. sp the insertion order is not maintained.
 * 
 * in the empty treemap, we can insert element with null key but after that
 * if we try to insert any element with any key either non null or null key we
 * get a java.lang.NullPointerException because that new element key added
 * will be compared with the null key for placing in the sorted order of keys.
 * 
 * 
 * 
 */


import java.util.*;

class Tm1 
{
	TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
	
	void opns()
	{
		tm.put(11,"kaveesh nadkarni");
		tm.put(10, "abc def");
		tm.put(9,"mno pqr");
		tm.put(8, "xyz tyu");
		tm.put(7, "ttt yyy");
		tm.put(4, "ggg ttt");
		
		System.out.println("\n The curent tree map is "+tm);
		
		/*
		 * here the toString()method is automatically called by default
		 * on the key object and value object of every element of tm and the return
		 * values of toString() called on the key object and the value object
		 * of every element of tm is placed inside the {   } 
		 * 
		 * {return type of toString() on key object of 1st element=return type of
		 * toString() on the value object of 1st element,......}
		 */
	
		System.out.println("\n the elements in the tree map whose keys are less than 9 are "+tm.headMap(9));
		System.out.println("\n The elements in tree map whose keys are greater than or equal to 9 are "+tm.tailMap(9));
		System.out.println("\n The elements in treemap whose keys are greater than or equal to 8 and less than 11 are "+tm.subMap(8, 11));
	
		System.out.println("\n the 1st and last entries of tree map tm are "+tm.firstEntry()+"\n"+tm.lastEntry());
		
		System.out.println("\n The 1st and last keys of treema tm are "+tm.firstKey()+"\n"+tm.lastKey());
		
		System.out.println("\n the element with the lowest key in tm greater than or equal to 4 is "+tm.ceilingKey(4));
		System.out.println("\n the element with the lowest key in tm greater than  to 4 is "+tm.higherKey(4));
		
		System.out.println("\n The element with heighest key in tm which is lower than or equal to 11 is "+tm.floorKey(11));
		System.out.println("\n The element with heighest key in tm which is lower than  11 is "+tm.lowerKey(11));

		System.out.println("\n The 1st and last entries of tree map tm after removing are "+tm.pollFirstEntry()+"\n"+tm.pollLastEntry());
		
		System.out.println("\n The entries in tree map are "+tm);
		
		System.out.println("\n The elements of tree map in descending order are "+tm.descendingMap());
		
		TreeMap<Integer,String> tm1=new TreeMap<Integer,String>();
		
		tm1.put(18, "ff tty");
		
		tm1.put(3, "ddd");
		
		tm1.put(1, "mno def");
		
		tm.putAll(tm1);
		
		/*
		 * putAll()is a non static member method of Map interface and it is present
		 * in all the classes implementing Mapinterface and this will insert the elements
		 * of 1 map as the elements of the other map and so here tm.putAll(tm1)
		 * will insert elements of tm1 into tm.
		 */
		
		System.out.println("\n The elements of tm after inserting tm1 are "+tm);
	}
	
	public static void main(String args[])
	{
		Tm1 t1=new Tm1();
		t1.opns();
	}
}
