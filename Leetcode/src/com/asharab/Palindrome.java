package com.asharab;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
        int a = x;
        int ans = 0 ;
        while(x>0){
            int rem = x%10;
            x = x / 10;
            ans = ans * 10 + rem;
        }
        return (ans==a);
    }
}
