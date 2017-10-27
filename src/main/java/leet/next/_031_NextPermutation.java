package leet.next;

import java.util.Arrays;

/**
 Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 The replacement must be in-place, do not allocate extra memory.

 Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */

/*
这道题最最关键的就是要读懂题目的意思，我翻译一下
1. 把当前数组中的数字求全排列，得到所有排列的集合
2. 对这个集合按照数字字面大小从小到大排序
3. 求当前排列相邻右边的那个排列，也就是只比他大一点点的那个
例如：1，2，3
1. 所有排列：（1，2，3） （1，3，2）（3，1，2）（3，2，1）（2，1，3）（2，3，1）
2. 排序：123，132，213，231，312，321
3. 于是1，2，3的下一个应该是132

那么落实到算法怎么求呢？我们是不可能用这种暴力方法求解的。
因为要求是只要大一点点，所以我们应该从右（个位）开始寻找。方法如下：
1. 先从右向左遍历，如果num[i] > num[i - 1]，说明是升序，继续，直到第一个降序的数字。如果所有数字都是升序，说明到了最大值，如321，那他的next值就是数组翻转过来的最小值。
2. 找到第一个降续的数字之后，我们以2,3,6,5,4,1为例
   第一个降续的是3，我们要把3和后边的升序数组里刚刚好比他大一点的数字交换，以保证带来的增幅最小，
   因为是有序序列，遍历一遍就可以找到这个数字：4
   此时变为2,4,6,5,3,1
3. 最后要把i-1到n的数字再排序一下：2,4,1,3,5,6
 */
public class _031_NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return;
        if (nums.length == 2) {
            swap(nums, 0, 1);
            return;
        }

        int j = nums.length - 1;
        while (j > 0 && nums[j - 1] >= nums[j]) {
            --j;
        }
        if (j == 0) {
            reverse(nums);
            return;
        }
        j = j - 1;

        int i = nums.length - 1;
        while (i >= 0 && nums[i] <= nums[j]) {
            --i;
        }

        swap(nums, i, j);
        Arrays.sort(nums, j + 1, nums.length);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums) {
        int[] temp = new int[nums.length];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; --i) {
            temp[index++] = nums[i];
        }
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = temp[i];
        }
    }
}