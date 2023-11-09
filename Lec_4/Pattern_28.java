package Lec_4;

import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space=n-1;
		int star=1;
		int a=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			a=row;
			if(j<=star/2) {
				while(j<=star/2) {
					System.out.print(a+" ");
					j++;
					a++;
				}
			}
			
			while(j<=star) {
				System.out.print(a+" ");
				j++;
				a--;
			}
			
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}

}
