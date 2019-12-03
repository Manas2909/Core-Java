
//array list pgm 2


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



		System.out.println("\nThe elements of the array list al currently are "+al);	

		System.out.println("\n The element at index 0 removed is "+al.remove(0));

/*
here remove() is a non static method of ArrayList class and when it is supplied the index of the element to be removed then the method will remove the element and return the element removed

*/


	al.remove("abc def");

/*
this is another version of the same remove method of the ArrayList class.here the remove method accepts the element to be removed from the arraylist and returns true or false based on whether the element was successfully removed or not.

here there is a predefined class called as Object class of java.lang package and it is the by default superclass of every class in java.

here Object class has a predefined method named public boolean equals(Object o).

public boolean equals(Object o)
{


}


Imagine  there  is a class named Student.

class Student
{
	String name;
	int id;

	Student(String name1,int id1)
	{
		name=name1;
		id=id1;

	}



}

now we create an ArrayList of generic type Student.

ArrayList<Student> al=new ArrayList<Student>();

this means we can add only the objects of class Student into al,else we get a compiler error.

Imagine we add 2 objects of class Student into al as:

al.add(new Student("abc def",11));

al.add(new Student("mno pqr",19));


al.contains(new Student("abc def",11));

here contains is a predefined non staticmethod of ArrayList class and it returns true or false based on whether the object of the Student class passed as argument to contains, is present in the array list or not.

here for that the contains needs to compare its Student class object argument to the objects of Student class already present in al.

for that when the JVM is first comparing the 1st element of al which is tnhe object of class Student with name "abc def" and id 11, then the JVM will call the predefined method of Object class called as equals() method on the 1st element of al with name as "abc def" and id as 11.

now the JVM checks what is the class type of the 1st element of arraylist al.

here the JVM checks that the 1st element of al belongs to class Student and then JVM sees the class Student has not overridden the public boolean equals(Object o) method the Object class in itself.

so JVM calls the predefined equals method already present in the superclass Object on that 1st element of array list al and the object of class Student which is the argument to the contains method, is now passed as the argument to the equals method called on the 1st element of al.

now the default implementation of equals in Object class uses the == operator to compare the object on which it is called and the object which is passed to it as the argument and as we know when == operator is used between 2 objects it returns true only when the 2 objects represent the same physical memory or have the same address.

here we have used the new keyword 2 times once for creating the 1st element of al which is the object of class Student and againw e have used new keyword on class Student in the argument to the contains method called on al.

so the 2 objects being compared by the equals method, where the 1st object is the 1st element of al on which equals is called by the JVM and the 2nd object is also the new different object of class Student passed as argument to the contains method of al and then passed automatically to the equals method called on the 1st element of al, are not having the same address in RAM memory and so here the equals method comparing them returns the false value as per the default implementation of equals inside the class Object.

so even though we feel that both the Student objects being compared have the same name and same id and they are equivalent, but because both the objects of class Student are not having the same RAM memory area address or hashcode so equals method called by the JVM automatically for comparisn of these 2 objects return false and so even the contains method called on al will returnb false and this means that the Student with name abc def and id 11 is not present in the array list al.

but logically this Student is present in the array list because every student can have one and only 1 id in school.

so now we should not depend on the default implementation of the equals method of Object class to compare the 2 objects of class Student where atleast one of the objects b eing compared is a part of the collection.

so for that we must ourselves override the public boolean equals method of Object class in class Student as follows:



class Student
{
	String name;
	int id;

	Student(String name1,int id1)
	{
		name=name1;
		id=id1;

	}


	public boolean equals(Object o)
	{
		Student s2=null;
		if(o instanceof Student)
		s2=(Student)o;

		if((this.name.equals(s2.name)==true)&&(this.id==s2.id))
		return true;
		
		else
		return false;

	}


here if we want to override the equals method of class Object in our user defined class then we must have the class type of the parameter o as Object classonly because that is the parameter of the equals method in class Object and as per rules of overriding the overriding method in subclass must exactly have the same parameter list as the overridden method of the superclass.

so if we have the data type of the parameter of the equals method in class Student as some other data type, then we dont get any compiler error because then it is treated as method overloading of the equals method inside class Student one having the parameter which is a reference variabke of the Object class and which is inherited from the Object class which is the superclass of Student and other method with same name equals which we have defined with other parameter list in the class STudent and so this is not overriding.


also the access modifier of the equals method defined in class Student must be public and its return type must be compulsarily boolean as per the rules of method overriding.


here when the al.contains(new Student("abc def",11)) statement is executed  then the equals() method of class Student explicitly defined inside the class Student and which overrides the equals method of class Object is called on the 1st element of array list al which is a different object of class Student with the same name and id as "abc def" and 11 resp.


the object of class Student passed as the argument to the contains method is passed automatically by the JVM into the equals method called of the class Student on the 1st element of the array list al of generic type Student.

so this object of class Student passed as argument to equals by JVM is stored in the reference variable o which is the parameter of the equals method defined explicitly in class Student.

now we are using the instanceof operator to check if the parameter o actually contains the object of class Student or not and if ot returns true then we are converting the reference type of o from Object to Student anbd storing it in the reference variable s2 of class Student.


This instanceof operator is used to avoid the java.lang.ClassCastException runtime exception in case o doesnt contain the object of class Strudent or object of any subclass of class Student and yet we convert it intoi Student to assign to s2.


now this reference variable used inside the body of the equals method of class Student will refer to the currently executing object of class Student or the object of class Student on which the equals method was called automatically  by tbhe JVM and in this case 'this' refers to the 1st element of al and the s2 reference variable refers to the object of class Student passed as the argument to the contains method of the al array list and which was then automatically passed by JVM into the parameter o of the equals method called on the 1st Student class object.

so s2 refers to object of class Student passed as argument to contains().

and now because both objects of class Student being compatred have the same name value and id value so equals method returns true and not false because here the overriding equals  method of class Student is not using the ==operator to compare the 2 Student objects but the values of both their data members.


There is one more rule in java.

If the 2 objects being compared where one of the objects being compared is a part of the collection are proven to be equivalent to each other when the equals method comparing them returns true, then in that case another predefined method public int hashCode() method of the Object class is used by the JVM further after the equals method con paring the 2 objects returns true.



public int hashCodde() is a non static method of the Object. When the hashcode method is called on any object of a class which has n ot overridden the hashCode() predefined method of class Object,then in that case the JVM calls the default predefined hashCode() method of the class Object on the object of the other class and in that case the int value returned by the hashcode is a unique int value related to the address or the hashcode of the object in RAM memory.

so here if the hashCode() method is calle by the JVM on the 2 objects of class Student, where the 1st object of class Student is the 1st element of the array list al on which equals was automatically called by JVM and the 2nd Student object is the one passed by the user as argument to the contains method of al and which was then passed by JVM to the equals method called on the 1st Student class object, then if the hashCode() is individually called on these 2 objects of class Student, then hashCode() returns a different value for both the Student class objects because both the objects are created using 2 separate new operators and have different RAM memory allocated.

as per the rule of JVM if 2 objects are proven to be equovalent by the equals() method  then the public int hashCode() method when called inidividually on them must compulsarily return the same value and else they will not proven to be duplicates or equivalent to each other even if the equals method comparing them returned true.


so here we need to override the public int hashCode()method inside the class Student along with the equals method.

and we rewrite class Student as follows:


class Student
{
	String name;
	int id;

	Student(String name1,int id1)
	{
		name=name1;
		id=id1;

	}


	public boolean equals(Object o)
	{
		Student s2=null;
		if(o instanceof Student)
		s2=(Student)o;

		if((this.name.equals(s2.name)==true)&&(this.id==s2.id))
		return true;
		
		else
		return false;

	}


	public int hashCode()
	{
		return id;

	}
}

here if the equals method when comparing the 2 objects of class Student returns true means that the 2 Student objects have the same id and so when the hashCode() method is called individually on the 2 objects of class Student where the class Student has overridden the public int hashCode() method then the return value of the hashCode method when called on the 2 objects of class Student will be the same because both the 2 objects have the same id and so their equals method returned true.



here al.contains(new Student("abc def",11)) will return true even if the 2 objects of the class Student whioch have the same name and id are not having the same address in RAM memmory or heap memory because we have ourselves overriden the public boolean equals(Object o) and the public int hashCode() methods of class Object and not relied on the default implementation of these methods inside the class Object.	

other methods of the collection pgms use the same technique of calling equals and hashCode() when they need to compare the element of the collection for carrying our further processing.

so here if the equals returns true then only the JVm will call the hashCode method for further comparisn and if the hashCode also in this case returns equal value for the 2objects being compared in case of collection pgms, then only they will be taken as equivalent by the JVM.

The String class and the wrapper class already override the equals and the hashCode() methods of the class Object in them and so when we use String and the wrapper classes as the generic type of the collection we dont need to worry about overriding equals or hashCode() method of the class Object.
*/


		System.out.println("\n The elements of the array list using the for each loop are ");

		for(String str11:al)
		{
			System.out.println(str11);


		}

