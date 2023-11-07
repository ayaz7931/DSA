package Lec1;

import java.util.*;

public class Practice_3 {
//	static int z =5; 
//	public static void main (String args[]) {
//		String a = "Ayaz";
//		String b = "Ayaz";
//		//a = "Gufran";
//		int[] arr = {1,5,2,3}; 
//		int[] brr = {1,5,2,3};
//		System.out.println(a==b);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr);
//		System.out.println(brr);
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(z);
//		z=7;
//		System.out.println(z);	
//	}
//}

	public static void main(String args[]) {
		// Your Code Here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] maze = new char[n][m];

		for (int i = 0; i < maze.length; i++) {

			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {

				maze[i][j] = s.charAt(j);
			}
		}

		int[][] ans = new int[n][m];
		mazepath(maze, 0, 0, ans);

		if (flag == false) {
			System.out.println("-1");
		}
	}

	static boolean flag = false;

	public static void mazepath(char[][] maze, int cr, int cc, int[][] ans) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] == 'O') {
			ans[cr][cc] = 1;
			display(ans);
			flag = true;
			// System.out.println();
			return;
		}

		if (cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {

			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;

		// int[] r = {0,1};
		// int[] c = {1,0};

		mazepath(maze, cr, cc + 1, ans);
		// System.out.println(cr + " " + cc);

		// if(cr<maze.length-1 && cc < 2 ) {

		if (flag == true) {

			return;
		}
		mazepath(maze, cr + 1, cc, ans);
		// }
		// System.out.println(cr +" " + cc);

		// mazepath(maze,cr+r[i],cc+c[i],ans);

		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}