package Lec_51;

import java.util.Arrays;

public class LCS_Longest_Common_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "ace";
		String text2 = "abcde";
		System.out.println(lcs(text1, text2, 0, 0));
		int[][] dp = new int[text1.length()][text2.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(lcsTD(text1, text2, 0, 0, dp));
		System.out.println(lcsBU(text1, text2));
	}
	public static int lcs(String s1, String s2, int i, int j) {
		if(i==s1.length() || j==s2.length()){
			return 0;
		}
		int ans=0;
		if(s1.charAt(i) == s2.charAt(j)) {
			ans = 1+lcs(s1,s2,i+1, j+1);
		}
		else {
			int f = lcs(s1, s2, i+1,j);
			int s = lcs(s1, s2, i, j+1);
			ans = Math.max(f, s);
		}
		return ans;
	}
	
	public static int lcsTD(String s1, String s2, int i, int j, int[][] dp) {   // Top-Down Approach
		if(i==s1.length() || j==s2.length()){
			return 0;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans=0;
		if(s1.charAt(i) == s2.charAt(j)) {
			ans = 1+lcsTD(s1,s2,i+1, j+1, dp);
		}
		else {
			int f = lcsTD(s1, s2, i+1,j, dp);
			int s = lcsTD(s1, s2, i, j+1, dp);
			ans = Math.max(f, s);
		}
		return dp[i][j] = ans;
	}

	public static int lcsBU(String s1, String s2) {   // Bottom-Up Approach
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					ans = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					ans = Math.max(f, s);
				}
				dp[i][j] = ans;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
		
	}

}