/*
the for each loop can be used only for the collection having a generic type ie the homogenous collection and cannot be used for the collection object which doesnt have any generic type and which is non type safe and elsae if we still use the for each loop for the non generic collection we get a compiler error because in case of the non generic collection it is not known which element is present at that location in the collection and of which class type

*/

		Iterator<String> it=al.iterator();

		System.out.println("\n Elements of array list using iterator in the forward durection are ");

		while(it.hasNext())
		{
			String ele=it.next();
			System.out.println(ele);
		}

/*
iterator() is a non static method of the Collection interface and so it is present in every class implementing the interface which is the sub interface of the Collection interface.

this iterator() method returns an implicit object of the Iterator interface and assigns it to the reference variable it.

here we have mentioned the generic type of it as String so as to tell the java compiler that it will be accessing the elements of a collection whose generic type is String and so the java compiler will know that whatever is accessed by the next()method of it is a String only.

hasNext() is a non static method of the Iterator interface and it checks whether there are any more elements of the  collection al to be accessed using it or not.
If yes it returns true and doesnt move it forward in the collection al.

here next()method is a non static method of the ArrayList class which actually moves it forward to the next element of the collection al and returns its value in String format and the reference type of the collection returned is also of the String type because we had mentioned String as the generic type of the Iteratot interface reference variable it when its object was created.

and if we hadnt mentioned the String as the generic type of the it then the java compiler would not know what was the reference type of the element returned by it.next() of the collection al and so there we would need to compulsarily type cast the return value of it.next() into the String class type and then only assign it to the element ele of the String type else we would get a compiler error.

and here because we have used the generic type for it as String so no type conversion of it.next() into String is required.

Using the Iterator interface we can ony access the elements of the collection one by one or we can also remove the elements of the collection one by one where remove() is a non static method of the Iterator which removes the last element returned by the next()method of the Iterator interface.

also using the Iterator we cannot  move in the backward direction and only in the foreard direction
*/		
		
			System.out.println("\n The elementrs of the collection using the list iterator in forward direction are ");




	ListIterator<String> it1=al.listIterator();

