package leet;

public class LongestPalindromicSubstring {
    /*
    Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

    Example:

    Input: "babad"

    Output: "bab"

    Note: "aba" is also a valid answer.
    Example:

    Input: "cbbd"

    Output: "bb"
     */

    /*
        这里要注意有两种模式: bab 和 bb
        所以这里搜索了两次，分别搜索这两种不同的模式
        bab 的模式是第一个for循环, 以每一个元素为中点，向两边扩散
        bb 模式依次以两个元素为起点，向两边扩散搜索
     */

    public String longestPalindrome(String s) {
        String max = "";
        for (int i = 0; i < s.length(); ++i) {
            int left = i - 1, right = i + 1;
            String str = searchMaxString(s, left, right);
            max = max.length() > str.length() ? max : str;
        }

        for (int j = 1; j < s.length(); ++j) {
            int i = j - 1;
            if (s.charAt(i) == s.charAt(j)) {
                int left = i - 1, right = j + 1;
                String str = searchMaxString(s, left, right);
                max = max.length() > str.length() ? max : str;
            }
        }
        return max;
    }

    private String searchMaxString(String s, int left, int right) {
        while (left >=0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
            } else {
                break;
            }
        }
        return s.substring(left + 1, right);
    }


}
