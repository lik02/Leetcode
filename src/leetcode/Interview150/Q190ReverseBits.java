package leetcode.Interview150;

public class Q190ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res = res | (n & 1);// res |= (n & 1)
            n >>= 1;
        }
        return res;
    }
}
