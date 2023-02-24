package Lec_7;

public class Func_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a=7;
		int b=9;
		int c=Add(a,b);
		System.out.println(c);
		System.out.println("hello");
		sub(b,a);
	}
	public static int Add(int a, int b)
	{
		int c =a+b;
		//System.out.println(c);
		return c;
	}
	public static void sub(int a, int b)
	{
		int c =a-b;
		System.out.println(c);
		
	}

}
