package tech.tongyu.bct.problem26;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        int index = 0;
        if(nums.length == 0)
            return length;
        while(++index < nums.length){
            if(nums[length] < nums[index]){
                length++;
                nums[length] = nums[index];
            }
        }

        return length+1;
    }

    // debug
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4};
        int length = new Solution().removeDuplicates(nums);
        int[] result = Arrays.copyOf(nums, length);
        System.out.println(length);
        System.out.println(Arrays.toString(result));
    }
}
