package Lec2;

import java.util.*;
public class Reverse_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println(rev);
		
		

	}

}
