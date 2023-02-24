package Lec_4;
import java.util.*;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while(row<=2*n-1)
		{
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			
			if(row<n)
			{
				star--;
				space=space+2;
			}
			else
			{
				star++;
				space=space-2;
			}
			System.out.println();
			row++;
		}

	}

}
