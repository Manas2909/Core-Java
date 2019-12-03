//vector pgm

/*

Vector is also a class implementing the List interface of java.util package.

The difference betweent the ArrayList and Vector is that the methods of the ArrayList class are not synchronized and so multiple threads can operate on the same object of the ArrayList class and so the arraylist object is not thread safe and it is faster.


In case of ArrayList object, if we want to convert it into the synchronized format, there is a predefined static member method of the Collections class called as synchronizedList() which works as follows:

Imagine al is the non synchronized ArrayList class object.


here if we want to convert al to the synchronized format:

List l1=Collections.synchronizedList(al);


this Collections.synchronizedList(al) will convert the al object into the synchronized format and store the new synchronized list in l1.

al is still not synchronized





in the Vector class, the non static methods of the Vector class are synchronized and so multiple threads cannot operate on the same Vector class object.

so the Vector class object is thread safe and slower than the arraylist object.


*/


import java.util.*;

class Vector11
{

	Vector<String>al=new Vector<String>();


/*
when we create the object of Vector class we can pass 2 arguments to the constructor of the Vector class as follows:

Vector v=new Vector(int initial capacity,int capacity increment);

here initial capacity is the maximum number of elements which the vector can hold initiallly or the maximum size of the vector v possible.

by default the initial capacity of the vector when we dont mention any initial capacity explicitly while creating the object of the Vector class is 10.

The capacity increment is the amount by which the capacity of the Vector will increase when the vector becomes full of elements and when the vector size becomes equal to the vector current capacity.

here capacity increment specifies what must be the value of the new capacity of the vector when the number of elements in the vector becomes equal to the capacity of the vector.

If we dont specify any explicit value for the capacity increment when we are creating the object of Vector class, then everytime the vector size becomes equal to its capacity the new capacity of the vector is calculated by:
new capacity=2*old capacity
	
*/
	void  opns()
	{
		al.addElement("abc def");
		al.add(1,"mno pqr");
		al.add("kaveesh nadkarni");
		al.add(3,"xyz tyu");
		al.add(4,"vivek anand nadkarni");


/*
addElement() is a non static method of the Vector class and it adds the element at the end of the Vector.

here addElement() method doesnt belong to the List interface but is an extra member method of the Vector class.
*/

		System.out.println("\n The 1st element of the Vector without removing is "+al.firstElement()+"\n the last element of the Vector without removing is "+al.lastElement());

		Iterator<String> it=al.iterator();

/*
Iterator is a predefined interface of java.util package and iterator() is a predefined non static method of the ArrayList class.

the iterator() non static method of the ArrayList class returns the implicit object of the Iterator interface.

*/

		System.out.println("\n The elements of the vectorusing the Iterator are ");

		while(it.hasNext())
		{
			String str=it.next();

			System.out.println(str);


		}

/*
hasNext() is a predefined non static method of the Iterator interface and it checks are there are more elements of the array list al to be accessed or not.
If yes it returns true and if not it returns false. If the hasNext() returns true then the body of the while loop will be executed and the non static method next() returns the next element of the array list al and which is of the String type.

when we created the object of Iterator interface in the statement:
Iterator<String> it=al.iterator();


here we mentioned the generic type of the Iterator interface object it as String.

so here in the body of the above while loop,when we write:
String str=it.next();


here we have not converted the return value type of al.next() to the String class type before assigning it to the reference variable str of String class.


here we didnt need to convert it.next() into the String class type because we had specified the generic type of the Iterator interface object it as String when we created its object and assigned it tot it reference variable using al.iterator().



But if we had created the object of the Iterator interface as below:

Iterator it=al.iterator();

here we have not specified any generic type as String or any other class type for the Iterator interface object it.


so when we call the next() method on it object of Iterator interface, we get the element as the object of STring class but whose reference variable type is the Object class where Object is the superclass of every class in java.


so here if we write String str=it.next(), and directly assign the return value of it.next() to the reference variable str of the STring class in the body of the above while loop we get a compiler error because in this case as we discussed above the class type of str ,must be the Object class.




so here we need to rewrite the statement as:
String str=(String)(it.next());

here we are converting the reference type of it.next() return value from the Object class to the String class and this is called as narrowing conversion where we are converting from the superclass type to the subclass reference type.



using the Iterator interface object it we can only access the elements of the collection and we can remove the elements of the collection.

but we cannot add or modify the elements of the collection using the Iterator interface.


The iterator() method is a predefined method of the Collection interface and so this method is inherited in all the classes which implement the List interface or the Set interface or the Queue interface which are the sub interfaces of Collection interface.


Using the Iterator interface object we can access the elements only in the forward direction.

*/


	ListIterator lt=al.listIterator();


/*
ListIterator is a predefined interface of java.util package and listIterator() is a predefined non static method of the List interface.

so it can be used only for the lists in java i.e objects of class ArrayList,LinkedList,Vector and Stack class.


This means that we cannot use the object of the ListIterator for sets and queues.


ListIterator interface is a sub interface of the Iterator interface and using the ListIterator along with accessing and removing elements from the list we can add and modify the elements of the list using some predefined methods of the ListIterator interface.
*/


	System.out.println("\n The elements of the vector in the forward direction are ");


	while(lt.hasNext())
	{
		String str=(String)(lt.next());

		System.out.println(str);



	}

/*
here we have converted lt.next() into the String class type becaise we hadnt mentioned any generic type for the ListIterator interface object lt when we created it using the statement:
ListIterator lt=al.listIterator();

so here lt.next() returns the element of String class but in form of reference of the Object class which is the superclass of every class in java.

so we have done explicit type conversion or narrowing conversion on lt.next(),and converted it into the String class type and then assigned it to str which we displayed on screen

*/



	System.out.println("\n The list iterator on vector in the reverse direction is ");


	while(lt.hasPrevious())
	{
		String str=(String)(lt.previous());

		System.out.println(str);

	}

/*
hasPrevious() is a non static method of the ListIterator interface and it checks whether there are any previous elements of the array list al to be accessed using lt or not.

If yes, it returns true else false.

previous() is a non static method of the ListIterator interface which will physically move lt to the previous element in the array list al
and here the previous String element of al is returned in String format but with the reference type of the Object class and so we have converted lt.previous() return type into the String class.
else we get a compiler error.
*/


	System.out.println("\n The elements of the vector using the for each loop are ");


	for(String str80:al)
	System.out.println(str80);


/*
we can use the for each loop for accessing the elemements of the collection only when we used a generic type for the collection while creating the object of that collection.

here we had mentioned the generic type for al array list as String when we created its object and so we can use the for each loop on it to access its elements one by one.

but we cannot use the for each loop on the collection which is not having any generic type i.e a non type safe collection else we get a compiler error.

*/


	Enumeration<String> e=al.elements();

/*
elements() is a predefined non static method of the Vector class and here al.elements() returns the implicit object of a predefined interface called as the Enumeration interface of java.util package.

so here Enumeration interface object e is also used to access the elements of the Vector like Iterator and ListIterator interfaces.

elements() method is not present in the general List interface but only in the Vector class.


Enumeration interface object e in the above case can be used only for accessing the elements of the collection with which it is associated and so here e object of Enumeration interface cannot be used to remove,add or modify the elements of the collection like the ListIterator or Iterator interface(which can also remove elements from the collection).


Vector is a legacy class means it was introduced in the old version of java from jdk 1.

Enumeration,Iterator and ListIterator are called as cursors in java means they are those interfaces whose objects can be used to access elements of a collection at a time.

Enumeration interface is also a legacy cursor because it is asscoiated with the Vector class object which is a legacy class.

*/

	System.out.println("\n The elements of the vector using the enumeration are ");
	while(e.hasMoreElements())
	{
		String str21=e.nextElement();

		System.out.println(str21);

	}

/*
hasMoreElements() is a predefined non static method of the Enumeration interface which returns true or false based on whether there are any more elements of the collection to be accessed or not and so here e.hasMoreElements() returns true or false whether there are any more elements to be accessed of vector al or not.

but the position of the e object in the vector al remains unchanged by hasMoreElements().

nextElement() is a non static method of the Enumeration interface and e.nextElement()will return the next String element of the Vector al and here we had mentioned the generic type of Enumeration object e as String class and so e.nextElement() returns the next element of vector in form of reference type of String class and so here we dont need to convert the return type of e.nextElement() to the String class before assigning it to str21

*/
	System.out.println("\n The fact that the element abc def is removed is "+al.removeElement("abc def"));

/*
here removeElement() is a non static member method only of the Vector class and it is an extra member method of the Vector class and not present in the List interface.

here the al.removeElement("abc def") will remove the element "abc def" from the vector and will return true or false based on whether the element has been successfully removed from the vector or not.

so this removeElement() method works in the same way as the normal remove() method of List interface which is supplied as argument the element to be removed from the list.

instead of al.removeElement("abc def") we can write al.remove("abc def") with no error. 
*/



al.removeElementAt(0);


/*
here removeElementAt() is a non static method of the Vector and al.removeElementAt(0) removes the element at index 0 in the vector al and its return type is void and so it doesnt return anything.

again removeElementAt() is a non static method only of the Vector class and is not present in the List interface.

here we can also call the remove(0) method on al above, and it will work but here the element at index 0 removed is also returned back by the remove(0)

*/ 

	System.out.println("\n The fact that the index kaveesh nadkarni is present in the vector is "+al.contains("kaveesh nadkarni"));

/*
contains() is a non static method of the ArrayList class and here it returns true or false based on whether the element is present in the arraylist or not.

so here al.contains("kaveesh nadkarni") returns true or false based on whether the element kaveesh nadkarni is present in the array list al or not.

*/


	String str18=al.get(2);

	String str19=al.elementAt(2);
/*
here elementAt(int index) is a predefined non static method of the Vector class and al.elementAt(2) returns the value of the element at index 2 in the Vector.

elementAt() is only present in Vector class and not in the List interface.

it works in the same way as the al.get(2) method and we can also call get() method on Vector.

*/



	System.out.println("\n The element at index 2 in the array list without removing are "+str18+"\n"+str19);



	al.set(2,"rajesh rao");

/*
here the element in the array list al at index 2 is removed and in place of it "rajesh rao" is inserted at index 2 in the array list al.

set()is  a predefined non static method of the ArrayList class

*/
	System.out.println("\n The total number of elements currently in the arraylist al are "+al.size()+"\n the fact that the array list is now empty is "+al.isEmpty());



	Object arr[ ]=al.toArray();

/*
here toArray() is a non static method of the ArrayList class and it converts the ArrayList elements stored in al into a 1d array object of the String class type because the generic type of al is String and the number of elements of that 1d array object created is equal to the current number of elements in the array list al.

but al remains unchanged and its elements are just extracted and a 1d array object of the String class type is generated from these elements of al using the toArray()method.


here we are assigning the 1d array object of STring type returned by al.toArray() to a array reference variable arr of the Object class.

because al.toArray() returns a 1d array object but in form of array reference type as Object class.

so here arr must be compulsarily declared as Object class array reference variable else we get a compiler error.

*/

	System.out.println("\n The elements of the array list al in the 1d array format are ");


	for(Object o:arr)
	{
		String str40=(String)(o);

/*
here we need to convert the reference type of the o reference variable of Object class into the String class type before assigning it to str40 else we get a compiler error

*/

		System.out.println(str40);

	}


	List l18=Arrays.asList(arr);


/*

Arrays is a predefined class of java.util package and asList() os the static member method of the Arrays class.

here asList() will convert any array of any type into a list.

here Arrays.asList(arr) will extract the elements of arr and form a list out of them where the elements of the array are now the members of a list object implementing some interface which extends the List interface of java.util package.

but there is no specific type of list returned by the asList() method and so we have dclared the l18 reference variable using the List interface and no general class implementing the List interface.

so if we had declared the l18 as some specific list classlike ArrayList,Vector etc we would have got an compiler error so l18 must be declared as List only.

we can now access and display the elements of the list l18 using the Iterator or ListIterator interface.

*/

	System.out.println("\n The elements of the converted array list using the ListIterator interface are");


	lt=l18.listIterator();

	while(lt.hasNext())
	{
		System.out.println("\n"+(String)(lt.next()));


	}


	System.out.println("\n The index of the 1st occurance of vivek anand nadkarni in the arraylist al is "+al.indexOf("vivek anand nadkarni")+"\n the index of the last occurance of vivek anand nadkarni in the array list al is "+al.lastIndexOf("vivek anand nadkarni"));

/*
these work in the same way as the corresponding methods of the String class and if the element is not found then al.indexOf()or al.lastIndexOf() return the value -1 means that the element is not found

*/
	System.out.println("\n The current capacity of the vector is "+al.capacity());

/*
capacity() is a non static method of the Vector class and now it returns 10 in the above statement

*/

	al.removeAllElements();

/*
removeAllElements() is a non static method of the Vector class and it will remove all the elements from the Vector and it is present in the Vector class only and can be called only on the Vector class object and not on any other list.

this works same as the clear()method of the List interface and we can call clear() method also on the Vector class object instead of the removeAllElements() method

*/
	System.out.println("\n The fact that the array list al os empty is "+al.isEmpty());

	}


	public static void main(String args[ ])
	{
		Vector11 a=new Vector11();

		a.opns();

	}

}