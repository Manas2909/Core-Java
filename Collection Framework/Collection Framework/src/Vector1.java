
import java.util.*;

class Array2
{
	Vector<String>al=new Vector<String>();
	/*
	 * Vector is a predefined classin java.utilpackage.
	 * 
	 * it implements the List interface.
	 * in Vector the methods are synchronized i.emultiple threads cannot operate
	 * on the same Vector object.
	 * 
	 * Vector is alegacy class because it has been introduced in the old version
	 * of java
	 * 
	 * when we create the object of Vector class we pass 2 arguments into the 
	 * constructor.
	 * 
	 * the 1st argument is the initial capacity.
	 * 
	 * this means the maximum number ofelements which can be storedin the vector.
	 * 
	 * the 2nd argument is the capacity increment.it means the quantity by which
	 * the capacity is increased when the vector becomesfull of elements.
	 * 
	 * by default the initialcapacity is 10.
	 * 
	 * 
	 * 
	 * if we dont mention the capacity increment, then everytime the vector becomes
	 * full of elements, the capcity will be doubled every time.
	 * 
	 * so this means that everytime the vector becomes full of elements,the new
	 * capacity=2*old capacity
	 * 
	 * in vector we can store null values
	 */
	
	void opns()
	{
		al.addElement("KAVEESH NADKARNI");
		//willadd the element with the value KAVEESH NADKARNI at the end
		//of the array list
		al.addElement("abc def");
		al.add(2, "nilesh chauhan");
		al.add(3,"vivek anand nadkarni");
		
		System.out.println("\n the fact that the element vivek anand nadkarni is deleted from the vector is "+al.removeElement("vivek anand nadkarni"));
		//will try to remove the element fromthe vector al,and will return true or
		//false accordingly
		
		al.removeElementAt(2);
		/*
		 * removes the element at index 2 in the vector and its return type is void.
		 */
		
		System.out.println("\n the element at index 1 without remving is "+al.elementAt(1));
		/*
		 * here we get the element at index 1 in the vector but it wont remove the element
		 * fromthe vector
		 */
		
		Enumeration e=al.elements();
		/*
		 * elements is a non static member method of the Vector class and it
		 * will return allthe elements stored in the vector in form of object
		 * of the class implementing the Enumeration interface.
		 * 
		 * the Enumeration is the predefined interface in java.util package
		 */
		
		while(e.hasMoreElements())
		{
			/*
			 * hasMoreElements()will check if there are any more vector al elements to be a
			 * accessed through e or not.
			 * 
			 * if yes,we get true value but e is not moved forward.
			 * 
			 */
			String str=(String)(e.nextElement());
			/*
			 * here e is actually moved forward to the next element and here the
			 * value of the next element is obtained in String format
			 * but the return value of e.nextElement()must be converted to the
			 * String format because when we created the object of Enumeration
			 * interface we didnt mention String as the generic type.
			 */
			
			System.out.println(str);
			
		}
		/*using Enumeration interface we cannot delete the elements from the vector
		 * 
		 * the Enumeration interface is the legacy interface because it has been
		 * introduced in the old version of java.
		 */
		
		System.out.println("\n the 1st and the last elements of the vector are "+al.firstElement()+"\n"+al.lastElement());
		
		al.removeAllElements();
		//removes all the elements fromthe vector
		
		System.out.println("\n the fact that the vector is empty is "+al.isEmpty());
		
	}
	
	public static void main(String args[])
	{
		Array2 c1=new Array2();
		c1.opns();
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
