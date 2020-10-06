package com.interview.longestpalindromicsubstring;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abacdgfdcaba"));
		System.out.println(longestPalindromeDP("abacdgfdcaba"));


	}
	
	public static String longestPalindrome(String s) {
		
		if(s == null || s.length() < 1) {
			return "";
		}
		
		int start = 0;
		int end = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > end - start) {
				start = i - (len -1) /2;
				end = i + len/2;
			}
		}
		return s.substring(start, end + 1);
	}
	
	private static int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		
		return R - L -1;
	}
	
	 public static String longestPalindromeDP(String s) {
         if (s == null || "".equals(s)) {
            return s;
        }
        
        int len = s.length();

        String longestPalindrome = "";
        int max = 0;

        boolean[][] dp = new boolean[len][len];

        for (int j = 0; j < len; j++) {
            
            for (int i = 0; i <= j; i++) {
                
                boolean judge = s.charAt(i) == s.charAt(j);
                
                dp[i][j] = j - i > 2 ? dp[i + 1][j - 1] && judge : judge;

                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }
        return longestPalindrome;
        
    }

}
