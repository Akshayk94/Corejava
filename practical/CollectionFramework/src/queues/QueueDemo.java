package queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{
	public static void main(String[] args) 
	{
		Queue<Integer> listoforders=new PriorityQueue<Integer>();
		listoforders.add(201);
		listoforders.add(202);
		listoforders.add(203);
		listoforders.add(204);
		listoforders.add(205);
		
		System.out.println(listoforders);
		
		System.out.println("HEAD OF THE QUEUE IS "+listoforders.element());
		
		System.out.println("PEAK OF THE QUEUE IS "+listoforders.peek());
	
		listoforders.remove();
		System.out.println("HEAD ELEMENT REMOVED FROM THE QUEUE");
		
		System.out.println("HEAD OF THE QUEUE IS "+listoforders.element());
		
		listoforders.poll();
		System.out.println("HEAD ELEMENT REMOVED FROM THE QUEUE");
		System.out.println("HEAD OF THE QUEUE IS "+listoforders.element());
		
		listoforders.poll();
		listoforders.poll();
		
		System.out.println("HEAD OF THE QUEUE IS "+listoforders.element());

		listoforders.poll();
		
		System.out.println("HEAD OF THE QUEUE IS "+listoforders.peek());

		listoforders.poll();
	}
}
