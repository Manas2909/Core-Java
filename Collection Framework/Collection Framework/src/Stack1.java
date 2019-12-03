
import java.util.*;
class Stack1 
{
	Stack<Integer>s=new Stack<Integer>();
	
	void opns()
	{
		s.push(1);
		s.push(10);
		s.push(13);
		s.push(15);
		
		//autoboxing
		
		System.out.println("\n the topmost element of the stack without removing is "+s.peek());
		
		int flag=s.search(13);
		//searches the element in the stack and returnt the -1 value if element
		//is not found and if element is found then returns th location from the top
		//of the stack
		
		if(flag!=-1)
		{
			System.out.println("\n the element 13 is found at location "+flag+" from the top of the stack");
			
			
		}
		
		else
			System.out.println("\n element not found");
		
		
		while(s.isEmpty()==false)
		{
			System.out.println("\n"+s.pop());
			
		}
	}
	
	public static void main(String args[])
	{
		Stack1 s1=new Stack1();
		s1.opns();
		
	}
}
