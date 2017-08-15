package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/15/17.
 */
public class BuyAndSellStockTest {
    private BuyAndSellStock buyAndSellStock = new BuyAndSellStock();

    @Test
    public void maxProfit() throws Exception {
        Assert.assertEquals(buyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
        Assert.assertEquals(buyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
    }

}