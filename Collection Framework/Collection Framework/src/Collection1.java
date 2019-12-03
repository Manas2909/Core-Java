/*
 * in earlier times, we had only arrays. array is an indexed collection of elements
 * of the same data type and a fixed size.
 * 
 * array can store only elements of same data type.so it is homegeneous.
 * 
 * Array can store primitives as well as objects.
 * 
 * in the case of array, the size of the array cannot be dyanamically increased
 * or decreased.
 * 
 * but it is easy to access the elements of the array by just using index.
 *  inserting and deleting the elements in the array is complicated.
 *  
 *  so from efficiency point of view, arrays are good.
 *  
 *  Collection: it is a object which can store other objects inside it.
 *  
 *  the size of th collection can be dyanamically increased or decreased.
 *  
 *  the collection can store only  objects and not primitive.
 *  
 *  the collections are b ased on a fixed data structure like linked list,stack,queue etc.
 *  
 *  so processing the elements of the collection doesnt require own logic.
 *  
 *  but in case of arrays if we have to implement  data structures using arrays,
 *  then the processing of the elements gets very complicated.
 *  
 *  so from memory management point of view,collections are good.
 *  
 *  
 *  
 *  Collection is a predefined interface in java.util package.
 *  
 *  the collection framework is a set of classes and interfaces which can create
 *  objects which can store other objects inside it.
 *  
 *  
 *  There are 3 sub interfaces of the Collection interface.
 *  
 *  List,Set and Queue interface.
 *  
 *  Map interface of the java.util package is not the sub interface of the Collection
 *  interface.
 *  
 *  1.List interface:
 *  It is used to create lists which are resizeable arrays. in lists, the elements
 *  can be accessd by index and in lists the order in which the elements are inserted
 *  is maintained.
 *  
 *  in lists, we are allowed to store duplicate elements or elements with duplicate values.
 *  
 *  in lists, we are allowed to store null values.
 *  
 *  2. Set interface
 *  it is used to create sets where we cannot store duplicate values. in sets
 *  the order in which the elements are inserted is not maintained.
 *  in sets the elements cannot be accessd by index.
 *  
 *  in sets we cannot insert null values.
 *  
 *  in sets there is a method called as andAll() which is used for set union and
 *  retainAll() for set intersection.
 *  
 *  
 *  3. Queue interface:
 *  it is used to create queues which store the elements prior to processing them.
 *  here the elements are generally stored in FIFO means First in First out order.
 *  
 *  
 *  
 *  Map interface:
 *  it is not the sub interface of Collection interface.
 *  here every element of the map contains 2 more elements, 1 is the key object and
 *  other is the value object.
 *  
 *  we insert the key and we get the value.
 *  
 *  in the map, we cannot have elemnts with duplicate keys.
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 *  Overriding equals and hashcode.
 *  
 *  There is a class called as HashSet. This class implements the Set interface.
 *  
 *  in the hashset because it is a set we cannot store the duplicate elements.
 *  
 *  imagine there is a HashSet object called as hs.
 *  
 *  HashSet<Student> hs=new HashSet<Student>();
 *  
 *  
 *  here Student is the generic type or the data type of hs. we can add only objects
 * of the Student class into hs.
 * 
 * Student s1=new Student();
 * imagine s1 is already an object present in hs.
 *  
 *  Student s2=new Student();
 *  now we are trying to add s2 object of Student class to hs.
 *  
 *  now because in hs we cannot store duplicate elements, so before s2 is added
 *  to hs,s1 and s2 will be compared to each other.
 *  
 *  
 *   There is a predefined class called as Object class. It is the by default
 *   superclass of every class in java.
 *   
 *   this class Object contains a predefined method called as public boolean equals(Object o){  }
 *   
 *   this method will be inherited by default in every class.
 *   
 *   now when s1 and s2 are being compared, the JVM will check if the class Student
 *   which is the class type of s1 and s2 has overridden the public boolean
 *   equals method of class Object or not.
 *   
 *   if not, then the JVM will call the predefined equals method of class Object
 *   on either s1 or s2 and will pass the other object of Student class as argument
 *   to it.
 *   
 *   the predefined equals method of Object class uses the == operator to compare
 *   the 2 objects of Student class.
 *   
 *   the == operator when used between s1 and s2 will return true value if and only
 *   if s1 and s2 are referring to the same object on heap memory.
 *   
 *   this means that even if s1 and s2 have duplicate values for their data members still
 *   just because the 2 objects dont have the same address on heap memory, we 
 *   will get false value and they wont be proven to be duplicates and the duplicate
 *   object gets added to the hashset.
 *   
 *   
 *   if the class Student, has overridden the public boolean equals(Object o)method
 *   of class Object, then the JVM will call the equals method in class Student
 *   on 1 of the objects and pass the other object as argument to it.
 *   
 *   so we must write our own logic in our public boolean equals(Object o) method
 *   in such a way that the 2 student class objects are compared based on their name
 *   and id.
 *   
 *   there is another method called as public int hashCode() of the Object class.
 *   
 *   when it is called on any object, a unique hashcode value is returned based
 *   on the hashcode or the address of the object on heap memory.
 *   
 *   java has introduced a rule that if the 2 objects are proven to be equal using
 *   the equals method of the Object class, then in case of collections, when the hashCode()
 *   method is called individually on both the objects then it must compulsarily
 *   return the same value, else we dont get proper output.
 *   
 *   hence if we are overriding the public boolean equals method, we need to also
 *   override the public int hashCode() method for proper output.
 *   
 *   but even if 2 objects are not duplicates of each other using the equals method
 *   then still it may happen that the hashCode() method when called individually
 *   on them, may return the same value and this wont have any improper effect.
 *   
 *   
 *   
 *   class Student
 *   {
 *   
 *   		public boolean equals(Object o)
 *   		{
 *   			Student s=(Student)o;
 *   
 *   			if(s.id==this.id)
 *   			{
 *   				return true;
 *   
 *   			}
 *   
 *   
 *   			else
 *   			return false;
 *   
 *   here this is the Student class object on which equals method is called
 *   
 *   AND s is the object passed as argument to the equals method of the Student
 *   object on which equals is called.	
 *   
 *   		}
 *   
 *   		public int hashCode()
 *   		{
 *   			return id;
 *   
 *   		}
 *   		}
 *   
 *   The String class and wrapper class internally override th equals and hashCode method
 *   in such a way that if 2 String class objects have same value then the equals
 *   will return true and their hashCode when called individually on the 2 String
 *   objects will return same value.
 *   
 *   same  happens with wrapper classes.so generally we keep the STring and the 
 *   wrapper class as the generic type of the collection because then in
 *   that case we dont need to worry about overriding equals and hashCode method.
 *   
 *   they are already overridden in the proper way by the String and the wrapper classes
 *   
 *   but if we keep some other use defined class as the generic type of the collection,
 *   then please override the equals and the hashCode method in that class with
 *   proper logic to get proper output.
 *   
 *   */

/*

ArrayList:
ArrayList is a class implementing the List interface. 

in arraylist, the methods are not synchronized. means multiple threads are allowed
to operate on the same array list object.

if we want to convert the ArrayList to the synchronized format,  then for that 
there is a static member method of the ArrayList class called as synchronizedList().

suppose al is the ArrayList object which is not synchronized.

so if we want to create a synchronized array list from the array list object al.

then we write List l1=Collections.synchronizedList(al);

here l1 is the list in the synchronized format

*/

import java.util.*;


class Array1
{
	ArrayList<String>al=new ArrayList<String>();
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
		 * of the arraylist al.
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
			 * here we didnt mention the String as the generic type of the Iterator
			 * interface when we created the object of it.
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
		 * listIterator() is a non static member method of the List interface.
		 * 
		 * so this listIterator()method is present in object of every class implementing
		 * the List interface.
		 * 
		 * we cannot use the ListIterator interface for sets,maps and queues.
		 * 
		 * we can use it only for the lists.
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
	
	public static void main(String args[])
	{
		Array1 c1=new Array1();
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
Serializable and Cloneable interfaces

*/
