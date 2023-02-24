package Lec1;
import java.util.*;

public class Practice {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int k= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i] = (int)(Math.pow(2, arr[i]));
		}
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
		
		Reverse(arr,0,n-k-1);
		
		Reverse(arr,n-k,n-1);
		
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