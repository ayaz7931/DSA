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
			if(row==1 || row==n) {
				while(i<=star+1)
				{
					System.out.print("* ");
					i++;
				}
			}
			else {
				while(i<=star)
				{
					System.out.print("* ");
					i++;
				}
			}
			int j=1;
			while(j<=space) 
			{
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star)
			{
				System.out.print("* ");
				k++;
			}
			row++;
			
			if(row==n)
			{
				star=n/2;
				space=0;
			}
			else
			{
				star=1;
				space=n-2;
			}
			System.out.println();
		}
	}

}
