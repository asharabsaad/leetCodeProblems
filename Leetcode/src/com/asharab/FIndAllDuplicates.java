package com.asharab;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FIndAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {3,3,2,1,5,2,5,6,4};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while(i< nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i , correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0 ; index< nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }


    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
