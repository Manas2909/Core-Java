/*
 * 			Queue
 * PriorityQueue		Deque interface
 * 					
 * 						LinkedList			ArrayDeque
 * 
 */

import java.util.*;

class Queue1 
{
	PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
	//by default 11
	
	void opns()
	{

		
		pq.offer(4);
		pq.offer(3);
		pq.offer(2);
	
		
		pq.offer(1);
		
		System.out.println(pq);
	
	
		System.out.println("\n the topmost element without removing are "+pq.peek()+" "+pq.element());
		
		System.out.println("\n the topmost element after removing are "+pq.poll()+" "+pq.remove());
		
	}
	
	public static void main(String args[])
	{
		Queue1 q1=new Queue1();
		q1.opns();
		
	}
}
