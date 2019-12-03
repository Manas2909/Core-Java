/*
 * TreeMap
 */
import java.util.*;

class Map3 
{
	TreeMap<Integer,String>hm=new TreeMap<Integer,String>();
	void opns()
	{
		hm.put(4, "nitin chouhan");
		hm.put(3, "nilesh chouhan");
		hm.put(2, "kaveesh nadkarni");
		hm.put(1, "vivek nadkarni");
	
		System.out.println(hm);

		System.out.println("\n"+hm.headMap(3)+"\n"+hm.tailMap(3)+"\n"+hm.subMap(1, 4));
		
		System.out.println(hm.descendingMap());
		System.out.println("\n"+hm.ceilingKey(4)+"\n"+hm.higherKey(2)+"\n"+hm.floorKey(4)+"\n"+hm.lowerKey(4)+"\n"+hm.firstKey()+"\n"+hm.lastKey()+"\n"+hm.pollFirstEntry()+"\n"+hm.pollLastEntry());
		
		
	}
	
	public static void main(String args[])
	{
		Map3 m1=new Map3();
		m1.opns();
	}
}
