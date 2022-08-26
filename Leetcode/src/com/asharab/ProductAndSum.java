package com.asharab;

public class ProductAndSum {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int ans = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            n = n/10;
            product = product*rem;
            ans = ans + rem;

        }
        return product-ans;
    }
}
