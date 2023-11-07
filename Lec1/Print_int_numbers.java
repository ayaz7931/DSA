package Lec1;
import java.util.*;
public class Print_int_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scn.nextInt();
		int i =1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
