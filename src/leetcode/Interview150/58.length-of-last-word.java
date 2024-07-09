package leetcode.Interview150;

/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].startsWith(" ")) {
                return str[i].length();
            }
        }
        return -1;
    }
}
// @lc code=end

