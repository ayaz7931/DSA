package Lec_37;
import Lec_35.DynamicQueue;
public class Stack_Using_Queue {
	DynamicQueue q;
	
	public Stack_Using_Queue() {
		q= new DynamicQueue();
	}
	public boolean isEmpty() {
		return q.size() == 0;
	}
	public int size() {
		return q.size();
	}
	public void push(int item) throws Exception {
		DynamicQueue hlp = new DynamicQueue();
		while(!q.isEmpty()) {
			hlp.Enqueue(q.Dequeue());
		}
		q.Enqueue(item);
		while (!hlp.isEmpty()) {
			q.Enqueue(hlp.Dequeue());
		}
	}
	public int pop() throws Exception {
		return q.Dequeue();
	}
	public int peek() throws Exception {
		return q.Getfront();
	}	
}
