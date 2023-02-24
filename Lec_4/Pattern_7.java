package Lec_4;
import java.util.*;
public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=n/2;
		int space=0;
		while(row<=n)
		{
			int i =1;
			while(i<=star+1)
			{
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) 
			{
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=n/2)
			{
				System.out.print("* ");
				k++;
			}
			
			if(row==1 || row==n)
			{
				System.out.print("");
			}
			else
			{
				star=n-(n-2);
				space=n-2;
			}
			row++;
			System.out.println();
		}
	}

}
