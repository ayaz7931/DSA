package Lec1;
import java.util.*;
public class Div_by_3_and_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		int a=24;
		if(a%3==0 && a%4==0)
			System.out.println(a + " " + "is divisible by 3 and 4");
		else
			System.out.println("not divisible");
	}

}
