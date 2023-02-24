package Lec_9;

public class swap_Demo_3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4};
		int[] other = {20,13,11,9};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr, other);
		System.out.println(arr[0]+" "+other[0]);
	}
	public static void Swap(int[] arr, int[] other)
	{
		int[] temp = arr;
		arr = other;
		other = temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" "+other[i]+" ");
		}
		System.out.println();
	}
}
