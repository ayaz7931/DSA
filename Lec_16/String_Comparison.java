package Lec_16;

import java.util.Scanner;

public class String_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(Compare(s1,s2));
	}
	public static int Compare(String s1,String s2)
	{
		int length = Math.min(s1.length(), s2.length());
		for (int i = 0; i < length; i++) {
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}
}
