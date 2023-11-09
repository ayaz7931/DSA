package Lec_4;

import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				if(j==1 || j==star) 
					System.out.print(row+" ");
				else {
					System.out.print(0+" ");
				}
				j++;
			}
			System.out.println();
			row++;
			star+=2;
			space--;
			
		}
	}

}
