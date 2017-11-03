package leet.next;

import java.util.Stack;

/**
 Given an encoded string, return it's decoded string.

 The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

 You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

 Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

 Examples:

 s = "3[a]2[bc]", return "aaabcbc".
 s = "3[a2[c]]", return "accaccacc".
 s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */

/*
这道题可能更像之前做过的codility上的工程题
对时间复杂度没有特别的要求，但是处理起来逻辑比较复杂，需要仔细一些。

我的思路：
1. 在decode函数里，只展开外层括号，例如 3[a2[c]] -> a2[c]a2[c]a2[c]
   借助栈来识别外层函数，从左到右扫描，遇到【就入栈，遇到】就出栈，当栈的大小为0时，就确定了左右范围
   这里通过这种方法可以确定left = 1, right = 7
   把这一段展开，放入buffer。再继续后边的字符串
2. 第一层展开后可能还有嵌套的，因此我们循环展开直到没有括号为止。 line 37-41
 */
public class _394_Decode_String {
    public String decodeString(String s) {
        StringBuilder buffer = new StringBuilder();
        decode(s, buffer);
        s = buffer.toString();
        while (s.contains("[")) {
            buffer = new StringBuilder();
            decode(s, buffer);
            s = buffer.toString();
        }
        return s;
    }

    private void decode(String s, StringBuilder buffer) {
        Stack<Character> stack = new Stack<>();

        while (s.length() > 0) {
            int count = 0, end = 0;
            int k = 0;
            while (k < s.length() && !Character.isDigit(s.charAt(k))) {
                buffer.append(s.charAt(k));
                ++k;
            }
            if (k == s.length()) break;

            end = k + 1;
            while (end < s.length() && Character.isDigit(s.charAt(end))) ++end;
            count = Integer.valueOf(s.substring(k, end));

            int i = end, j = i;
            while (j < s.length()) {
                if (s.charAt(j) == '[') stack.push('[');
                if (s.charAt(j) == ']') stack.pop();

                if (stack.isEmpty()) {
                    break;
                } else {
                    ++j;
                }
            }
            for (int p = 0; p < count; ++p) {
                buffer.append(s.substring(i + 1, j));
            }
            s = s.substring(j + 1, s.length());
        }
    }
}
