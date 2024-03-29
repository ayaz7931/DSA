package Doubt_Class;
import java.util.*;
public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {2,3,2,6,3,4,1};
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n]; //java Syntax
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Permutation(int[] arr) {
		int p=0;
		int q=0;
		int n = arr.length;
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]<arr[i+1])
			{
				p=i;
				break;
			}
		}
		for(int i=n-1;i>=p;i--)
		{
			if(arr[i]>arr[p])
			{
				q=i;
				break;
			}
		}
		if(p==0 && q==0)
		{
			Reverse(arr,0,n-1);
			return;
		}
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		Reverse(arr,p+1,n-1);
	}
	public static void Reverse(int[] arr, int i, int j)
	{
		while(i<j)
		{
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;	
		}
	}
}
