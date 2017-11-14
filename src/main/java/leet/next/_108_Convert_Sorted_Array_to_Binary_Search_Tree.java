package leet.next;

import util.TreeNode;

/**
 Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */

/*
一定要注意19行计算mid的问题。不要忘记加上left
 */
public class _108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createTree(nums, left, mid - 1);
        node.right = createTree(nums, mid + 1, right);
        return node;
    }
}
