package Lec_9;
import java.util.*;

public class swap_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 2, 3, 1,4 };
		//int[] other = {20,13,11,8};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] other = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			other[i] = sc.nextInt();
			
		}
		
		//System.out.println(arr[0]+" "+other[0]);
		for(int i=0;i<arr.length;i++)
		{
			Swap(arr, other,i);
		}
		for(int i=0;i<arr.length;i++)
		{
		
			System.out.print(arr[i]+" "+other[i]+" ");
		}
	}
	public static void Swap(int[] arr, int[] other,int i)
	{
		int[] temp = new int[arr.length];
		temp[i] = arr[i];
		arr[i] = other[i];
		other[i] = temp[i];
//		for(int j=0;j<arr.length;j++)
//		{
//			System.out.print(arr[j]+" "+other[j]+" ");
//		}
//		System.out.println();
	}
}
