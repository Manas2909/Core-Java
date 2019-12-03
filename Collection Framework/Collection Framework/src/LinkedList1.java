
import java.util.*;


class Linked1
{
	LinkedList<String>al=new LinkedList<String>();
	/* String is the generic type of the al. we can add only objects of the STring class
	 * 
	 */
	
	/*
	 * when we create the object of the ArrayList class we can pass an argument
	 * to the constructor of the ArrayList class. this argument is the capacity
	 * means what is the maxiumum number of elements which can be stored in the 
	 * arraylist
	 * 
	 * by default the capacity is 10.
	 * 
	 * when the size of the arraylist becomes equal to the capacity, then the capacity
	 * of the arraylist is increased by the formula:
	 * new capacity=((old capacity)*(3/2))+1
	 */
	
	void opns()
	{
		al.add("kaveesh nadkarni");
		/* 
		 * here the element "kaveesh nadkarni" is added to the end of the array list
		 * al
		 */
		
		al.add(1, "vivek anand nadkarni");
		/*
		 * here the element "vivek anand nadkarni"will be added at the index 1
		 * of the array al.
		 * 
		 * the index counting in the array list begins from 0.
		 * 
		 */
		
		al.add(2,"sangeeta nadkarni");
		
		al.add(3,"abc def mno");
		
		al.add(4,"xyz tyu");
		
		
		System.out.println("\n the fact that the element xyz tyu is removed from the array list is "+al.remove("xyz tyu"));
		/*
		 * here remove() is a non static member method of the ArrayList class.
		 * it will try to remove the element xyz tyu from the array list and based 
		 * on whether the element was successfully removed or not we get tru or false value
		 */
		
		System.out.println("\n the element removed at index 3 is "+al.remove(3));
		/*
		 * here it remove the element at index 3 in the array list al and
		 * it will return the value of the element removed.
		 */
		System.out.println("\n the value present at index 2 in the array list is "+al.get(2));
		
		/*
		 * al.get(2) will just return the value of the element at index 2 in the
		 * array list but it wont remove it from the array list.
		 * 
		 * 
		 */
		
		al.set(2, "mno pqr");
		/*
		 * it will replace the element at index 2 in the array list by mno pqr
		 */
		
		Iterator it=al.iterator();
		/*
		 * iterator()is a non static member method of the ArrayList class.
		 * it will return the object of the class implementing the Iterator interface
		 * in java.util package and using this object it, we can now access
		 * the elements of the arraylist al
		 */
		
		while(it.hasNext())
		{
			String str=(String)(it.next());
			/*
			 * here we didnt mention the String as the generic typeof the Iterator
			 * interface when we created the object it.
			 * 
			 * so we need to compulsarily convert the return value of it.next()
			 * into the String data type before assigning it to the str variable
			 */
			System.out.println(str);
			
		}
		
		/*
		 * Using the Iterator interface we can move only in the forward direction
		 * in the array list.
		 * 
		 * using the Iterator interface object it,we can also remove the elements
		 * of the array list.
		 * 
		 * but using the Iterator interface object it, we cannot modify 
		 * or insert elements in the array list
		 */
		
		ListIterator lt=al.listIterator();
		/*
		 * listIterator() is a non static member methof the List interface.
		 * 
		 * so this listIterator()method is present in object of every class implementing
		 * the ListIterator interface.
		 * 
		 * we cannot use the ListIterator interface for sets,maps and queues.
		 * 
		 * we can use it only only for the lists.
		 * 
		 * ListIterator is a predefined interface of java.util package.
		 * 
		 * it is a sub interface of the Iterator interface.
		 * 
		 * using the ListIterator we can move in the forward as well as back ward
		 * directions in the array list and we can delete,insert and modify the
		 * elements of the array list
		 */
		while(lt.hasNext())
		{
			String str=(String)(lt.next());
			System.out.println(str);
			
		}
		
		
		
		while(lt.hasPrevious())
		{
			String str=(String)(lt.previous());
			System.out.println(str);
			
		}
		
		System.out.println("\n the starting index of the 1st occurance of kaveesh nadkarni in the array list al is "+al.indexOf("kaveesh nadkarni")+"\n the index of the last occurance of kaveesh nadkarni in the array list al is "+al.lastIndexOf("kaveesh nadkarni"));
	/*
	 * if the element is not present in the array list, then the indexOf() and the 
	 * lastIndexOf() will return value as -1.
	 */
		
		Object arr[]=al.toArray();
		/*
		 * here all the elements of the array list al are returned in form of 
		 * the array object and where the reference variable type of the array is Object class
		 */
		
		for(Object arr1:arr)
		{
			String str=(String)(arr1);
			
			System.out.println(str);
		}
		
		List l1=Arrays.asList(arr);
		/*
		 * here Arrays is a predefined class in java.utilpackage. 
		 * 
		 * it will take the array as input and generate an object which implements
		 * the List interface
		 */
		
		ListIterator lt1=l1.listIterator();
		while(lt1.hasNext())
		{
			System.out.println("\n"+(String)(lt1.next()));
		}
		
		System.out.println("\n the fact that the element kaveesh nadkarni is present is "+al.contains("kaveesh nadkarni"));
		
		
	}
	
	
	void opns1()
	{
		al.add("kaveesh nadkarni");
		al.add("vivek anand nadkarni");
		al.add("vaibhavi nadkarni");
		
		al.addFirst("abc def");
		al.addLast("mno pqr");
		System.out.println("\n the first and last elements without removing are "+al.getFirst()+" "+al.getLast());
		
		System.out.println("\n the 1st and last elements after removing them "+al.removeFirst()+" "+al.removeLast());
		
		ListIterator lt=al.listIterator();
		
		while(lt.hasNext())
		{
			String str=(String)(lt.next());
			System.out.println("\n"+str);
			
		}
	}
	
	public static void main(String args[])
	{
		Linked1 c1=new Linked1();
		c1.opns1();
	}
}

/*

ArrayList class and Vector class implements the Serializable,Cloneable and the 
RandomAccess interface

and because of this the array list and vector are usd in those pgms where the 
most frequent operation is accessing the element.

and LinkedList is used in those pgms where the most frequent operation is inserting
and deleting elements at the start,middle and end.

LinkedList doesnt implement the RandomAccess interface but implements  the
Serializable and Cloneableinterfaces

*/
