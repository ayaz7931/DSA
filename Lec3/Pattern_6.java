package Lec3;
import java.util.*;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space=0;
		int star=n;
		int row=1;
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
				
			}
			int j = 1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			star--;
			space=space+2;
			row++;
		}

	}

}
