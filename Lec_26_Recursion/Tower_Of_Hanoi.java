package Lec_26_Recursion;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		TOH(n, "A", "C", "B");
	}
	public static void TOH(int n, String src, String des, String hlp)
	{
		if(n==0)
		{
			return;
		}
		TOH(n-1, src, hlp, des);
		System.out.println("Move "+n+"th disk from "+src+" to "+des);
		TOH(n-1, hlp, des, src);
	}
}
