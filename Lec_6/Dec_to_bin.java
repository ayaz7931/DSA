package Lec_6;
import java.util.*;
public class Dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0)
		{
			int rem=n%2;
			sum=sum+rem*mul;
			n/=2;
			mul=mul*10;
		}
		System.out.println(sum);
	}

}
