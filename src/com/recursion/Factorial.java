package com.recursion;

/**
 * @author lizhangyu
 * @date 2021/3/10 20:08
 */
public class Factorial {

    public static void main(String[] args) {
        int res = fac(5);
        System.out.println(res);
        test(5);
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }else {
            return fac(n-1) * n;
        }
    }

    public static void test(int n) {
        if (n > 1) {
            test(n-1);
        }
        System.out.println(n);
    }
}
