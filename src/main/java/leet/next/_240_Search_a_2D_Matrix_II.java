package leet.next;

import java.util.ArrayList;
import java.util.List;

/**
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted in ascending from left to right.
 Integers in each column are sorted in ascending from top to bottom.
 For example,

 Consider the following matrix:

 [
     [1,   4,  7, 11, 15],
     [2,   5,  8, 12, 19],
     [3,   6,  9, 16, 22],
     [10, 13, 14, 17, 24],
     [18, 21, 23, 26, 30]
 ]
 Given target = 5, return true.

 Given target = 20, return false.
 */

/*
我的思路是先找到可能的行
在二分查找每一行。复杂度为mlog(n)

失误的点：
1. 数组空的判断 37, 41行
2. valid行号存在单独的list里
 */
public class _240_Search_a_2D_Matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        List<Integer> rowIndex = new ArrayList<>();
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i].length == 0) continue;
            if (matrix[i][0] <= target && target <= matrix[i][matrix[i].length - 1]) {
                rowIndex.add(i);
            }
        }
        for (int i = 0; i < rowIndex.size(); ++i) {
            boolean found = binarySearch(matrix, rowIndex.get(i), target);
            if (found) return true;
        }
        return false;
    }

    private boolean binarySearch(int[][] matrix, int i, int target) {
        int low = 0, high = matrix[i].length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[i][mid] < target) {
                low = mid + 1;
            } else if (target < matrix[i][mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
