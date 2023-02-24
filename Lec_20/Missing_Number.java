package Lec_20;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int[] arr = {1,3,2,4,5,7};
		System.out.print(missing(arr, n));
    }
	public static int missing(int[] arr, int n)
	{
		int ans=0;
		for(int i=0;i<n-1;i++)
		{
			ans = ans ^ arr[i];
		}
		for(int i=1;i<=n;i++)
		{
			ans = ans ^ i;
		}
		return ans;
	}
}
