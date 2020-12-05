package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int n = Integer.MAX_VALUE;
        for (String s : strs) {
            n = Math.min(n, s.length());
        }
        for (int i = 0; i < n; i++) {
            char curr = strs[0].charAt(i);
            for (String str : strs) {
                if (curr != str.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}
