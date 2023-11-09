package Lec3;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, star = 1, space1 = 0, space2 = n - 2;
		while (row <= n) {
			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}
			int a = 1;
			if (i == n / 2 + 1) {
				System.out.print("");
			} else
				while (a <= star) {
					System.out.print("* ");
					a++;
				}
			System.out.println();
			if (row <= n / 2) {
				space1++;
				space2 -= 2;
			} else {
				space1--;
				space2 += 2;
			}
			row++;

		}

	}

}
