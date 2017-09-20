package leet;

import java.util.*;

/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note: All inputs will be in lower-case.


这道题其实有诸多限制条件，比如只能是英文小写字符，让问题简化了一些。
我的思路很简单，关键就在32行，为每一个单词计算一个key,如果key相同，则放入同一个list里
（如何计算key：申请一个26长的字符数组，遍历每一个字符，相应的字符数组的位置加1，key是由每个字符及其出现次数构成的）
第一遍失败了，问题在于47行没有加上逗号，如果没有逗号，就是纯数字的组合，这样的key其实会出现重复的情况，没有保证唯一性
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int[] temp = new int[26];
        for (String str : strs) {
            initial(temp);
            for (int i = 0; i < str.length(); ++i) {
                ++temp[str.charAt(i) - 'a'];
            }
            String key = getKey(temp);
            List<String> value = map.get(key);
            if (value == null) {
                value = new ArrayList<>();
                map.put(key, value);
            }
            value.add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String getKey(int[] temp) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < temp.length; ++i) {
            if (temp[i] > 0) {
                str.append(i).append(temp[i]).append(",");
            }
        }
        return str.toString();
    }

    private void initial(int[] temp) {
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = 0;
        }
    }
}
