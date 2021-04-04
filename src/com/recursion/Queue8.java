package com.recursion;

/**
 * @author lizhangyu
 * @date 2021/3/10 22:42
 */
public class Queue8 {

    private int max = 8;
    private int[] arr = new int[max];
    private static int judgeCount = 0;
    private static int count = 0;

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.printf("一共有%d 解法\n", count);
        System.out.printf("一共判断冲突的次数%d 次", judgeCount);
    }

    public void check(int n) {
        //结束的条件
        if (n == 8) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            //先把当前这个皇后n，放到该行的第一列
            arr[n] = i;
            if (judge(n)) {
                check(n+1);
            }
        }

    }

    public boolean judge(int n) {
        judgeCount++;
        for (int i = 0; i < n; i++) {
            //判断是否在同一列或者同一斜线上
            if (arr[i] == arr[n] || Math.abs(i-n) == Math.abs(arr[i]-arr[n])) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        count++;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
