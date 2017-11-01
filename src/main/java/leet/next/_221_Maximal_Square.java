package leet.next;

/**
 Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 For example, given the following matrix:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0

 Return 4.
 Credits:
 Special thanks to @Freezen for adding this problem and creating all test cases.
 */

/*
我这里用了最基本的搜索的方法：

1. 因为是正方形，所以我从一个顶点开始，想右下扩展，并检查是否都是1，直到扩展到不能扩展为止，记录下边长
2. 遍历整个数组，统计每个点的最长边长
3. 最后返回最长乘积

注意的点：
1. 怎么扩展呢？
按照对角线扩展 （52 到 74 行）
   a. 先检查第一个对角线元素i + 1, j + 1是不是1，不是1就可以结束了
   b. 如果是1的话，就看这个点的竖直方向和水平方向是不是都是1，是的话就构成了正方形。
      当然，竖直方向的最小值应该是i,水平方向的最小值是j  （56 to 67行）
   c. 如果b通过了，那就继续下一个对角线点i + 2, j + 2 （68 to 70行）

2. 注意检查对角线点本身是不是1 （54行）

 */
public class _221_Maximal_Square {
    class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int maximalSquare(char[][] matrix) {
        int maxLength = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == '0') continue;
                int x = i + 1, y = j + 1;
                while (x < matrix.length && y < matrix[x].length) {
                    if (matrix[x][y] == '0') break;
                    boolean isAllOne = true;
                    for (int row = x - 1; row >= i; --row) {
                        if (matrix[row][y] != '1') {
                            isAllOne = false;
                            break;
                        }
                    }
                    for (int column = y - 1; column >= j; --column) {
                        if (matrix[x][column] != '1') {
                            isAllOne = false;
                            break;
                        }
                    }
                    if (isAllOne) {
                        ++x;
                        ++y;
                    } else {
                        break;
                    }
                }
                maxLength = Math.max(x - i, maxLength);
            }
        }
        return maxLength * maxLength;
    }
}
