package Lec_10;

public class Rotate_Array_by_Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int k=4;
		Rotate(arr, k);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void Rotate(int[] arr, int k)
	{
		k=k%arr.length;
		int n =arr.length;
		// 1st n-k element
		Reverse(arr,0,n-k-1);
		// last ke k element
		Reverse(arr,n-k,n-1);
		// complete Array ko
		Reverse(arr,0,n-1);
	}
	public static void Reverse(int[] arr, int i, int j)
	{
	
		for(int a=i; a<j;a++)
		{
			int temp=arr[a];
			arr[a]=arr[j];
			arr[j]=temp;
			j--;
		}
	}
}


