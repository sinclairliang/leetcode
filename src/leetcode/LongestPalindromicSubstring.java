package leetcode;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume
 * that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad" Output: "bab" Note: "aba" is also a valid answer. Example 2:
 * <p>
 * Input: "cbbd" Output: "bb"
 */
public class LongestPalindromicSubstring {
    String res = "";

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            expandHelper(s, i, i);
            expandHelper(s, i, i + 1);
        }
        return res;
    }

    private void expandHelper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        String current = s.substring(left + 1, right);
        if (current.length() > res.length()) {
            res = current;
            System.out.println(res);
        }
    }

    public String longestPalindromeDP(String s) {
        // base case;
        if (s == null || s.length() == 0) {
            return s;
        }

        // initialize a 2D array
        int maxLength = 1, n = s.length();
        // all strings with length of 1 are palindromes
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // for length of 2, if both characters are the same,
        // then they are palindromes
        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (length > maxLength) {
                        maxLength = length;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLength);
    }
}