/*
here listIterator() is a non static method of the ArrayList class and it returns the implicit object of the ListIterator interface and assigned to reference variable it1 whose generic type mentioned is String and so it1.hasNext() and it1.hasPrevious() wont need any explicit type conversion into String type.

The ListIteror interface is the sub interface of the Iterator interface and listIterator() is a non static method of the List interface and so can be used for only those classes ArrayList,LinkedList,Vector and Stack which implement the List interface and it cannot be called on other collection objects of other classes not implementing the List interface else we get a compiler error.

Using the ListIterator interface we can access,remove or add or modify elements of the list which cannot be done using the Iterator interface which can only access and remove the elements of the collection.

now how the ListIterator modifies,adds or deletes elements from the collection is not at all important.

Also using the ListIterator we can move in the backward direction and the forward direction and for that we have methods hasPrevious and  previous()where the hasPrevious()will just check that are there any elements of the collection to be accessed using the ListIterator object  before the element accessed by the list iterator in the backward direction
and doesnt move the listiterator in the collection.

previous() method of the ListIterator will actually move list iterator   backward in the collection and will return the previous element of the collection where if the generic type of the ListIterface object was n ot mentioned then the previous element will be returned of the reference type Object class.


*/
		while(it1.hasNext())
		{
			String ele=it1.next();
			System.out.println(ele);
		}





		System.out.println("\n The elementrs of the collection using the list iterator in back ward direction are ");


	while(it1.hasPrevious())
		{
			String ele=it1.previous();
			System.out.println(ele);
		}

}
	public static void main(String args[ ])
	{
		Arr1 l1=new Arr1();

		l1.opns();

	}

}