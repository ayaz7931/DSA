package Lec_15;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello"; // inside pool
		s=s+"bye"; // after concatenation it will be out of pool
		System.out.println(s);
		String s1 = new String("hello");
		s1=s1+"bye";
		System.out.println(s1);
		
		String s2 = "hello"+"bye";
		String s3 = "hello"+"bye";
		System.out.println(s2==s3);
		String s5 = s1+s2;
		System.out.println(s5);
	}
}
