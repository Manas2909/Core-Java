/*
 * Stack is the predefined class of java.util package. It is the subclass
 * of the Vector class of java.util package.
 * 
 * In the stack, the elements are stored in LIFO(LAST IN FIRST OUT ORDER)
 * 
 * 
 */

import java.util.*;

class Stack1
{
	Stack<Integer> s=new Stack<Integer>();
	
	/*
	 * here Integer is a wrapper class of java.lang package and here it is used
	 * as the generic type of the Stack object s.
	 * 
	 * means we can add only the objects of Integer wrapper class to s
	 */
	
	void opns()
	{
		s.push(11);
		s.push(10);
		s.push(9);
		s.push(8);
		s.push(7);
		
		/*
		 * push() is a predefined non static member method of the Stack class.
		 * 
		 * It is used to push the element at the top of the stack.
		 * here we have added 5 elements to the stack s.
		 * 
		 * we had studied that we cannot add primitive data type values
		 * to the collection.
		 * but here we are adding primitive elements 11,10,9,8, and 7 to the stack s.
		 * 
		 * so here we are still not getting any compiler error.
		 * 
		 * There is a new feature in java called as autoboxing.
		 * 
		 * here the primitive value gets automatically converted to the wrapper class
		 * object for that particular operation and the wrapper class object
		 * is converted back to the primitive data type value for the particular
		 * operation.
		 * 
		 * here when we add 11 to the Stack s, the 11 is not added as a primitive
		 * int data type value to the stack s.
		 * 
		 * But the 11 is first converted to new Integer(11) wrapper class object
		 * and then it is added to the Stack s.
		 * 
		 * so this happend automatically where the 11 gets converted to the
		 * Integer wrapper classobject 11.
		 * 
		 * same for the other primitive data type values added to s.
		 */
		
		int flag=s.search(10);
		
		/*
		 * search() is a predefined non static member method of the Stack class
		 * and it will search an element in the stack s and if the element is 
		 * not present in the stack s then -1 is returned.
		 * 
		 * and if the element i.e new Integer(10) is present in the stack s,
		 * then s.search(10) returns the position orlocation of 10 from the top of the stack
		 * and here s.search(10) wont return the index of 10 which is 3.
		 * 
		 * but here 7 is at the top of stack and so the 10 is at 4th position
		 * from the top of stack
		 */
		
		if(flag>=0)
		{
			System.out.println("\n The element 10 is present in stack at location from top as "+flag);
			
		}
		else
			System.out.println("\n The element 10 is not present in stack ");
		
		
		
		System.out.println("\n The element at top of stack without removing is "+s.peek());
		
		
		int numberofelements=s.size();
		
		System.out.println("\n The number of elements of stack is "+numberofelements);
	
		while(s.isEmpty()==false)
		{
			System.out.println("\n"+s.pop());
		}
		
		/*
		 * isEmpty() is a predefined non static member method of Stack class.
		 * 
		 * here isEmpty() returns true or false based on whether the stack is
		 * empty or not.
		 * 
		 * pop() is a predefined non static member method of Stack class and
		 * it will  remove as well as return the value of the top element
		 * of stack and here 7 is the last elment to be pushed on stack 
		 * and so it is the element at the top of the stack.
		 * 
		 * if we didnt write == false in the title of the while loop  by
		 * default s.isEmpty() is compared with true
		 */
		
		System.out.println("\n The current size is "+s.size());
	}
	
	public static void main(String args[])
	{
		Stack1 s1=new Stack1();
		s1.opns();
		
	}
}
