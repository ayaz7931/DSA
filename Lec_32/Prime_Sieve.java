package Lec_32;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		Prime_Sieve(n);
	}
	// jis index p false aa gaya iska mtlb index prime hai
	public static void Prime_Sieve(int n)
	{
		boolean[] prime = new boolean[n+1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i*i <= prime.length; i++) {
			if(prime[i]== false) {
				for (int j = 2; j*i < prime.length; j++) {
					prime[j*i] = true; // marked prime nahi hai
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if(prime[i] == false)
			{
				System.out.print(i+ " ");
			}
		}
	}
}
