package leet.next;

import util.Interval;

import java.util.*;

/**
 Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].
 */

/*
一开始想看到这个例子，想着首尾链接不就好了。
写完之后一提交才发现，list可以是无序的啊，不早说，我就说黄色题不可能真么简单。

想来想去还是直接排序好了，其他方法也差不多的复杂度，于是先对intervals拍了一下序

直到我看到了这个case：[[1,4],[2,3]]
其实也不难，加上41行即可

 */
public class _056_MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        Set<Integer> skip = new HashSet<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) return -1;
                if (o1.start == o2.start) return 0;
                return 1;
            }
        });
        for (int i = 0; i < intervals.size() - 1; ++i) {
            if (intervals.get(i).end >= intervals.get(i + 1).start) {
                intervals.get(i + 1).start = intervals.get(i).start;
                if (intervals.get(i).end > intervals.get(i + 1).end) {
                    intervals.get(i + 1).end = intervals.get(i).end;
                }
                skip.add(i);
            }
        }
        for (int i = 0; i < intervals.size(); ++i) {
            if (!skip.contains(i)) {
                result.add(intervals.get(i));
            }
        }
        return result;
    }
}