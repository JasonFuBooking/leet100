package leet.next;

/**
 Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */

/*
最好还是能看出那个公式来：
y(n) = 26^n*nums[n] + ... + 26^i * nums[i] + ... + 26^0 * nums[0]
后边的就简单了
 */

public class _171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int result = 0, index = 0;
        for (int i = charArray.length - 1; i >= 0; --i) {
            result += (multipleNumber(26, index) * (charArray[i] - 'A' + 1));
            ++index;
        }
        return result;
    }

    private int multipleNumber(int base, int times) {
        if (times == 0) return 1;
        int result = 1;
        for (int i = 0; i < times; ++i) {
            result *= base;
        }
        return result;
    }
}
