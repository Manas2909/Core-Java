//array list pgm
import java.util.*;


class C1
{

	ArrayList<String> al=new ArrayList<String>();

	void opns()
	{
		al.add(0,"kaveesh nadkarni");

		al.add(1,"vivek anand nadkarni");

		al.add(2,"sangeeta nadkarni");

		al.add("vaibhavi nadkarni");

		System.out.println("\n the current elements in array list after adding 4 elements are "+al);


	}

	public static void main(String args[ ])
	{
		C1 c=new C1();

		c.opns();

	}

}			