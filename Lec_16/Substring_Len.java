
package Lec_16;

public class Substring_Len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		PrintSubString(s);
	}
	public static void PrintSubString(String s)
	{
		for(int len=1;len<=s.length();len++)
		{
			for(int j=len;j<=s.length();j++)
			{
				int i=j-len;
				System.out.println(s.substring(i,j));
			}			
		}
	}
}
