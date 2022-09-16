package com.asharab.No;

public class OfSteps {
    public static void main(String[] args) {
        int ans = steps(14);
        System.out.println(ans);
    }
//    static int numberOfSteps(int num) {
//        if(num == 0){
//            return 1;
//        }
//        if(num%2!=0){
//            num -= 1;
//        }
//        int ans = numberOfSteps(num/2);
//    }
    static int steps(int num){
        int steps =0;
        while (num>0){
            if(num%2!=0){
                num= num-1;
            }else{
                num=num/2;
            }
            steps++;
        }
        return steps;
    }
}
