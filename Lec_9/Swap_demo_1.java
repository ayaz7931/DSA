package Lec_9;

public class Swap_demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,2,7,9};
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr,0,1);
		System.out.println(arr[0] + " " + arr[1]);
	}
	public static void Swap(int[] arr, int i, int j)
	{
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
