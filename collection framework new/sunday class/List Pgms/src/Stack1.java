
/*
 * Stack:
 * It is the sub class of Vector class. In the stack the elements are arranged
 * in LIFO(LAST IN FIRST OUT) order
 * 
 */

import java.util.*;


class Stack1
{
	Stack<Integer>s1=new Stack<Integer>();
	
	void opns()
	{
		s1.push(11);
		s1.push(10);
		s1.push(9);
		s1.push(8);
		s1.push(7);
		s1.push(new Integer(6));
		
	/*
	 * push()is a predefined non static member method of Stack class and 
	 * s1.push(8) will push the element 8 at the top of the stack s1 above
	 * the element 9 already on stack s1 and while pushing the element on s1,
	 * the 8 is converted from the primitive data type into the Integer wrapper
	 * class object new Integer(8)
	 */
		
		System.out.println("\n The tomost element of the stack without removing is "+s1.peek());
		
		int index=s1.search(9);
		
		/*
		 * here search() is a non static member method of the Stack class and
		 * s1.search(9)will search if the element new Integer(9) is present in
		 * the stack s1 or not and if not it returns -1 and if yes it returns 
		 * the position of the 9 element from the top of the stack
		 */
		
		if(index<0)
		{
			System.out.println("\n The element 9 is not present in the stack");
		}
		
		else
		{
			System.out.println("\n The element 9 is present at location "+index+" from the top of the stack ");
		}
		
		System.out.println("\n The elements of the stack after popping are ");
		
		while(s1.empty()==false)
		{
			System.out.println(s1.pop());
			
		}
	/*
	 * empty() is a predefined non static member method of the Stack class and
	 * here s1.empty() will check if the stack s1 is empty or not and return
	 * true or false accordingly
	 * 
	 * pop() is also a predefined non static member method of Stack class and
	 * s1.pop() will return and remove the element from the top of the stack.
	 */
	}
	
	public static void main(String args[])
	{
		Stack1 s1=new Stack1();
		s1.opns();
	}
}
