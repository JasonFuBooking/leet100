package leet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LongestSubstring {
    /*
    Given a string, find the length of the longest substring without repeating characters.

    Examples:

    Given "abcabcbb", the answer is "abc", which the length is 3.

    Given "bbbbb", the answer is "b", with the length of 1.

    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    /*
    使用两个指针, i 和 j, 初始都指向字符串的第一个字符。
    设置一个set来保存当前i与j之间的子串的所有字符，用于判断是否有重复
    另外一个queue用来按顺序的保存子串
    j 先往后移，每一移动一位，如果当前字符不在set里，就说明当前i与j之间的子串还没有重复。
    如果j指向的字符重复了，就向右移动i,并依次去掉set和queue里的字符，这里要注意queue先出队，保证是最左边的i指向的元素，之后才是set删除
    直到set里没有与当前j重复的元素为止。这样j又可以向后移动了。重复这个循环。

    注意的点：
    1. 28行，i j相等时也需要判断更新一下max
    2. while循环的时候要时刻之一i或者j是否越界
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        if (s.length() == 1) return 1;
        int i = 0, j = 0;
        int max = 0;
        Queue<Character> queue = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (i == j) {
                max = getMax(max, 1);
            }
            while (j < s.length() && !set.contains(s.charAt(j))) { //每移动一次都要检查一下
                set.add(s.charAt(j));
                queue.add(s.charAt(j));
                ++j;
            }
            max = getMax(max, set.size());
            while (j < s.length() && i < s.length() && set.contains(s.charAt(j))) { //每移动一次都要检查一下
                ++i;
                set.remove(queue.poll());
            }
        }
        return max;
    }

    private int getMax(int max, int i) {
        return max > i ? max : i;
    }
}
