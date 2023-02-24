package Lec3;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1;
		int star =1;
		int space=n-1;
		
		while(row<=n)
		{
			int i =1;
			while(i<=space)
			{
				
				
				
				System.out.print("  ");
				i++;
			}
			int j =1;
			int t =1;
			while(j<=star)
			{
				
				System.out.print("* ");
				if(t<star)
				{
			
					System.out.print("! ");
					t++;
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
			star++;
			
		}


	}

}
