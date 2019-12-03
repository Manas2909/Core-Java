
/*
 * 
 * LinkedList class:
 * It is a predefined class of java.util package which implements List interface
 * and also Deque interface where Deque is the sub interface of the Queue interface
 * of java.util package.
 * 
 * so LinkedList is the only class of java.util package collection framework
 * which implements more than 1 sub interfaces of the Collection interface.
 * 
 * The LinkedList class implements only those interfaces extended by the Collection
 * interface which are java.io.Serializable interface and java.lang.Cloneable
 * interface but it doesnt implement the java.io.RandomAccess interface like
 * ArrayList and Vector classes.
 * 
 * so we use the LinkedList class where the most frequently used operation
 * is iserting or deleting elements at the start, end and middle of the collection.
 * 
 * the LinkedList object elements are organised in the doubly linked list
 * format i.e the previous element stores the reference to the next element and
 * the next element also stores the reference to the previous element
 */
import java.util.*;

class L1
{
	LinkedList<String>al=new LinkedList<String>();
	
	/*
	 * WHEN WE create the object of LinkedList class we can pass 1 argument
	 * to the constructor of the LinkedList class which is the initial capacity
	 * of the linked list and if we dont pass any arguments for the explicit
	 * initial capacity of the linked list then the by default capacity
	 * of the linked list is considered as 11.
	 * 
	 * linked list are generally used to implement concepts of stacks and quees
	 * and for the evauation of infix.postfix and prefix expressions.
	 * 
	 * In case of the Deque the LinkedList which implements the Deque interface
	 * that implementation of the linked list where it implements the Deque interface
	 * is in FIFO order.
	 */
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
		
		System.out.println("\n The first and the last elements of the linked list without removing are "+al.getFirst()+"\n"+al.getLast());
		
		al.addFirst("rohit bellare");
		al.addLast("akshay abc");
		
		/*
		 * addFirst() and addLast() are the non static member methods of LinkedList
		 * and here al.addFirst("rohit bellare") and al.addLast("akshay abc")
		 * will add the elements rohit bellare and akshay abc at the start and the
		 * end of the linked list al.
		 */
		System.out.println("\n The first and the last elements of the linked list without removing are "+al.getFirst()+"\n"+al.getLast());
		
		System.out.println("\n The first and last elements of the linked list after removing are "+al.removeFirst()+"\n"+al.removeLast());
		
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
		L1 s1=new L1();
		s1.opns();
	}
}
