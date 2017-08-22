package leet;

/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.
 */

/*

这道题的思路呢，其实一般都能想到，就是依次遍历每个元素，以当前元素为起点，逐个寻找目标字符串的下一个字符，直到找到最后一个为止。
递归是比较直接的想法。

我数次提交失误的地方：
0. 没有记录访问过节点，导致错误发生
1. 使用了一个set来记录访问的节点，先把节点坐标转换成字符串，存储在set里，超时。应该像32行一样使用boolean数组即可
2. 没有想到68行！！！！通过68行，就不用每次都new一个新的的visited来保存访问过的节点，访问之后主动释放，visited就可以重复使用。
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; ++i) {
            char[] row = board[i];
            for (int j = 0; j < row.length; ++j) {
                char character = row[j];
                if (word.charAt(0) == character) {
                    boolean exist = search(board, i, j, board.length, row.length, word, 0, visited);
                    if (exist) return true;
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, int i_max, int j_max, String word, int index, boolean[][] visited) {
        if (visited[i][j]) return false;
        visited[i][j] = true;

        if (index == word.length() - 1) return true;
        if (i - 1 >= 0 && board[i - 1][j] == word.charAt(index + 1)) {
            boolean isExist = search(board, i - 1, j, i_max, j_max, word, index + 1, visited);
            if (isExist) return true;
        }
        if (i + 1 < i_max && board[i + 1][j] == word.charAt(index + 1)) {
            boolean isExist = search(board, i + 1, j, i_max, j_max, word, index + 1, visited);
            if (isExist) return true;
        }
        if (j - 1 >= 0 && board[i][j - 1] == word.charAt(index + 1)) {
            boolean isExist = search(board, i, j - 1, i_max, j_max, word, index + 1, visited);
            if (isExist) return true;
        }
        if (j + 1 < j_max && board[i][j + 1] == word.charAt(index + 1)) {
            boolean isExist = search(board, i, j + 1, i_max, j_max, word, index + 1, visited);
            if (isExist) return true;
        }
        visited[i][j] = false;
        return false;
    }
}
