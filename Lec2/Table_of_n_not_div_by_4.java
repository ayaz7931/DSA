package Lec2;

import java.util.Scanner;

public class Table_of_n_not_div_by_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=10)
		{
			int k=n*i;
			if(k%4==0)
			System.out.print("");
			else
			System.out.println(k);
			i++;
		}

	}

}
