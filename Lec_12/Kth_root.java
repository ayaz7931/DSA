package Lec_12;

public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=81, k=2;
		System.out.println(root(n,k));
	}
	public static int root (int n, int k)
	{
		int a=0;
		int i=0;
		while(a<=n)
		{
			i++;
			a=(int)(Math.pow(i, k));
			
		}
		return --i;
	}

}
