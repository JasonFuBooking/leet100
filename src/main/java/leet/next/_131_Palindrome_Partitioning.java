package leet.next;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 For example, given s = "aab",
 Return

 [
 ["aa","b"],
 ["a","a","b"]
 ]
 */

/*
这道题非常好，值得详细写一写。
基本的思路还是dp.

仔细分析题目可以发现，dp[i]的结果集实际上是可以建立在dp[i-1]之上的。
分两种情况：
1. 首先要看s[i],即当前字符，和他之前的i个字符是否构成了回文。（50行的for循环）
    举个例子：aab。
    当我们看到第三个元素b时，我们需要依次判断，b和他之前的i个元素是否构成了回文，即ab, aab，是否是回文
    因为回文总是连续的，所以这里使用一个循环即可判断完
    如果构成了回文，就要把这个回文s(j,i)，连同dp[j-1]合在一起，放入结果集
    62行是为了处理j-1小于零的情况，也就是s(j,i)实际上就是前i个字符了
2. 判断完当前元素的情况之后，我们还需要把当前的元素加入到dp[i-1]的所有回文序列中，因为单独的一个字母也算回文，
   所以这种情况也可以构成解。（69行的for循环）

总共就是这样种情况啦，都统计完成之后就可以算出dp[i]了。

 */
public class _131_Palindrome_Partitioning {
    public List<List<String>> partition(String s) {
        List<String> result0 = new ArrayList<>();
        result0.add(s.substring(0, 1));
        List<List<String>> result = new ArrayList<>();
        result.add(result0);
        Map<Integer, List<List<String>>> map = new HashMap<>(); //map来保存每加入一个元素的解
        map.put(0, result);


        for (int i = 1; i < s.length(); ++i) {
            List<List<String>> resulti = new ArrayList<>();
            for (int j = i - 1; j >= 0; --j) {
                if (isPalindrome(s, j, i)) {
                    List<List<String>> resultj = map.get(j - 1);
                    if (resultj != null) {
                        for (List<String> list : resultj) {
                            List<String> buffer = new ArrayList<>();
                            buffer.addAll(list);
                            buffer.add(s.substring(j, i + 1));
                            resulti.add(buffer);
                        }
                    } else {
                        List<String> buffer = new ArrayList<>();
                        buffer.add(s.substring(j, i + 1));
                        resulti.add(buffer);
                    }
                }
            }
            for (List<String> list : map.get(i - 1)) {
                List<String> buffer = new ArrayList<>();
                buffer.addAll(list);
                buffer.add(s.substring(i, i + 1));
                resulti.add(buffer);
            }
            map.put(i, resulti);
        }
        return map.get(s.length() - 1);
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            ++left;
            --right;
        }
        return true;
    }
}
