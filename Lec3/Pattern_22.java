package Lec3;
import java.util.*;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=-1;
		int star=n;
		while(row<=n)
		{
			int i =1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			int j =1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			int k =1;
			while(k<=star)
			{
				if(k==n)
					break;
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
			space=space+2;
			star--;
		
				
				
		}

	}

}
