/*
 * Map interface:
 * 
 * 1,"kaveesh nadkarni"
 * 
 * 1,"vivek nadkarni"
 * 
 */

/*
 * 
 *HashMap class
 *
 *interface Map
 *{
 *
 *``interface Entry
 *	{
 *		Object getKey();
 *		Object getValue();		
 *
 *
 *	}
 *
 *}
 */

import java.util.*;
class Map2
{
	Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
	
	void opns()
	{
		hm.put(1, "nitin chouhan");
		hm.put(2, "nilesh chouhan");
		hm.put(3, "kaveesh nadkarni");
		hm.put(4, "vivek nadkarni");
		
		System.out.println("\n the element at key 1 without removing is "+hm.get(1)+"\n the element at key1 after removing is "+hm.remove(1));
		
		Set s1=hm.keySet();
		
		Iterator it=s1.iterator();
		
		while(it.hasNext())
		{
			Integer str=(Integer)(it.next());
			System.out.println("\n"+str);
		}
		
		
		Collection v1=hm.values();
		
		it=v1.iterator();
		
		while(it.hasNext())
		{
			String str=(String)(it.next());
			System.out.println("\n"+str);
		}
		
		Set es=hm.entrySet();
		
		it=es.iterator();
		
		while(it.hasNext())
		{
			Map.Entry m1=(Map.Entry)(it.next());
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		
		Enumeration e=hm.keys();
		/*
		 * 
		 * 
		 */
		
		while(e.hasMoreElements())
		{
			Integer i=(Integer)(e.nextElement());
			System.out.println("\n"+i);
		}
		System.out.println("\n the size of the hashtable is "+hm.size());
		
		
		
		hm.clear();
		
		System.out.println("\n the fact that the map is empty is "+hm.isEmpty());
		
	}
	
	public static void main(String args[])
	{
		Map2 m1=new Map2();
		m1.opns();
	}
}
