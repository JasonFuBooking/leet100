package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    private ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void maxArea() throws Exception {
        Assert.assertTrue(containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}) == 49);
    }

}