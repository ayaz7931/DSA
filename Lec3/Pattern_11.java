package Lec3;
import java.util.*;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space=n-1;
		int row=1;
		int star=1;
		while(row<=n)
		{
			int i =1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
				
			}
			int j =1;
			int t=1;
			while(j<=star)
			{
				System.out.print("* ");
				if(t<star)
				{
					System.out.print("  ");
					t++;
				}
			j++;
			}
			System.out.println();
			star++;
			space--;
			row++;
		}

	}

}
