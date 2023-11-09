package Lec_4;

import java.util.Scanner;

public class Pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=n;
		int a=n;
		while(row<=n) {
			int i=1;
			int j=n;
			while(i<=star) {
				if(i==a) {
					System.out.print("* ");
				}
				else {
					System.out.print(j+" ");
				}
				i++;
				j--;
			}
			System.out.println();
			row++;
			a--;
			
		}

	}

}
