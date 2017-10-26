package leet.next;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
     "((()))",
     "(()())",
     "(())()",
     "()(())",
     "()()()"
 ]
 */

/*
这里用了dp的思路
这一次的结果集，就是把一个新的()插入到上一次的所有结果集的所有位置
同时注意去重即可
 */
public class _022_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        result.add("()");
        for (int i = 2; i <= n; ++i) {
            Set<String> set = new HashSet<>();
            for (String parentheses : result) {
                for (int j = 0; j < parentheses.length(); ++j) {
                    set.add(parentheses.substring(0, j) + "()" + parentheses.substring(j, parentheses.length()));
                }
            }
            result.clear();
            result.addAll(set);
        }

        return result;
    }
}
