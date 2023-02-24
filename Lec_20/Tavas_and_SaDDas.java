package Lec_20;
import java.util.*;
public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		System.out.println(Index(str));	
	}
	public static int Index(String str)
	{
		int n = str.length();
		int count = (1<<n) -2; // n-1 tak ka saare lucky nuumber ka count hai.
		int pos=0;
		for(int i =n-1;i>=0;i--)
		{
			if(str.charAt(i)=='7')
			{
				count = count +(1<<pos);
			}
			pos++;
		}
		return count+1;
	}
}
