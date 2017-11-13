package leet.next;

/**
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 */

/*
这个其实和十进制数分离每一位一样，通过不停的先取余在除法来实现。
25行的--n真的很关键。
自己跑一下就知道了。
 */
public class _168_Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            --n;
            result.insert(0, (char)(n % 26 + 'A'));
            n /= 26;
        }
        return result.toString();
    }
}
