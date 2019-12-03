/*
 * 
 * Map interface:		Dictionary class
 * 
 * Hashtable class
 * 
 * Properties class
 * 
 * here Hashtable class is a predefined class of java.util package.
 * 
 * 
 * Hashtable class implements the Map interface and extends another class
 * called as Dictionary class using the concept of multiple inheritance in
 * interface.
 * 
 * 
 * There is no relationship between the classes Dictionary and Map interface.
 * 
 * The Properties class is the subclass of Hashtable class
 * 
 * In case of the Hashtable class, the methods are synchronized.
 * 
 * Multiple threads cannot operate on the same object of Hashtable class at the
 * same time.
 * 
 * so hashtable object is thread safe and is is slower than hashmap.
 * 
 * 
 * In hashtable we cannot store elements with null keys and not even with null values
 * even once in the hashtable.
 * 
 * in the hashtable, the elements are stored as per the hashcode of the keys
 * 
 * 
 * so in the hashtable the insertion order of the elements is not preserved.
 * 
 * 
 *
 */



import java.util.*;

class Map2 
{
	Hashtable<Integer,String>hm=new Hashtable<Integer,String>();

	/*
	 * when we create the object of the Hashtable class, we can pass 2 arguments
	 * to the constructor of the Hashtable class.
	 * 
	 * The 1st argument is thne capacity which is the maximum number of elements
	 * which can be stored in the hashtable.
	 * 
	 * by default the capacity of the hashtable is 11.
	 * 
	 * The 2nd argument we can pass to the constructor of the Hashtable class
	 * is the load factor which is a float value and which is same as the load
	 * factor for HashMap.
	 * 
	 * by default the load factor of Hashtable is 0.75f
	 */
	void opns()
	{
		hm.put(17, "abc def");
		
		/*
		 * here put() is a predefined non static member method of the HashMap.
		 * 
		 * here hm.put(17,"abc def") will insert an element in  the hashmap
		 * with key as 17 or new Integer(17) and value as "abc def".
		 */
		hm.put(21, "mno def");
		hm.put(13, "abc def1");
		hm.put(19, "abc xyz");
		
		/*
		 * in the hashmap we can have elements with duplicate values but
		 * not duplicate keys.
		 * 
		 * in the hashmap we can canot insert element with null key but
		 * we can insert element with null value but only once in the hashmap
		 */
		
		System.out.println("\n The element at key 19 is "+hm.get(19));
		
		/*
		 * get() is a predefined non static member method of the HashMap class
		 * 
		 * hm.get(19) returns the value of the element with key 19 in the hashmap
		 * hm and here we get value as "abc xyz".
		 * 
		 * if the element with key 19 is not present in hashmap we get value
		 * as null.
		 * 
		 */
		
		System.out.println("\n The element at key 19 removed is "+hm.remove(19));
		
		/*
		 * here remove() is the predefined non static member method of the
		 * HashMap class and hm.remove(19) removes the element with key 19
		 * from the hashmap and returns the value of the element removed.
		 * 
		 * here get only returns and not removes the elememnt from the hashmap
		 */
		
		System.out.println("\n The fact that the key 21 is present in hashmap is "+hm.containsKey(21)+"\n the fact that the element with value as abc def1 is present is "+hm.containsValue("abc def1"));
		
		/*
		 * here containsKey() and containsValue() are the predefined non static member
		 * methods of hashmap class and here hm.containsKey(13)returns true or false
		 * based on whether element with key 13 is present in hashmap or not.
		 * 
		 * hm.containsValue("abc def1") returns true or false based on whether
		 * the element abc def1 is present in the hashmap or not
		 */
		
		Set<Integer> ks=hm.keySet();
		
		/*
		 * keySet() is the predefined non static member method of the HashMap class
		 * and here hm.keySet() returns the group of all keys in the hashmap
		 * in form of a set and the generic type of the set returned is Integer
		 * which is the generic type of the keys in the hashmap.
		 */
		
		Iterator<Integer> it=ks.iterator();
	
		System.out.println("\n The keys of the hashmap are ");
		
		while(it.hasNext())
		{
			Integer i=it.next();
			System.out.println(i);
		}
		
		Collection v1=hm.values();
		
		/*
		 * here values() is a non static member method of the HashMap class.
		 * 
		 * here hm.values() returns the values of allelements of hashmap
		 * in a collection or a group i.e the values of all elements of the 
		 * hashmap are returned in form of an objecct implementing the general
		 * Collection interface and v1 which stores the return value of hm.values()
		 * must be declared as a reference variable only of the Collection super
		 * interface and not of any sub interfaces like List or Set or Queue
		 * interfaces else we get a compiler errror.
		 */
		
		Iterator<String>it1=v1.iterator();
		
		System.out.println("\n The element values of the hashmap are ");
		
		while(it1.hasNext())
		{
			String str18=it1.next();
			System.out.println(str18);
		}
		
		/*
		 * interface Map
		 * {
		 * 
		 * 		interface Entry
		 * 		{
		 * 			public abstract Object getValue();
		 * 			public abstract Object getKey();
		 * 
		 * 		}
		 * 
		 * }
		 * 
		 * here Entry is the predefined interface and it is defined inside
		 * the Map interface.
		 * 
		 * 
		 */
		
		Set me=hm.entrySet();
		
		/*
		 * here entrySet() is a predefined member method of the HashMap class.
		 * 
		 * here hm.entrySet() returns all the elements i.eall the entries in the map
		 * i.e key+ value pairs stored in the map.
		 */
		
		Iterator it19=me.iterator();
		
		while(it19.hasNext())
		{
			Map.Entry  me1=(Map.Entry)(it19.next());
			System.out.println("\n\n\n The key is "+me1.getKey()+"\nThe value is "+me1.getValue());
		}
		
		/*
		 * here Set me contains list of all the entries of the hashmap
		 * 
		 * and each entry is of type Map.Entry where Entry is defined inside
		 * the Map interface and so when we want to say that an element is
		 * of the Entry type we must write Map word before Entry word because
		 * Entry is defined inside the Map interface.
		 * 
		 * so here it19 iterator object is used to access the elemenst of 
		 * set me where each element is of type Map.Entry
		 * 
		 * and so we must convert the return type of it19.next to Map.Entry
		 * and then assign it to the me reference variable of Map.Entry interface
		 *
		 *getKey() and getValue() are the non static member methods of Entry 
		 *interface defined inside the Map interface.,
		 */
		
		
		Enumeration<Integer> e=hm.keys();
		
		/*
		 * here keys() is a predefined non static member method of the Hashtable class.
		 * 
		 * this returns the group of the keys of all elements of the hashtable
		 * and also returns the implicit object of a predefined interface called
		 * as java.util.Enumeration interface which is used to access the group
		 * or collection of keys returned by hm.keys().
		 * 
		 * Enumeration interface is just like the Iterator and ListIterator.
		 * 
		 * Enumeration interface is a cursor in java means that just like Iterator
		 * and ListIterator we cannot storeelements in the object e of the
		 * Enumeration interface and the objecft of the Enumeration interface
		 * is instead used to access the elements of a collection.
		 * 
		 * Enumeration interface was introduced in the earliest version of java 
		 * which is java 1.0.
		 * 
		 * and so it is called as legacy interface where the word legacy stands for the
		 * classes and interfaces in java introduced in the earliest versions of
		 * java.
		 * 
		 * Vector and Stack classes, Hashtable class,Dictionary class and
		 * Properties class of java.util package are also the legacy classes of java
		 * introduced in the version 1.0.
		 * 
		 * 
		 * 
		 * Using Enumeration interface we can only access the elements of the collection
		 * and cannot modify or add or delete the elements of the collection.
		 * 
		 * But using Iterator and ListIterator cursors we can also remove the 
		 * elements of the collection.
		 */
		
		System.out.println("\n The keys in the hashtable are ");
		
		while(e.hasMoreElements())
		{
			Integer i=(e.nextElement());
			
			System.out.println(i);
		}
		
		/*
		 * hasMoreElements() is the predefined non static member method of the
		 * Enumeration interface and it returns true or false based on whether
		 * there are any more elements of the collection of keys of hashtable
		 * to be accessed using e object or not.
		 * 
		 * but hasMoreElements() doesnt move e forward in the collection.
		 * 
		 * 
		 * nextElement() is the non static member method of the Enumeration interface,
		 * e.nextElement() will move the e object to the next element in the collection
		 * which e is accessing and so in this case e.nextElement() will move e 
		 * to the next key in the collection returned by hm.keys() and because 
		 * we had mentioned Integer as the generic type of the Enumeration interface
		 * object e, so e.nextElement() returns only an object of Integer class
		 * with Integer class reference type only and so there is no need
		 * to convert e.nextElement()into the Integer class type before assigning 
		 * it to i.
		 */
	}
	
	public static void main(String args[])
	{
		Map2 s1=new Map2();
		s1.opns();
	}
}
