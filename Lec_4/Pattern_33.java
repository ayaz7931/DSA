package Lec_4;

import java.util.Scanner;

public class Pattern_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=0;
		int space=n-1;
		int a= n-1;
		int b=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			a=n-row+1;
			while(j<=star) {
				System.out.print(a+" ");
				j++;
				a++;
			}
			System.out.print(0+" ");
			a--;
			int k=1;
			while(k<=star) {
				System.out.print(a+" ");
				k++;
				a--;
			}
			System.out.println();
			row++;
			star++;
			space--;
		}
	}

}
