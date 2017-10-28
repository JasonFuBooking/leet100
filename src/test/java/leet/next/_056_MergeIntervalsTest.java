package leet.next;

import org.junit.Assert;
import org.junit.Test;
import util.Interval;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class _056_MergeIntervalsTest {
    @Test
    public void merge() throws Exception {
        _056_MergeIntervals test = new _056_MergeIntervals();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));
        Assert.assertEquals(test.merge(intervals).size(), 3);

        intervals = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(3,6));
        intervals.add(new Interval(6,10));
        intervals.add(new Interval(10,18));
        Assert.assertEquals(test.merge(intervals).size(), 1);

        intervals = new ArrayList<>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(2,3));
        Assert.assertEquals(test.merge(intervals).size(), 1);
    }

}