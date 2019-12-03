/*Collection framework:

Array is an indexed collection of homogeneous data elements of the same data type and a fixed size.

in the array the size of the array cannnot be changed i.e increased or decreased dyanamically during the pgm execution. so a lot of memory space in case of arrays may be wasted in lesser elements are entered as compared to the number of elements allocated to the array or the memory may fall short if there are more inputs to be stored inb the array than the  no. of elements allocated to the array.


in array we can store elements of only the same data type. but this disadvantage can be overcome by declaring the array reference variable of Object class where Object is the by default superclass of each and every class in java.

Object arr[ ]=new Object[1000];

here we have allocated RAM memory only for 1 one dimensional array object of Object class whose size is 1000 but every element of arr will have initial value as null because null is the default value for every class in java and so here 1000 objects of Object class are not created as thought so.


arr[0]=new Student();

arr1[1 ]=new String("abc");

here as we know in java the reference variable of the superclass can refer to the object of the subclass which we are doing in above 2 statements and so in this way we can have an array of elements of different clas types just by declaring the array reference variable of class type Object of java.lang package.





in arrays we can store elements of primitive data type also along with the user defined data types like objects of a class.


in case of arrays, the arrays are not based on a fixed data structure or the arrays are internally stored in java like a sequential collection of elements of that data type.

so if we want to implement data structures like linked list,stack,queue etc we need to write our own logic for that using the arrays comcept and this makes the code very complicated.

but arrays have 1 use that they are easy to use and for simple data operations they are preferred because the elements can be stored,displayed and accessed in the array normally using simple for loop etc.













Collection is a collection of objects of different or same class type.

The collections cannot store primitive values or primitive data type elements ie we can only store user defined data type elements like objects of a class in a collection. If we try to store primitive elements in the collection we get a compiler error.


The size of the collection can be increased or decreased dyanamically as per the requirement and so from the memory management point of view the collections are more use ful than the arrays.



The collections are based on predefined data structureslike linked list,stack,map etc.

There are separate predefined classes in the api for the collection pgms using which we can implement the appropriate data structure without writing our own logic.

This makes implementing data structures very convenient and easy in the collection pgms.


e.g there are predefined classes like Stack,LinkedList etc whose objects can be created and then the individual sub objects of a class stored in that object of class LinkedList or Stack class of java.util package will make the JVM to store the subobjects internally in the same way as we perform the linking or storing of elements of linked list and stack in the pgms of C language.

so we dont need to write separate for loops etc but just need to use the predefined methods of classeslike LinkedList,Stack,Queue etc for the appropriate storage and acecss of elements in these data structures needed.



















Collection framework:
Collection framwork is a set of predefined classes and interfaces of java.util package which are used to create such objects which can store other individual objects which are either homogeneous or heteregeneous in the main object representing the collection.


Collections is a predefined class of java.util package.

Collection is a predefined interface of java.util package.


Collection interface is the super interface of all the classes and interfaces of  collection framework in java.util package.


The collection framework is built on 4 main interfaces:
List interface
Set interface
Map interface
Queue interface





out of these 4 interfaces the List interface,Set interface and ueue interface are the sub interfaces of the Collection interface.

but Map interface is not the sub interface of the Collection interface because in maps the individual elements are a combination of 2 sub elements or 2 sub objects one sub object representing the key object and the other sub object of the inidividual object of the map representing the value object. We enter the key in case of maps and retrieve the value associated with that key.







1. List interface:
This interface is used to create lists in java and these lists are based on the concept of the resizeable 1d array data structure.

we can store duplicate elements in the lists created from the List interface.

The insertion order of the elements of the list are preserved i.e the order in which the elements are entered by  in the list is same as the order in which they are stored in the Ram memory in that list and which is again the order in which the elements of the list are accessed.


in the list we are allowed to store null values or elements with null values.

in the list, the individual elements can be accessed  by using an index just like we do for the array.

The index counting of the elements of the list starts from 0 just like the array.



The classes implementing the List interface are:
1. ArrayList class
2. Vector class:
3. Stack class
4. LinkedList class










ArrayList class:
in the ArrayList class the predefined methods are not synchronized. so multiple threads can operate on the same ArrayList class object and so the ArrayList class object is not thread safe and so it is fast but it is not secure.


ArrayList al=new ArrayList();

here the ArrayList class object with the default initial capacity as 10 is created and so at most we can store 10 objects of any class type in the arraylist al.

the above array list al is the non generic array list or non type safe array list because we can store henteregenous elements of any class type in the array list.

here we havent mentioned any class type while creating the object al of ArrayList class and so al can store objects of any class type in it.


But here if we want  to retrieve the element or the object of the array list we use the get()predefined method of the ArrayList class on al and we pass it the index of that element to be rtrieved from the arraylistt.

but here al is a non generic array list where elements can be stored of any class type.

so the get()method of the ArrayList when supplied with the index of the element in the ArrayList returns the actual element of the array list but whose reference variable type is of the Object class which is the by default superclass of every class in java.

so imagine if we have stored a object of String class at index 6in the arraylist, 

and if we write
String str=al.get(6);

here the get()method returns the element at index 6 i.e the 7th element of al but of reference type Object and this we are assigning directly to a reference variable of String class.

so we get a compiler error and so we must explicitly convert al.get(6) into the String class type before assigning it to str.


String str=(String)(al.get(6));

but in case we have not stored the instance or object of String class at index 6 in the array list then we dont get a compiler error but a runtime error or exception called as java.lang.ClassCastException class which is a runtime exception class in java and this may cause the pgm to terminate.



so we write a generic type or the class type or the data type for the array list or any collection like vector while creating the object of ArrayList class and assigning it to al.

ArrayList<String> str=new ArrayList<String>();

here String class name mentioned in the <> brackets while creating the object of the ArrayList class al is the generic type of the ArrayList and we can add only objects of String class into al and if we try to add another object of a different class into al we get a compiler error.

al.add(new Student());

here we have added the object of Student class to the array list al whose generic type is String,so we get a compiler error and so the runtime exception ClassCastException is avoided.


now when we call the get() method on the ArrayList object al, the get() method will return the object of String class at the index specified as the argument to it and the reference type of the STring class object returned is also of the String and not of the Object class format and so here we dont need to type cast the return value of al.get() method call.

so if we now want to access a String element at index 10 in above array list al whose generic type is String, we just write:
String str=al.get(10);

without the need for explicit type casting into the String class type and so here the ClassCastException at runtime is always avoided in the collection with any class type as the generic type.







ArrayList al=new ArrayList();

when the size of the arraylist becomes equal to the capacity the capacity of the array list is  increased by formula:
new cpacity=(old capacity*(3/2))+1;







If we want to create a synchronized version of the array list suppose say of the object al,

we write

List al1=Collections.synchronizedList(al);

Collections is a class and synchronizedList() is the static member method and so here the al collection is converted into the synchronized format and assigned to the al1 object  whose generic type must alaways be List and  no ArrayList because synchronizedList() returns the arraylist object in synchronized format but where the reference  of the ArrayList object returned is the List interface and so al1 must be declared compulsarily of only the List type else we get a compiler error.

		List interface

ArrayList class	LinkedList class	Vector class
				Stack class

Stack class is the subclass of the Vector class.


LinkedList class also implements the Deque interface of java.util package which is the sub interface of Queue interface and so LinkedList class is the only class of java.util package which implements more than 1 main sub interface of the Collection interface of java.util package.

Dequeue is the double ended queue where we can add and remove elements from both ends or sides of the queue which is not possible in normal queue.


*/

