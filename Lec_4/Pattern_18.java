package Lec_4;
import java.util.*;
public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=1;
		int space=n/2;
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
				System.out.print("* ");
				j++;
				
			}
			if(row<n/2+1)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
