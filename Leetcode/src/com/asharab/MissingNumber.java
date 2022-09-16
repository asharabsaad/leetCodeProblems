package com.asharab;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[ ] arr = {3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] ;
            if(nums[i]<nums.length && nums[i] !=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index<nums.length; index ++){

            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;

    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
