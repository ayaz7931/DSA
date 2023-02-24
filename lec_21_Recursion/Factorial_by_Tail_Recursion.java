package lec_21_Recursion;

public class Factorial_by_Tail_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n =67, ans=1;
		System.out.println(fac(n, ans));
	}
	public static long fac(long n, long ans)
	{
		if(n==0)
		{
			return ans;
		}
		return fac(n-1,ans*n);
	}
}
