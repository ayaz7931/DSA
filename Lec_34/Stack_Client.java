package Lec_34;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack st = new Stack(6);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.isfull());
		System.out.println(st.peek());
		st.Display();
		st.push(9);
		st.Display();
		System.out.println(st.pop());
		st.Display();
		st.push(17);
		st.Display();
		st.push(60);
		st.Display();
	}

}
