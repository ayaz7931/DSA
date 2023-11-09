package Lec_37;

public class Client_Stack_Using_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Using_Queue st = new Stack_Using_Queue();
		st.push(10);
		st.push(20);
		st.push(1);
		st.push(-10);
		st.push(105);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}
