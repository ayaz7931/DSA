package Lec_35;

public class DynamicStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();
		ds.push(1);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.Display();
		ds.push(60);
		ds.Display();
	}
}
