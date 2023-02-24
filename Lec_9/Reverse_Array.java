// TWO POINTER APPROACH

package Lec_9;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,4,15,17,18};
		Reverse(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void Reverse(int[] arr)
	{
		int x=arr.length-1;
		for(int i=0; i<x;i++)
		{
			int temp=arr[i];
			arr[i]=arr[x];
			arr[x]=temp;
			x--;
		}	
	}
}
