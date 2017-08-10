package leet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jafu on 8/10/17.
 */
/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

/*
我自己的方法是借用了Set,但是这样的复杂度就在O(nlogn)了
最佳答案是使用异或，下面是异或的性质：
交换律：A XOR B = B XOR A
结合律：A XOR (B XOR C) = (A XOR B) XOR C
恒等律： A XOR 0 = A
归零律： A XOR A = 0
自反： A XOR B XOR B = A XOR 0 = A

借由以上的性质，可以把所有的数组元素异或一遍，
因为有交换律和结合律，我们可以理解为先把相同的交换到一起，进行异或，结果得到一组0
再根据归零率，这些0 再一起异或，最终的结果肯定是零（不管有奇数个还是偶数个0）
最后根据恒等率，0和剩下的那个单数异或，就得到了单数
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        for (Integer i : set) {
            return i;
        }
        return 0;
    }

    //最佳算法
    private int singleNumber2(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }

}
