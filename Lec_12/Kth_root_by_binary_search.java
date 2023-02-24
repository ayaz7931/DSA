package Lec_12;

public class Kth_root_by_binary_search {
	public static void main(String[] args)
	{
		int n=87;
		int k=3;
		System.out.println(kthroot(n,k));
	}
	public static int kthroot(int n, int k)
	{		
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;
			if(Math.pow(mid, k)<=n)
			{
				ans=mid;
				lo=mid+1;
			}
			else
			{
				hi=mid-1;
			}
		}
		return ans;
	}
}