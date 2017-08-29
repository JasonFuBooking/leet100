package leet;

/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 */

/*
第一次看题没有看到maximum这个词，注意审题啊！！！
最初的解法是怀着侥幸的心理依次遍历所有的情况，超时。。。。

这道题最最核心的是 max < i 那行的判断

要用动态的观点来看这个问题：
只有一个元素时：自然是可以的
两个元素：
   如果第一个元素的最远跳不能到达第二个元素，那以后都不用算了。 （39行）
   如果第一个元素的最远跳大于等于第二元素，那么1到2可达，我们同时记下最远跳 （40行）

接下来我们把1，2元素看做一个整体，他们的最远跳看做这个整体元素的最原跳，把它们当做一个元素来计算
在这样前提下，再来计算第三元素：（同样的算法）。。。。

其实还是dp，只不过基于最远跳的，不是那么直接。

 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length < 2) return true;
        int max = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (max < i) return false;
            max = Math.max(i + nums[i], max);
        }
        return true;
    }
}
