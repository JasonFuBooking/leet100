package leet.next;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _207_Course_ScheduleTest {
    @Test
    public void canFinish() throws Exception {
        _207_Course_Schedule tets = new _207_Course_Schedule();
        tets.canFinish(2, new int[][]{
                {1, 0}
        });

        tets.canFinish(2, new int[][]{
                {1, 0},
                {0 ,1}
        });
    }

}