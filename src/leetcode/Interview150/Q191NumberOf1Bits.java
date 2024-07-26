package leetcode.Interview150;

public class Q191NumberOf1Bits {
    public int hammingWeight(int n) {
        int res = 0;
        String str = Integer.toBinaryString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("1")) {
                res++;
            }
        }
        return res;
    }
}
