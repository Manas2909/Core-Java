/*
 * WeakHashMap:
 * 
 * here HashMap object is not eligible for garbage collection even if its reference
 * is initialised to null and we call the garbage collector.
 * 
 * But if we use the WeakHashMap instead of HashMap then the object of the class
 * java.util.WeakHashMap is eligible for garbage collection if the reference 
 * is initialised to null
 */

import java.util.*;

class Temp
{
	String str;
	Temp(String str1)
	{
		str=str1;
	}
	
	public String toString()
	{
		return str;
	}
	
	public void finalize()
	{
		System.out.println("\n Destroying object "+str);
	}
}


/*
 * public void finalize()is the predefined non static member method of
 * java.lang.Object class which is the superclass of every class in java and
 * so this public void finalize()method is inherited by each and every class in
 * java into itself.
 * 
 * when an object is eligible for garbage collection, the garbage collector
 * of the JVM before destroying the object will call the predefined finalize()
 * method onec and only once on that object just before it is destroyed and
 * if the class type of that object has overridden the public void finalize()
 * method then the JVM calls that method already present in the class type opf that
 * object just before it is destroyed and only once.
 * 
 */

class Wm1
{
	WeakHashMap<Temp,Integer> hm=new WeakHashMap<Temp,Integer>();
	
	void opns()
	{
		Temp t1=new Temp("Object 1");
		Temp t2=new Temp("Object 2");
		Temp t3=new Temp("Object 3");
		
		hm.put( t1,6);
		hm.put(t2,7);
		hm.put(t3,9);
		
		System.out.println(hm);
		t1=null;
		t2=null;
		t3=null;
		
		System.gc();
		
		System.out.println(hm);
		/*
		 * gc() is the static member method of System class and here it invokes
		 * or atleast tries to invoke the garbage collector.
		 * 
		 * so here we get the output message as
		 *  Destroying object Object 1 
		 *   Destroying object Object 2
		 *    Destroying object Object 3
		 *    
		 *    because hm is a WeakHashMap.
		 *    
		 *    the WeakHashMap is eligible for garbage collection when its key
		 *    is made null
		 */
	}
	
	
	public static void main(String args[])
	{
		Wm1 s1=new Wm1();
		s1.opns();
	}
}
