package leet.next;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
public class _200_Number_of_Islands {
    public int numIslands(char[][] grid) {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                String current = i + "" + j;
                if (j - 1 >= 0) {
                    assignShip(map, i + "" + (j - 1), current);
                }
                if (j + 1 < grid[i].length) {
                    assignShip(map, i + "" + (j + 1), current);
                }
                if (i - 1 > 0) {
                    assignShip(map, (i - 1) + "" + j, current);
                }
                if (i + 1 < grid.length) {
                    assignShip(map, (i + 1) + "" + j, current);
                }
            }
        }
        return map.values().size();
    }

    private void assignShip(Map<String, Object> map, String target, String current) {
        Object ship = map.get(target);
        Object currentShip = map.get(current);
        if (ship == null && currentShip == null) {
            ship = new Object();
            map.put(target, ship);
        } else if (ship == null) {
            ship = currentShip;
        }
        map.put(current, ship);
    }
}