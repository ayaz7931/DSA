package Lec_12;
import java.util.*;

public class First_bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int n =sc.nextInt();
			
		int n=10;
		System.out.println(badversion(n));
		
	}
	public static int badversion(int n)
	{
		int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi)
        {
            int mid =lo+(hi-lo)/2;
            if(isBadVersion(mid)==true)
            {
                ans =mid;
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        return ans;
    }
	public static boolean isBadVersion(int mid)
	{
		int bad=3;
		if(mid>=bad)
			return true;
		else
			return false;
	}

}
