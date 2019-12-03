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
		al.add(2,"xyz tyu");
		al.add(4,"vivek anand nadkarni");


		Iterator<String> it=al.iterator();

		System.out.println("\n The elements of the array list using the Iterator are ");

		while(it.hasNext())
		{
			String str=it.next();

			System.out.println(str);


		}

	}


	public static void main(String args[ ])
	{
		ArrayList11 a=new ArrayList11();

		a.opns();

	}

}