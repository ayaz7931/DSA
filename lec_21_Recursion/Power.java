package lec_21_Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4, b=5;
		System.out.println(pow(a,b));
	}
	public static int pow(int a, int b)
	{
		if(b==0)
		{
			return 1;
		}
		int ans = pow(a,b-1);
		return ans*a;
	}
}
