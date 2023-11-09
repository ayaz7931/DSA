package Doubt_Class_3;
import java.util.*;
public class Replace_all_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
			String s = sc.next();
			Replace_all_PI(s, "");			
		}
	}
	public static void Replace_all_PI(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		if(ques.length() >= 2 && ques.charAt(0) == 'p' && ques.charAt(1) == 'i')
		{
			Replace_all_PI(ques.substring(2), ans+"3.14");
		}
		else
		{
			Replace_all_PI(ques.substring(1), ans + ques.charAt(0));
		}
	}
}
