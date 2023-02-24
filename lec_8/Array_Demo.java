package lec_8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int [] arr= new int[5];
		System.out.println(arr);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=-20;
		arr[4]=6;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		boolean [] arr1= new boolean[5];
		System.out.println(arr1[0]);
		char [] arr2= new char[5];
		System.out.println(arr2[0]);
		double [] arr3= new double[5];
		System.out.println(arr3[0]);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
