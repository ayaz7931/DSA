package lec_8;
import java.util.Scanner;
public class Array_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
//		int arr[] = new int[n]; //C or C++ Syntax
		int [] arr = new int[n]; //java Syntax
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Display(arr);

	}
	public static void Display(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	

}
