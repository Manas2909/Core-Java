
/*
 * ArrayList
 */

import java.util.*;

class Ar1 
{
	ArrayList<String>al=new ArrayList<String>();
	
	void opns()
	{
		al.add("abc def");
		al.add(1,"kaveesh nadkarni");
		al.add("mno pqr");
		al.add("xyz tyu");
		al.add("aaa bbb");
		al.add(5,"mmm jjj kkk");
		
		/*
		 * here al.add(int index,element) returns a runtime exception  if
		 * we add an index as argument to add() where there is no element at the
		 * previous index in the array list al.
		 */
		System.out.println("\n The fact that the element mno pqr is removed from the array list al is "+al.remove("mno pqr"));
		
		/*
		 * here boolean remove(Object o) is a predefined non static member method
		 * of ArrayList class and it accepts the element to be removed from the array 
		 * list as the argument and it returns the boolean value.
		 * 
		 * al.remove("mno pqr")will return true or false based on whether the
		 * element mno pqr has been successfully removed from the array list al
		 * or not.
		 */
		System.out.println("\n The element removed at index 4 in array list al is "+al.remove(4));
	
		System.out.println("\n The element at index 2 without removing is "+al.get(2));
		
		al.set(2, "vivek anand");
		
		/*
		 * here the element at index 2 in the array list al is removed and the
		 * element vivek anand is placed at index 2 in place of it by al.set(2,"vivek anand)
		 * where set() is a non static member method of ArrayList class
		 */
		
		System.out.println("\n The array list currently is "+al);
		
		System.out.println("\n The index of the 1st occurance of vivek anand in al is "+al.indexOf("vivek anand")+"\n the index of the last occurance of vivek anand in al is "+al.lastIndexOf("vivek anand"));
		
		/*
		 * here if the element is not present in al then al.indexOf(element)
		 * and al.lastIndexOf(element) returns -1.
		 */
		
		System.out.println("\n the fact that the element aaa bbb is present in aray list al is "+al.contains("aaa bbb"));
		
		System.out.println("\n The total number of elements currently in al is "+al.size());
		
		al.clear();
		
		//clear() is a predefined non static member method of ArrayList class and it removes all elements from al
		
		
		System.out.println("\n The fact that the al is now empty is "+al.isEmpty());
		
	}

	public static void main(String args[])
	{
		Ar1 s1=new Ar1();
		s1.opns();
	}
}
