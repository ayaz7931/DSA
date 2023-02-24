// Kaden's Algorithm
package Lec_11;

public class Maximum_Subarray_Optimized_KadensAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int k=Subarray(arr);
		System.out.println(k);
	}
	public static int Subarray(int[] arr)
	{
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0)
			{
				sum=0;
			}
		}
		return ans;
	}

}
