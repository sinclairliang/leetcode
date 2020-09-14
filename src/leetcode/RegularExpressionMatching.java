package leetcode;


public class RegularExpressionMatching {
    /**
     * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
     * <p>
     * '.' Matches any single character.
     * '*' Matches zero or more of the preceding element.
     * The matching should cover the entire input string (not partial).
     * <p>
     * Note:
     * <p>
     * s could be empty and contains only lowercase letters a-z.
     * p could be empty and contains only lowercase letters a-z, and characters like . or *.
     * Example 1:
     * <p>
     * Input:
     * s = "aa"
     * p = "a"
     * Output: false
     * Explanation: "a" does not match the entire string "aa".
     * Example 2:
     * <p>
     * Input:
     * s = "aa"
     * p = "a*"
     * Output: true
     * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
     * Example 3:
     * <p>
     * Input:
     * s = "ab"
     * p = ".*"
     * Output: true
     * Explanation: ".*" means "zero or more (*) of any character (.)".
     * Example 4:
     * <p>
     * Input:
     * s = "aab"
     * p = "c*a*b"
     * Output: true
     * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
     * Example 5:
     * <p>
     * Input:
     * s = "mississippi"
     * p = "mis*is*p*."
     * Output: false
     */
    public boolean isMatch(String s, String p) {
        /**
         * Dynamic Programming
         * boolean dp[][] => s[0-i] and p[0-j] match
         * dp[0][0] = true
         *
         * 1. p.charAt(j) == s.charAt[i] => dp[i][j] = dp[i-1][j-1]
         * 2. If p.charAt(j) == '.' => dp[i][j] = dp[i-1][j-1]
         * 3. If p.charAt(j) == '*':
         *      sub conditions:
         *      1. if p.charAt(j-1) != s.charAt(i) => dp[i][j] = dp[i-1][j-2] // a* counts as empty;
         *      2.
         */
        return true;
    }
}
