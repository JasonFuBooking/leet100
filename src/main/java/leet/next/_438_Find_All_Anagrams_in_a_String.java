package leet.next;

import java.util.ArrayList;
import java.util.List;

/**
 Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 The order of output does not matter.

 Example 1:

 Input:
 s: "cbaebabacd" p: "abc"

 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".
 Example 2:

 Input:
 s: "abab" p: "ab"

 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The/ substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

/*
思路，其实我这里还是用了暴力搜索的方法，勉强通过测试。
讨论里有很多sliding window的方法，可以看一看
 */
public class _438_Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> results = new ArrayList<>();
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            if (i + p.length() > s.length()) continue;
            int indexSource = i;

            for (int j = 0; j < p.length(); ++j) {
                ++chars[s.charAt(indexSource) - 'a'];
                ++indexSource;
            }
            for (int j = 0; j < p.length(); ++j) {
                --chars[p.charAt(j) - 'a'];
            }

            boolean allZero = true;
            for (int count : chars) {
                if (count != 0) {
                    allZero = false;
                }
            }
            if (allZero) {
                results.add(i);
            }
            for (int k = 0; k < chars.length; ++k) {
                chars[k] = 0;
            }
        }
        return results;
    }
}
