package leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

/*
    借助栈来实现就可以了，唯一需要注意的点，就是在栈定取出一个元素的时候，要使用它对应的另一半括号来比较
 */

public class ValidParentheses {
    private static Map<Character, Character> map = new HashMap<>();
    static {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                Character top = map.get(stack.peek());
                if (top != null &&  top == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
