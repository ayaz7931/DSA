package lec_21_Recursion;

public class Factorial_by_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		if(n==1)
		{
			return 1;
		}
		int fn = fac(n-1); //sp
		return n*fn;
	}
}
