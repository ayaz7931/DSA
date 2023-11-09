package Lec_25_Recursion;

public class Count_Subsequence_Way_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n"+Subsequence("abc",""));

	}
	public static int Subsequence(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a1=Subsequence(ques.substring(1), ans);
		int b1=Subsequence(ques.substring(1), ans + ch);
		return a1+b1;
	}


}
