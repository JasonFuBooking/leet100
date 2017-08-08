package leet;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsTest {
    private LetterCombinations letterCombinations = new LetterCombinations();

    @Test
    public void letterCombinations() throws Exception {
        List<String> result = new ArrayList<>();
        result.add("ad");
        result.add("bd");
        result.add("cd");
        result.add("ae");
        result.add("be");
        result.add("ce");
        result.add("af");
        result.add("bf");
        result.add("cf");
        Assert.assertTrue(result.equals(letterCombinations.letterCombinations("23")));

        Assert.assertTrue(new LinkedList<>().equals(letterCombinations.letterCombinations("")));
    }
}

