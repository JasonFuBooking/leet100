package leet.next;

/**
 You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 Example:

 [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

 Answer: 16
 Explanation: The perimeter is the 16 yellow stripes in the image below:

 */

/*
这道题看着很唬人其实很简单。逐个数1的四边即可
 */
public class _463_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; ++i) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; ++j) {
                if (grid[i][j] == 1) {
                    sum += (calculateSide(i - 1, j, grid.length, row.length, grid) +
                            calculateSide(i + 1, j,  grid.length, row.length, grid) +
                            calculateSide(i, j - 1,  grid.length, row.length, grid) +
                            calculateSide(i, j + 1,  grid.length, row.length, grid));
                }
            }
        }
        return sum;
    }

    private int calculateSide(int i, int j, int maxI, int maxJ, int[][] grid) {
        if (i < 0 || j < 0 || i > maxI - 1 || j > maxJ - 1) {
            return 1;
        }
        if (grid[i][j] == 0) return 1;
        return 0;
    }
}
