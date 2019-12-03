
/*
 * LinkedList class is a predefined class of java.util package and here LinkedList
 * class implements the List as well as Deque interface.
 * 
 * 
 * Deque is the sub interface of Queue interface where in Queues we can add elements
 * only in 1 direction which is FIFO(FIRST IN FIRST OUT).
 * Deque we can add elements to the front and the rear end of queuei.e both
 * sides of queue.
 * 
 * LinkedList class is the only class of java.util package which implements 
 * both the List and the Deque interfaces at same time. so there is no other class
 * in collection frame work which extends more than 1 collection interfaces.
 * 
 * The ArrayList and the Vector class both implement the Serializable interface
 * of java.io package and Cloneable interface of java.lang package and 
 * java.io.RandomAccess interface.
 * 
 * so if the most frequent operation of the collection is to only retrieve
 * elements at any random position in the collection then we generally use ArrayList
 * and Vector class.
 * 
 * LinkedList class only implements the Serializable and Cloneable interface because
 * the Collection interface of java.util package itself  extends the Serializable and the 
 * Cloneable interfaces.
 * 
 * so every class of collection frame work implements the Serializable and Cloneable
 * because all the classes of collection framework are generally subclasses
 * of List,Set and Queue sub interfaces of Collection interface.
 * 
 * Map is not  a sub interface of Collection interface.
 * 
 * so if the most freuqent operation in the collection is inserting and deleting
 * the elements from the start or end or middel of a collection, then  we use
 * the LinkedList.
 * 
 * 
 */


import java.util.*;


class Linked1
{
	LinkedList<String> al=new LinkedList<String>();
	
	/*
	 * when we are creating the object of LinkedList class we can also
	 * pass its acpacity to the constructor of LinkedList class.
	 * 
	 * and if we dont pass the capacity to the constructor of LinkedList class,
	 * then by default the capacity is considered as 11
	 */
	
	void opns()
	{
		al.add("abc def");
		al.add(1,"mno pqr");
		al.add(2,"xyz ");
		
		al.addFirst("kaveesh");
		al.addLast("vivek");
		
		/*
		 * addFirst() and addLast()are the predefined non static member method  of the LinkedList
		 * class.
		 * 
		 * they add the elements before the 1st element and after the last
		 * element of the linked list resp.
		 * 
		 * al.addFirst("kaveesh") will add the element "kaveesh" before the 1st element
		 * "abc def" of the al
		 * 
		 * al.addLast("vivek") will add the element "vivek" at the end of the linked list
		 * al after the element xyz
		 * here "kaveesh" is added before the 1st element of the LinkedList al.
		 */
		
		System.out.println("\n The 1st and last elements of linked list without removing are "+al.getFirst()+"\n"+al.getLast());
		
		/*
		 * getFirst() and getLast() are the predefined non static member methods
		 * only of LinkedList class and not of the List interface like addFirst
		 * and addLast()
		 */
		
		System.out.println("\n The 1st element after removing is "+al.removeFirst()+"\n the last element removed is "+al.removeLast());
		
		/*
		 * here removeFirst and removeLast() are the predefined non static member
		 * methods of LinkedList class only and not of List interface
		 */
		
		ListIterator lt=al.listIterator();
		
		System.out.println("\n The elements of the linked list in forward direction are ");
		
		while(lt.hasNext())
			System.out.println("\n"+(String)(lt.next()));
		
		
		
		System.out.println("\n The elements of linked list in the reverse order are ");
		
		while(lt.hasPrevious())
			System.out.println("\n"+(String)(lt.previous()));
		
		
	}
	
	public static void main(String args[])
	{
		Linked1 l1=new Linked1();
		l1.opns();
	}
}
