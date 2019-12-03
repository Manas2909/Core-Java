
//hashset pgm
//over
import java.util.*;

class HashSet1 
{
	HashSet<String> hs=new HashSet<String>();
	
	
	void opns()
	{
		hs.add("kaveesh nadkarni");
		hs.add("abc def");
		hs.add("mno pqr");
		hs.add("sangeeta nadkarni");
		
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			String str=(String)(it.next());
			System.out.println(str);
			
		}
		
		
		System.out.println("\n the fact that the element sangeeta nadkarni is present in the hash set is "+hs.contains("sangeeta nadkarni")+"\n the fact that the element sangeeta nadkarni is removed from the hashset is "+hs.remove("sangeeta nadkarni"));
		
		hs.clear();
		
		System.out.println("\n the fact that the hashset is empty is "+hs.isEmpty());
	}
	
	
	public static void main(String args[])
	{
		HashSet1 hs1=new HashSet1();
		hs1.opns();
		
		
	}
}
