package leet;

/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
 */

/*
第二个方法用了常数级的空间，
思路：
The idea is to sweep all 0s to the left and all 2s to the right, then all 1s are left in the middle.

It is hard to define what is a "one-pass" solution but this algorithm is bounded by O(2n), meaning that at most each element will be seen and operated twice (in the case of all 0s).
You may be able to write an algorithm which goes through the list only once, but each step requires multiple operations, leading the total operations larger than O(2n).
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        for (int i : nums) {
            if (i == 0) ++red;
            if (i == 1) ++white;
            if (i == 2) ++blue;
        }
        int index = 0;
        for (int i = 0; i < red; ++i) {
            nums[index++] = 0;
        }
        for (int i = 0; i < white; ++i) {
            nums[index++] = 1;
        }
        for (int i = 0; i < blue; ++i) {
            nums[index++] = 2;
        }
    }

    public void sortColors1(int[] nums) {
        int second=nums.length - 1, zero = 0;
        for (int i = 0 ; i <= second; i++) {
            while (nums[i] == 2 && i < second) swap(nums, i, second--);
            while (nums[i] == 0 && i > zero) swap(nums, i, zero++);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
