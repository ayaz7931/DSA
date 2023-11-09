package Lec_32;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 41;
		System.out.println(isPrime(n));
	}

	public static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		int div=2;
		while(div*div <= n)
		{
			if(n%div == 0)
			{
				return false;
			}
			div++;
		}
		return true;
	}
	

}
