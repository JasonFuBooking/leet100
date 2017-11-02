package leet.next;

/**
 Given a string, your task is to count how many palindromic substrings in this string.

 The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

 Example 1:
 Input: "abc"
 Output: 3
 Explanation: Three palindromic strings: "a", "b", "c".

 Example 2:
 Input: "aaa"
 Output: 6
 Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

 Note:
 The input string length won't exceed 1000.
 */

/*
这个其实还是可以用dfs递归遍历
只不过要考虑以下两点：
1. 要找对称字串，所以应该从当前字符向两边扩展，而不是从头到尾
2. 扩展也有两种情况，以当前字符为中心，例如：aca
   还有以两个字符为中心，acca，这里我们统一以i和i + 1为中心
 */

public class _647_Palindromic_Substrings {
    private int count;
    public int countSubstrings(String s) {
        count = 0;
        if (s == null || s.length() == 0) return count;
        for(int i = 0; i < s.length(); ++i) {
            search(s, i, i);
            search(s, i, i + 1);
        }
        return count;
    }

    private void search(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            ++count;
            --i;
            ++j;
        }
    }
}
