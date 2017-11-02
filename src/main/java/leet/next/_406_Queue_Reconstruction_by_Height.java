package leet.next;

import java.util.*;

/**
 Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

 Note:
 The number of people is less than 1,100.

 Example

 Input:
 [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

 Output:
 [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */

/*
这个完全是思路的问题。。。你要能想到方法，那就很简单

首先按照高度排序。
然后按照排序后的序列，一层一层按照k的插入新的位置。
例子：
先排序7开头的： 7,0 7,1
接下来排6开头的，6只有1个，k值是1,把他插入到现有排好序的列表的1位置：
【7，0】【6，1】 【7，1】
为什么可以这样插？因为在6之前就只有7的元素，他们肯定是比6大的。
按照k的定义，就是前边比6大的个数，那肯定都比他大呀，所以在都是7的列表里只要数个数就可以了

后边的依次类推就可以
 */
public class _406_Queue_Reconstruction_by_Height {
    class People {
        Integer height;
        Integer number;

        public People(Integer height, Integer number) {
            this.height = height;
            this.number = number;
        }

        @Override
        public String toString() {
            return "[" +
                    "height=" + height +
                    ", number=" + number +
                    ']';
        }
    }
    public int[][] reconstructQueue(int[][] people) {
        List<People> list = new ArrayList<>();
        for (int[] p : people) {
            list.add(new People(p[0], p[1]));
        }
        TreeMap<Integer, TreeSet<People>> map = new TreeMap<>(Comparator.reverseOrder());
        for (People p : list) {
            TreeSet<People> set = map.get(p.height);
            if (set == null) {
                set = new TreeSet<>(Comparator.comparing(o -> o.number));
            }
            set.add(p);
            map.put(p.height, set);
        }
        List<People> result = new ArrayList<>();
        for (Integer key : map.keySet()) {
            TreeSet<People> peoples = map.get(key);
            for (People p : peoples) {
                result.add(p.number, p);
            }
        }

        for (int i = 0; i < people.length; ++i) {
            people[i][0] = result.get(i).height;
            people[i][1] = result.get(i).number;
        }

        return people;
    }
}
