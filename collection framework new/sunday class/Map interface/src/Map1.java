
/*
 * Map interface:
 * in the maps, every element is a combination of 2 sub elements one is the
 * key and one is the value.
 * 
 * so Map interface is not the sub interface of Collection interface
 * 
 * 
 * 1. HashMap class:
 * 
 * HashMap is the predefined class of java.util package and it implements the
 * Map interface directly.
 * 
 * In the HashMap, every element contains 2 sub elements which are key and value
 * and where the key and value are themselves objects.
 * 
 * In the hashmap, the elements are arranged as per the hashcode of  the keys.
 * in case of the hashmap, the elements of the hashmap are not present in the
 * same order that we have inserted them.
 * 
 * In the map, elements cannot have duplicate keys but they can have duplicate values.
 * 
 * if we try to insert an element with a key already present as the key value
 * of one of the elements of the hashmap, then overwriting will take place,
 * 
 * Imagine that there is an element of the hashmap with key 1 and value as "abc def".
 * 
 * now imagine that we try to add another element in the hashmap with
 * key as 1 and value as "mno pqr".
 * 
 * so here we wont get any compiler nor runtime error.
 * 
 * but instead the value at key 1 is removed and the value "mno pqr" is placed
 * for key 1.
 * 
 * so thismeans that the value of the element of the hashmap with key as 1
 * is "mno pqr"
 * 
 * 
 * LinkedHashMap class is the subclass of the HashMap class.
 * 
 * and in LinkedHashMao the elements are present in hashtable format as per the
 * hashcode of the keys and also in doubly linkedlist format.
 * 
 * in the linkedhashmap the insertion order of the elements of the hashmap is
 * preserved.
 * 
 * in hashmap the insertion order of the lements is not preserved i.e the order
 * in which the elements are inserted in the hashmap is the not same order inw hich
 * they are stored in the hashmap
 */

import java.util.*;

class Map1 
{
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	
	/*
	 * here Integer and String are the generic class types of the key object
	 * and the value object resp of each individual element of the hashmap.
	 * 
	 * when we create the object of HashMap, we can pass 2 values to the constructor.
	 * 
	 * HashMap hm=new HashMap(int capacity,float loadfactor);
	 * 
	 * this is the same as the capacity and the load factor we discussed for the
	 * HashSet.
	 * 
	 * the default values for the capacity and the load factor for the hash map
	 * is 16 and 0.75f.
	 * 
	 * In hashmap, the methods are not synchronized.
	 * 
	 * so this means that multiple threads can operate on the same object
	 * of hashmap class.
	 * 
	 * so hashmap is not thread safe and it is faster.
	 * 
	 * so imagine hm is the object of the HashMap.
	 * 
	 * If we want to convert this hm object of the HashMap into the synchronized
	 * format,for that we write:
	 * 
	 * Map m=Collections.synchronizedMap(hm);
	 * 
	 * here the synchronizedMap() is a static member method of the Collections class
	 * and Collections.synchronizedMap(hm) will convert the hm hashmapobject into
	 * a synchronized map object and return it and assign it to the reference variable
	 * m which must be declared using the Map interface
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
		
		
	}
	
	public static void main(String args[])
	{
		Map1 s1=new Map1();
		s1.opns();
	}
}
