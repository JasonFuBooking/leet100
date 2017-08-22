package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/22/17.
 */
public class WordSearchTest {
    @Test
    public void exist() throws Exception {
        WordSearch wordSearch = new WordSearch();
        char[] row1 = new char[]{'A','B','C','E'};
        char[] row2 = new char[]{'S','F','C','S'};
        char[] row3 = new char[]{'A','D','E','E'};
        char[][] board = new char[][]{row1, row2, row3};
        Assert.assertTrue(wordSearch.exist(board, "ABCCED"));
        Assert.assertTrue(wordSearch.exist(board, "SEE"));
        Assert.assertTrue(!wordSearch.exist(board, "ABCB"));
    }

    @Test
    public void exist2() throws Exception {
        WordSearch wordSearch = new WordSearch();
        char[] row1 = new char[]{'C','A','A'};
        char[] row2 = new char[]{'A','A','A'};
        char[] row3 = new char[]{'B','C','D'};
        char[][] board = new char[][]{row1, row2, row3};
        Assert.assertTrue(wordSearch.exist(board, "AAB"));
    }

    @Test
    public void exist3() throws Exception {
        WordSearch wordSearch = new WordSearch();
        char[] row1 = new char[]{'A','B','C','E'};
        char[] row2 = new char[]{'S','F','E','S'};
        char[] row3 = new char[]{'A','D','E','E'};
        char[][] board = new char[][]{row1, row2, row3};
        Assert.assertTrue(wordSearch.exist(board, "ABCESEEEFS"));
    }

}