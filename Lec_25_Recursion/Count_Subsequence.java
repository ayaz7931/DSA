package Lec_25_Recursion;

public class Count_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsequence("abc","");
		System.out.println(count);
	}
	static int count=0;
	public static void Subsequence(String ques, String ans)
	{
		if(ques.length()==0)
		{
			count++;
			return;
		}
		char ch = ques.charAt(0);
		Subsequence(ques.substring(1), ans);
		Subsequence(ques.substring(1), ans + ch);
	}

}
