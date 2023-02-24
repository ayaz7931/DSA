package CB_Assignments;


import java.util.*;
public class nobita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			int x = sc.nextInt();
			int n =sc.nextInt();
			int b=x%n;
			if((n-b)<=n/2)
			{
				System.out.println(n-b);
				
			}
			else
			{
				System.out.println(b);
			}
		}
	}

}
