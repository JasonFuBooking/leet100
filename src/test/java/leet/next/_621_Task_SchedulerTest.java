package leet.next;

import leet.unresolve._621_Task_Scheduler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jafu on 11/2/17.
 */
public class _621_Task_SchedulerTest {
    @Test
    public void leastInterval() throws Exception {
        _621_Task_Scheduler test = new _621_Task_Scheduler();
        Assert.assertEquals(test.leastInterval(new char[]{'A','A','A','B','B','B'}, 0), 6);
        Assert.assertEquals(test.leastInterval(new char[]{'A','A','A','B','B','B'}, 2), 8);

        Assert.assertEquals(test.leastInterval(new char[]{'A','A','C','C','C','D','D','E','E','E'}, 3), 10);
        Assert.assertEquals(test.leastInterval(new char[]{'A','A','C','C','C','B','E','E','E'}, 2), 9);
    }

}