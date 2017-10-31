package leet.next;

import java.util.*;

/**
 Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:

 11110
 11010
 11000
 00000

 Answer: 1

 Example 2:

 11000
 11000
 00100
 00011

 Answer: 3

 Credits:
 Special thanks to @mithmatt for adding this problem and creating all test cases.
 */

/*
我最开始的算法是逐行遍历，逐个看每一个节点的上下左右，把连在一起的归类，但是逐个看有个问题
就是我的 testcase 1 这种情况， 会多算。

第二次改是我注释掉的代码，其实我已经用了DFS了，只不过用了额外的set来保存遍历过的节点。

最后一次就是现在的代码，参考答案之后。去掉了辅助存储，改为直接在数组上操作，
凡是遍历过得统统改为0.
因为一坐岛会在一次search中都会递归遍历完，所以44行下一次循环开始时，还剩下的1肯定就是剩下的岛屿的。

 */
public class _200_Number_of_Islands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (grid[i][j] == '0') continue;
                search(grid, i, j);
                ++count;
            }
        }
        return count;
    }

    private void search(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length
                || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        search(grid, i, j - 1);
        search(grid, i, j + 1);
        search(grid, i - 1, j);
        search(grid, i + 1, j);
    }

//    public int numIslands(char[][] grid) {
//        Map<String, Object> map = new HashMap<>();
//        for (int i = 0; i < grid.length; ++i) {
//            for (int j = 0; j < grid[i].length; ++j) {
//                String current = i + "" + j;
//                if (grid[i][j] == '0') continue;
//                if (j - 1 >= 0 && grid[i][j - 1] == '1') {
//                    assignShip(map, i + "" + (j - 1), current);
//                }
//                if (j + 1 < grid[i].length && grid[i][j + 1] == '1') {
//                    assignShip(map, i + "" + (j + 1), current);
//                }
//                if (i - 1 > 0 && grid[i - 1][j] == '1') {
//                    assignShip(map, (i - 1) + "" + j, current);
//                }
//                if (i + 1 < grid.length && grid[i + 1][j] == '1') {
//                    assignShip(map, (i + 1) + "" + j, current);
//                }
//                map.computeIfAbsent(current, k -> new Object());
//            }
//        }
//        Set<Object> set = new HashSet<>();
//        set.addAll(map.values());
//        return set.size();
//    }
//
//    private void assignShip(Map<String, Object> map, String target, String current) {
//        Object currentShip = map.get(current);
//        Object ship = map.get(target);
//        if (ship == null && currentShip == null) {
//            currentShip = new Object();
//            map.put(current, currentShip);
//            map.put(target, currentShip);
//        } else if (currentShip == null) {
//            map.put(current, ship);
//        } else {
//            map.put(target, currentShip);
//        }
//    }
}