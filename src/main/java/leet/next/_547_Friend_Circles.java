package leet.next;

import java.util.*;

/**
 There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.

 Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.

 Example 1:
 Input:
 [[1,1,0],
 [1,1,0],
 [0,0,1]]
 Output: 2
 Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
 The 2nd student himself is in a friend circle. So return 2.

 Example 2:
 Input:
 [[1,1,0],
 [1,1,1],
 [0,1,1]]
 Output: 1
 Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends,
 so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.

 Note:
 N is in range [1,200].
 M[i][i] = 1 for all students.
 If M[i][j] = 1, then M[j][i] = 1.
 */

/*
看了某答案的一句话我真的是无语凝噎。。。
：这叫做求无向图邻接矩阵连通分支的个数。。。。。。。。。

没办法只好去复习了一下图的部分。
我的解法就很简单了：
1. 第一步，先把顶点建出来。 65-68

2. 把每个顶点的相邻的顶点填充上 70-76
这就相当于把图建立出来了

3. 从每一个点出发进行广度优先搜索（因为有可能是森林啊），同时用visited保证已经遍历过得节点不会再搜索。 78-102
次数保存在count中

 */
public class _547_Friend_Circles {
    class Node {
        int value;
        List<Node> linkedNodes = new ArrayList<>();

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + value + "}";
        }
    }

    public int findCircleNum(int[][] M) {
        Map<Integer, Node> nodeMap = new HashMap<>();
        for (int i = 0; i < M.length; ++i) {
            nodeMap.put(i, new Node(i));
        }

        for (int i = 0; i < M.length; ++i) {
            for (int j = 0; j < M[i].length; ++j) {
                if (M[i][j] == 1) {
                    nodeMap.get(i).linkedNodes.add(nodeMap.get(j));
                }
            }
        }

        int count = 0;
        Set<Node> visited = new HashSet<>();
        for (int i = 0; i < M.length; ++i) {
            Node node = nodeMap.get(i);
            if (visited.contains(node)) continue;
            visited.add(node);
            List<Node> allLinkedNodes = new ArrayList<>();
            allLinkedNodes.addAll(node.linkedNodes);
            visited.addAll(node.linkedNodes);

            while (!allLinkedNodes.isEmpty()) {
                List<Node> nextLinkedNodes = new ArrayList<>();
                for (Node next : allLinkedNodes) {
                    for (Node linked : next.linkedNodes) {
                        if (!visited.contains(linked)) {
                            nextLinkedNodes.add(linked);
                            visited.add(linked);
                        }
                    }
                }
                allLinkedNodes.clear();
                allLinkedNodes.addAll(nextLinkedNodes);
            }
            ++count;
        }

        return count;
    }
}