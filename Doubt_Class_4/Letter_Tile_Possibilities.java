package Doubt_Class_4;

public class Letter_Tile_Possibilities {
	public static void main(String[] args) {
		String str = "ABACA";
		System.out.println(Tile_Possibilities(str, ""));		
	}
	public static int Tile_Possibilities(String ques, String ans)
	{
		System.out.println(ans);
		int count=0;
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean b = false;
			for (int j = i+1; j < ques.length(); j++) {
				if(ques.charAt(j)==ch)
				{
					b=true;
					break;
				}
			}
			if(b==false)
			{
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i+1);
				count += Tile_Possibilities(s1+s2, ans +ch)+1;
			}			
		}
		return count;
	}
}
