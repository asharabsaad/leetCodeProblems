package com.asharab;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        int sum =0;
        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i] ;
            nums[i] = sum;
        }
        return nums;
    }
}
