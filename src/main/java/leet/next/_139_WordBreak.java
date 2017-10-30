package leet.next;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

 For example, given
 s = "leetcode",
 dict = ["leet", "code"].

 Return true because "leetcode" can be segmented as "leet code".

 UPDATE (2017/1/4):
 The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.
 */

/*
一开始没有想到用dp
当我看到其他的解法以后，这简直和96题一毛一样啊。

最最关键的思路就是用了双重循环，外层当然是计算dp[i]
内层是从0到i遍历，看看前半截和后半截字符串是不是都在set里，是的话dp[i]就是true
其实本质还是遍历的所有情况，
只不过最最最关键的是37行，利用了之前计算的结果dp[j]。这样省去了一些重复计算
 */
public class _139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        set.addAll(wordDict);
        boolean[] dp = new boolean[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j <= i; ++j) {
                if (dp[j] || set.contains(s.substring(0, j + 1))) {
                    if (j == i || set.contains(s.substring(j + 1, i + 1))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[s.length() - 1];
    }
}
