package leet;

public class ReverseInteger {
    /*
    Reverse digits of an integer.

    Example1: x = 123, return 321
    Example2: x = -123, return -321

    click to show spoilers.

    Note:
    The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
     */

    /*
    有两点需要注意：
    1. 要判断转换后的整数是否超出int的范围，这里使用一个long来保存转换后的数字，在判断即可
    2. 负数提前转换成整数，最后再转换回来就行了

    当然也有可以优化的地方，比如stringbuilder可以用定长的字符数组代替

     */
    public int reverse(int x) {
        if (x == 0) return 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = x * -1;
        }

        StringBuilder result = new StringBuilder();
        while (x > 0) {
            result.append(x % 10);
            x = x / 10;
        }
        while (result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        Long number = Long.valueOf(result.toString());
        if (isNegative) {
            number *= -1;
            if (number < Integer.MIN_VALUE) return 0;
        } else {
            if (number > Integer.MAX_VALUE) return 0;
        }
        return Math.toIntExact(number);
    }
}
