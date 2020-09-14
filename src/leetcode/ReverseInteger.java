package leetcode;

public class ReverseInteger {
    /**
     * Example 1:
     * <p>
     * Input: 123
     * Output: 321
     * Example 2:
     * <p>
     * Input: -123
     * Output: -321
     * Example 3:
     * <p>
     * Input: 120
     * Output: 21
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
     * range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed
     * integer overflows.
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }
}
