package leet;

import java.util.LinkedList;
import java.util.List;

public class ZigZagConversion {
    /*
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R

    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a number of rows:

    string convert(string text, int nRows);
    convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
     */

    /*
    我用的方法就是使用一个list来重现转换后的数据结构，每个列一个Element
    构建完Element的数组之后，便利这个数组numRows 次，依次取出每一行即可。

    关键的点：
    要找出不同的行（numRows）对应的行的特点：
    1 行，和原数组没有差别

    2 行：
     abcd
     转换成
     ab
     cd

    3 行：
     abcdef
     转换成
     a   e
     b d f
     c

    4 行:
     abcdefgh
     转换成
     a       g
     b    f  h
     c  e
     d

    规律就是有两种列，普通列和间隔列，普通列有numRows个元素，间隔列只有一个元素
    间隔列的数量怎么确定呢，其实就是 numRows - 2， 即小于3行的是没有间隔列的。

    按照这样的规律来构建列数组即可。
    85行是构建普通列，普通列构建完了自然就开始间隔列，所以间隔列的大小重置一下（82行）

    间隔列每列只有一个元素，只是位置不同而已，位置也有规律，是【numRows - 2， 1】，倒叙排列

    最后在遍历numRows次列数组取出每一行即可

     */
    private class Element {
        private String column;
        private int gapCount = -1;
        public Element(String substring) {
            column = substring;
        }

        public Element(int gapCount, String column) {
            this.gapCount = gapCount;
            this.column = column;
        }

        @Override
        public String toString() {
            return column;
        }

    }
    private static String empty = "";
    public String convert(String s, int numRows) {
        List<Element> columns = new LinkedList<>();
        int i = 0;
        int gapCount = 0;
        while (i < s.length()) {
            if (gapCount == 0) {
                if (i + numRows - 1 < s.length()) {
                    columns.add(new Element(s.substring(i, i + numRows)));
                } else {
                    columns.add(new Element(s.substring(i, s.length())));
                }
                i = i + numRows;
                gapCount = (numRows - 2) > 0 ? (numRows - 2) : 0;
            }
            if (gapCount > 0 && i < s.length()) {
                columns.add(new Element(gapCount, s.substring(i, i + 1)));
                --gapCount;
                ++i;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < numRows; ++j) {
            for (Element element : columns) {
                if (element.gapCount == -1) {
                    if (j < element.column.length()) {
                        stringBuilder.append(element.column.charAt(j));
                    }
                } else if (element.gapCount == j) {
                    stringBuilder.append(element.column);
                }
            }
        }

        return stringBuilder.toString();
    }
}
