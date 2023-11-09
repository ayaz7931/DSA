package Lec_4;

import java.util.Scanner;

public class Pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//While loop
		int row=1;
		int star=1;
		while(row<=n)
		{
			int i =5;
			while(i>=star)
			{
				System.out.print(i+" ");
				i--;
			}
			System.out.println();
			row++;
		}
	}

}
