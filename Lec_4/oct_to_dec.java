package Lec_4;

import java.util.Scanner;

public class oct_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem*mul;
			n/=10;
			mul=mul*8;
		}
		System.out.println(sum);
	
	}

}
