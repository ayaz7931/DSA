package Lec3;
import java.util.*;

public class Pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star)
			{
				System.out.print("1 ");
				j++;
				
			}
			System.out.println();
			row++;
			space--;
			star=star+2;
					
		}

	}

}
