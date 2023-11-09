package Lec_28;
import java.util.*;
public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String ques = sc.next();
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Palindrome_Partition(ques, list, ans);
		System.out.println(ans);
	}
	public static void Palindrome_Partition(String ques, List<String> list, List<List<String>> ans)
	{
		if(ques.length() == 0)
		{
			ans.add(new ArrayList<>(list));
			return;
		}
		for(int i=1;i<=ques.length();i++)
		{
			String s = ques.substring(0,i);
			if(isPalindrome(s)) {
				list.add(s);
				Palindrome_Partition(ques.substring(i), list, ans);
				list.remove(list.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s)
	{
		int i=0;
		int j= s.length() -1;
		while(i< j)
		{
			if(s.charAt(i)!= s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;	
	}
}
