package Lec_4;

import java.util.Scanner;

public class Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		n = (n*2)-1;
		int a=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print(a+" ");
				if(i<star)
					System.out.print("* ");
				else
					System.out.print("");
				i++;
			}
			if(row<=n/2) {
				a++;
				star++;
			}
			else {
				a--;
				star--;
			}
			System.out.println();
			
			row++;
		}
	}

}
