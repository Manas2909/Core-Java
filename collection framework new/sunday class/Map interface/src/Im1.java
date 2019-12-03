
/*
 * java.util.IdentityHashMap class implements the Map interface directly
 *
 *
 *HashMap<Integer,String> hs=new HashMap<Integer,String>();
 *
 *here we have created the object of the HashMap class with the key and value generic types
 *as Integer and String resp.
 *
 *hs.add(new Integer(18),"abc def");
 *
 *here we have added an element into the hashmap hs of key as new Integer(18) and
 *value as "abc def".
 *
 *hs.add(new Integer(18),"mno pqr");
 *here we are adding a new element with the duplicate key new Integer(18) as the element already
 *present in hashmapwith value "abc def".
 *
 *so as per the rules of hashmap, the element value "abc def" is removed
 *and the value of the element with key new Integer(18)will now be "mno pqr"
 *because when the JVM compares the 2 keys new Integer(18) and new Integer(18)
 *it uses the equals() method overriden by the Integer wrapper class object
 *to compare the 2 keys and doesnt use the == operator which is used by
 *the default predefined equals() method of the Object class.
 *
 *so if we want the JVM to compare the 2 keys above of the Integer wrapper class
 *and value 18 using the == operator and not the equals() method we use the
 *IdentityHashMap class.
 */

import java.util.*;

class Im1 
{
	IdentityHashMap<Integer,String>hm=new IdentityHashMap<Integer,String>();
	
	void opns()
	{
		hm.put(new Integer(8), "abc def");
		
		hm.put(new Integer(8), "mno pqr");
		
		System.out.println(hm);
	/*
	 * here both the elements with same key value 8 will be present in the identity
	 * hash map
	 */	
	}
	
	public static void main(String args[])
	{
		Im1 s1=new Im1();
		s1.opns();
	}
}
