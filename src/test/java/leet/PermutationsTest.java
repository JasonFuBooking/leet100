package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/21/17.
 */
public class PermutationsTest {
    @Test
    public void permute() throws Exception {
        Permutations permutations = new Permutations();
        Assert.assertEquals(permutations.permute(new int[]{1,2,3}).size(), 6);
        Assert.assertEquals(permutations.permute(new int[]{1,2}).size(), 2);
        Assert.assertEquals(permutations.permute(new int[]{1}).size(), 1);
        Assert.assertEquals(permutations.permute(new int[]{}).size(), 0);
    }

}