//array list pgm


import java.util.*;

class Arr1
{

	ArrayList<String>al=new ArrayList<String>();


	void opns()
	{
		al.add("kaveesh nadkarni");

		al.add("vivek anand nadkarni");


		al.add("sangeeta nadkarni");


		al.add("vaibhavi nadkarni");

		al.add("abc def");

/*
here add() is a predefined non static method of the ArrayList clasa and it adds the particular String element in  this case at the end of the array list al.
*/

		System.out.println("\nThe elements of the array list al currently are "+al);	


/*

There is a predefined class called as Object of java.lang package and it is the by default superclass of every class in java and its methods are hence inherited by all the user defined and predefined subclasses in java.

There is a predefined method of the Object class. Its syntax is as follows:

public String toString()
{


}

imagine a class called Student

class Student
{


}

Student s=new Student();
System.out.println(s);

here the jvm checks that whether the object s of class Student has overridden the public String toString()method of class Object or not.

here the JVM finds that the class Student has not overridden the public String toString()method of class Object.

so the JVM calls the default toString()predefined method body of the class object on the referece variable s referring to the object of class Student.


the default toString()method of Object class when called on an object of any class in java where the toString()method is not overidden in class that other class, then the following value is returned in String format by the toString()method:

"classname@hashcode or address of the object"


so here in thia case when the s object of class Student is passed directly as the argument to System.out.println(), tthe default predefined toString()method of class Object is called and which will display the classname@hashcode of object s on the screen.


Now imagine the class Student has overridden the method toString as shown below:


class Student
{
	String name;
	int id;
	Student(String name1,int id1)
	{

		name=name1;
		id=id1;
	}


	public String toString()
	{
		return(name+" "+id);


	}

}


Student s=new Student("abc",19);

System.out.println(s);

here abc 19 is displayed on screen which is the STring value returned after calling of the toString() method on the object s of class Student when it was passed as the argument to System.out.println().







The java.lang.String class and wrapper class like Integer class,Float class etc inteernally override the public STring toString()method of the Object class and return the value stored in their objecct when the toString() method gets called on object of String class or wrapper class.

String str=new String("abc");

System.out.println(str);

here abc is displayed on screen.




when any collection object is directly passed as the argument to System.out.println(), the toString() method gets called on every individual element of the collection and a group of all the values obtained after calling toString() method on every element of the collection object is created by the JVM and this group of values is displayed on screen in the [ ] automatically.



here generic type of the array list collection is String and so when we pass al as the argument to System.out.println() directly, the toString() method gets called automatically on every String object of arraylist al and the return values of that toString() when called on every String element of al is displayed in[ ] brackets on screen and where there is a comma inserted between the 2 different return values of toString() inside the [ ] bracket.


So output of System.out.println(al), will be:
[kaveesh nadkarni,vivek anand nadkarni,sangeeta nadkarni,vaibhavi nadkarni,abc def].


*/
	}


	public static void main(String args[ ])
	{
		Arr1 l1=new Arr1();

		l1.opns();

	}

}