package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/29/17.
 */
public class SubsetsTest {
    @Test
    public void subsets() throws Exception {
        Subsets subsets = new Subsets();
        Assert.assertTrue(subsets.subsets(new int[]{}).size() == 1);
        Assert.assertTrue(subsets.subsets(new int[]{1}).size() == 2);
        Assert.assertTrue(subsets.subsets(new int[]{1,2}).size() == 4);
        Assert.assertTrue(subsets.subsets(new int[]{1,2,3}).size() == 8);
    }

}