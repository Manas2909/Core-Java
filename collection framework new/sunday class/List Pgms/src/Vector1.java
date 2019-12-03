
/*
 * Vector:
 * 
 * Vector is a predefined class of java.util package which implements the 
 * List interface.
 * 
 * Vector is also modelled on concept of a dyanamic reasizeable array.
 * 
 * in vector all the non static member methods are marked internally with the
 * synchronized keyword and so the Vector class object has a lock associated with it
 * and so multiple threads cannot operate at same time on the Vector class object
 * and so Vector class object is thread safe and it is slower.
 * 
 * 
 * Vector class implements the 2 interfaces whichb are extended by the Collection
 *  interface ie. java.io.Serializable interface and java.lang.Cloenable interface
 *  
 *  and it also implements 1 extra interface called as java.io.RandomAccess interface.
 *  
 *  and so we generally use the Vector in pgms where any element at any position
 *  needs to be randomly accessed in the same time.
 *  
 */


import java.util.*;

class V1 
{
	Vector<String>al=new Vector<String>();
	
	/*
	 * when we create object of Vector class we can pass 2 arguments to the
	 * constructor of Vector class as follows:
	 * 
	 * Vector v=new Vector(int capacity,int capacity increment);
	 * 
	 * capacity is the maximum number of elements which can be stored in the
	 * Vector at a time.
	 * 
	 * capacity increment is the amount or the number by which the capacity of the vector
	 * is increased when the vector becomes full of elements.
	 * 
	 * Vector v=new Vector();
	 * 
	 * here we have not passed any arguments to the constructor of Vector class
	 * above. so we have not mentioned any explicit value for the capacity and
	 * the capacity increment of the vector.
	 * 
	 * so by default the capacity of v object above is taken as 10.
	 * 
	 * also every time the size of the vector object v above reaches its capcity
	 * then the capacity will be increased automatically by the below fixedformula
	 * if the capacity increment has not been mentioned as the 2nd argument explicitly while creating
	 * the Vector object:
	 * 
	 * new capacity=2*old capacity;
	 * 
	 */
	void opns()
	{
		al.add("abc def");
		al.add(1,"kaveesh nadkarni");
		al.addElement("mno pqr");
		
		/*
		 * addElement() is an extra non static member method only in the Vector
		 * class but not in List interface and al.addElement("mno pqr") adds the 
		 * element "mno pqr" at the end of the vector al.
		 */
		al.add("xyz tyu");
		al.add("aaa bbb");
		al.insertElementAt("mmm jjj kkk",5);
		
		/*
		 * insertElementAt() is also a non static member method of Vector class only,
		 * 
		 * al.insertElementAt("mmm jjj kkk",5) will insert the element in vector
		 * al at in dex 5 and if there is already an element at index 5 then that
		 * element is moved down along with the other elements after it and 
		 * the element mmm jjj kkk is placed now at index 5.
		 */
		
		/*
		 * here al.add(int index,element) returns a runtime exception  if
		 * we add an index as argument to add() where there is no element at the
		 * previous index in the array list al.
		 */
		System.out.println("\n The fact that the element mno pqr is removed from the array list al is "+al.removeElement("mno pqr"));
		
		/*
		 * removeElement() is a predefined non static member method only of Vector
		 * class and not the List interface and here al.removeElement("mno pqr")
		 * will remove the element mno pqr from the vector al if present and return
		 * true or false based on whether the element was removed from the vector
		 * or not.
		 * 
		 * Also we can use al.remove("mno pqr") on vector al for the same purpose 
		 */	
		
		al.removeElementAt(4);
		/*
		 * here removeElementAt() is a predefined non static member method of the 
		 * Vector class only and al.removeElementAt(4) removs the element at index
		 * 4 in the array list and itrs return type is void and so it cannot
		 * be passed as argument to the System.out.println() and in case index 4
		 * is not there in vector we get an exception at runtime.
		 * 
		 * al.remove(4) can also be written to remove the element at index 4
		 * in the vector al but it will also return the value of the element removed
		 * from the vector al at index 4.
		 */
		
		
		System.out.println("\n The element at index 2 without removing is "+al.elementAt(2));
		/*
		 * elementAt() is a non static member method only of the Vector class and not
		 * 'the List interface and al.elementAt(2) will return the element at index 2
		 * in the vector al without removing it and we can also call al.get(2)
		 * for the same purpose on the vector class object al.
		 */
		al.setElementAt("vivek anand",2);
		
		
		/*
		 * setElementAt() is a non static member method of the Vector  only and
		 * al.setElementAt("vivek anand",2) will replace the element at index 2
		 * in the vector al by the element "vivek anand" and we could have used
		 * al.set(2,"vivek anand") for the same purpose.
		 * 
		 * 
		 */
		
		Enumeration<String>e=al.elements();
		/*
		 * elements() is a non static member method of only the Vector class and
		 * al.elements() will return all the elements of vector al in form of a group
		 * or collection and also return the implicit object of Enumeration interface 
		 * e to access these elements returned
		 */
		
		System.out.println("\n The elements of vector al are ");
		while(e.hasMoreElements())
		{
			String ele=e.nextElement();
			System.out.println(ele);
		}
		
		/*
		 * we can also use Iterator,ListIterator,for each loop and System.out.println()
		 * directly to access and display the elements of the vector
		 */
		System.out.println("\n The 1st element of the vector al without removing is "+al.firstElement()+"\n the last element of the vector al without removing is "+al.lastElement());
		
		System.out.println("\n The capacity of the vector is "+al.capacity());
		
		al.removeAllElements();
		
		/*
		 * removes all the elements from the vector and we can also call al.clear()
		 * on the vector al but removeAllElements() is only a non static member method
		 * of Vector class
		 */
		
		System.out.println("\n The fact that the vector al is empty is "+al.isEmpty());
		
				
	}

	public static void main(String args[])
	{
		V1 s1=new V1();
		s1.opns();
	}
}
