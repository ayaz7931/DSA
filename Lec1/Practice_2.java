package Lec1;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		float a=14;
//		float b=(float) (14/10);
//		System.out.println(b);
//		String s = "boy   and girl";
//		String[] arr = s.split("\s+");
//		System.out.println(arr[2]);
//		for(int i=0;i<arr.length;i++)
//		System.out.println(arr[i]);
		
//		int n = 14;
//		int k = n|1;
//		System.out.println(k);
		
//		int b=6;		
//		int a=5;
//		int k = b&(~a);
//		int l = ~a;
//		System.out.println(k);
//		System.out.println(l);
		
		int[] arr = {4,5,6,7,0,2,1,3};
        int[] arr2 = new int[arr.length];
        //String s1 = "";
        for(int i=0;i<arr.length;i++)
        {
            arr[arr[i]] = i;
        }
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
	}
}
