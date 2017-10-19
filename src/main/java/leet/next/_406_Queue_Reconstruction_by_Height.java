package leet.next;

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
public class _406_Queue_Reconstruction_by_Height {
    public int[][] reconstructQueue(int[][] people) {
        return null;
    }
}

/*
Java solution using Arrays.sort() and "insert sorting" idea
We first sort the people to make them stand from the highest to shortest. For people with same height, sort them according to the count of people before them from small to big.

Then, we use the way similar to insert sorting to reorder the people. For a given person to insert, all the people already sorted are higher, so we just insert him in the "right" place to make the people before him as his "count" indicates. Since he is shorter than all the people in the sorted list, the "count" of the "existing" people does not be broken by the insertion.

    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];

        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });

        int n = people.length;
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});

        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : tmp) {
            res[i][0] = k[0];
            res[i++][1] = k[1];
        }

        return res;
    }
 */