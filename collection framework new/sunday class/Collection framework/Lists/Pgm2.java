//array list pgm continuation

import java.util.*;

class ArrayList11
{

	ArrayList<String>al=new ArrayList<String>();


	void  opns()
	{
		al.add("abc def");
		al.add(1,"mno pqr");
		al.add("kaveesh nadkarni");
		al.add(3,"xyz tyu");
		al.add(4,"vivek anand nadkarni");


/*
here if we write al.add(2,"akshay"), then the element "akshay"will replace the element kaveesh nadkarni at index 2 and the oldelement at index 2 which is "kaveesh nadkarni" will be moved below the new element added at its index which is akshay.

*/

		Iterator<String> it=al.iterator();

/*
Iterator is a predefined interface of java.util package and iterator() is a predefined non static method of the ArrayList class.

the iterator() non static method of the ArrayList class returns the implicit object of the Iterator interface.

*/

		System.out.println("\n The elements of the array list using the Iterator are ");

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


	System.out.println("\n The elements of the list in the forward direction are ");


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



	System.out.println("\n The list iterator in the reverse direction is ");


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


	System.out.println("\n The elements of the ArrayList using the for each loop are ");


	for(String str80:al)
	System.out.println(str80);


/*
we can use the for each loop for accessing the elemements of the collection only when we used a generic type for the collection while creating the object of that collection.

here we had mentioned the generic type for al array list as String when we created its object and so we can use the for each loop on it to access its elements one by one.

but we cannot use the for each loop on the collection which is not having any generic type i.e a non type safe collection else we get a compiler error.

*/


	System.out.println("\n The fact that the element abc def is removed is "+al.remove("abc def"));

/*
here remove() is a predefined non static method of the ArrayList class and it will remove the element from the array list and return true or false if the element was successfully removed from the array list or not.

This is one of the 2 versions of the remove method in the ArrayList class and in this version we pass the element to be removed as argument while calling the remove method

*/



	System.out.println("\n The element at index 0  removed is "+al.remove(0));



/*
here the element at index 0 is removed from the array list al and this remove(0) method also returns the value of the element removed from the array list al.

the index counting of the elements in the collection starts from 0.

If we pass any index to the remove method where we want the element at that index to be removed from the array list, and that index is not there in the array list then we get the runtime exception when we call the remove method with that index

*/


	System.out.println("\n The fact that the index kaveesh nadkarni is present in the array list is "+al.contains("kaveesh nadkarni"));

/*
contains() is a non static method of the ArrayList class and here it returns true or false based on whether the element is present in the arraylist or not.

so here al.contains("kaveesh nadkarni") returns true or false based on whether the element kaveesh nadkarni is present in the array list al or not.

*/


	String str18=al.get(2);

/*
get() is a non static method of the ArrayList class and it returns the element at the specific index in the array list.

here al.get(2) returns the String element present at index 2 in the array list.

here we dont need to convert the return type of al.get(2) into the String format before assigning it to str18 reference varianble of String class.

because we have already mentioned the generic type of the ArrayList as STring and in case we didnt mention any generic type for the ArrayList al while creating its object in that case the return value of al.get(2) will be of reference type Object class.

remove(int index) method of the ArrayList class returns the element at the index in the array list specified as the argument to the remove method and then removes that element also.

get(int index) non static method of the ArrayList class will just return the element at index in the array list specified by index argument to the get() method but it doesnt remove the element at that index in the array list al.
*/



	System.out.println("\n The element at index 2 in the array list without removing are "+str18);



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

	al.clear();

//clear is a non static method of the ArrayList class which will empty //the contents of the array list al i.e remove all elements of al

	System.out.println("\n The fact that the array list al os empty is "+al.isEmpty());

	}


	public static void main(String args[ ])
	{
		ArrayList11 a=new ArrayList11();

		a.opns();

	}

}