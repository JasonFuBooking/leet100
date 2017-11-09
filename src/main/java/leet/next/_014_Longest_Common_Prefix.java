package leet.next;

import java.util.Arrays;
import java.util.Comparator;

/**
 Write a function to find the longest common prefix string amongst an array of strings.
 */

/*
这道题还挺有意思的。
我看到的最贱的解法就是下边这个，先排序，然后比较首位就可以了。

当然常规的方法可以构建Trie，这样多次查询的话效率比较高
 */
public class _014_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs, Comparator.naturalOrder());
        String start = strs[0];
        String end = strs[strs.length - 1];
        int i = 0;
        while (i < start.length() && i < end.length()) {
            if (start.charAt(i) != end.charAt(i)) break;
            ++i;
        }
        return start.substring(0, i);
    }
}
