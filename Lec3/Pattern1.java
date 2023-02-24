package Lec3;

import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//While loop
		int row=1;
		int star=n;
		while(row<=n)
		{
			int i =1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
		}
		
		
		
		
		//For loop
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}*/

	}

}
