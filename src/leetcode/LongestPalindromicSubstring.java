package leetcode;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
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
}
