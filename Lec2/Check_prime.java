package Lec2;

import java.util.*;

public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int fact = 0;
		while (i < n) {
			if (n % i == 0) {
				fact++;
				break;
			}
			i++;

		}
		if (fact > 0)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");

	}

}
