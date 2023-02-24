package Lec3;

import java.util.*;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		while(row<=n)
		{
			int i=n;
			while(i>=row)
			{
				System.out.print("* ");
				i--;
			}
			System.out.println();
			row++;
		}
	}

}
