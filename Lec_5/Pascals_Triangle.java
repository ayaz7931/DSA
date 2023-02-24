package Lec_5;
import java.util.*;
public class Pascals_Triangle {
    public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    pascal(n);
    }
    public static int fact(int n)
    {
        int i=1;
        int mul=1;
        if(n==0)
        return 1;
        while(i<=n)
        {
            mul=mul*i;
            i++;
        }
        return mul;
    }
    public static void pascal(int n)
    {
        int row=0;
        while(row<n)
        {
            int i=0;
            while(i<=row)
            {
                int nCr=fact(row)/(fact(i)*fact(row-i));
                System.out.print(nCr+"\t");
                i++;
            }
            row++;
            
            System.out.println("");
        }

    }
}