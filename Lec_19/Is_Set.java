package Lec_19;

public class Is_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =84;
		int i=4;
		if(Isset(n,i) )
		{
			System.out.println("set");
		}
		else
		{
			System.out.println("Unset");
		}
	}
	public static boolean Isset(int n, int i)
	{
		int mask=1<<i;
		if((n&mask)!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
