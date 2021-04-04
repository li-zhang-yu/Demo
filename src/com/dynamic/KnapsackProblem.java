package com.dynamic;

/**
 * @author lizhangyu
 * @date 2021/3/27 23:16
 */
public class KnapsackProblem {

    public static void main(String[] args) {

        //物品的重量
        int[] w = {1, 4, 3};
        //物品的价值
        int[] val = {1500, 3000, 2000};
        //背包的容量
        int m = 4;
        //物品的个数
        int n = val.length;

        //创建二维数组，v[i][j]表示在前i个物品中能够装入容量为j的背包的最大价值
        int[][] v = new int[n+1][m+1];

        //为了记录放入商品的情况，我们定一个二维数组
        int[][] path = new int[n+1][m+1];

        for (int i = 0; i < v.length; i++) {
            //将第一列设置为0
            v[i][0] = 0;
        }

        for (int j = 0; j < v[0].length; j++) {
            //将第一行设置为0
            v[0][j] = 0;
        }

        //不处理第一行
        for (int i = 1; i < v.length; i++) {
            //不处理第一列
            for (int j = 1; j < v[0].length; j++) {
                if (w[i-1] > j) {
                    v[i][j] = v[i-1][j];
                }else {
//                    v[i][j] = Math.max(v[i-1][j], val[i-1] + v[i-1][j-w[i-1]]);

                    if (v[i-1][j] < val[i-1] + v[i-1][j-w[i-1]]) {
                        v[i][j] = val[i-1] + v[i-1][j-w[i-1]];
                        //把当前的情况记录到path
                        path[i][j] = 1;
                    }else {
                        v[i][j] = v[i-1][j];
                    }
                }
            }
        }

        //输出下v看看目前的情况
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                if (path[i][j] == 1) {
                    System.out.printf("第%d 个商品放入到背包\n", i);
                }
            }
        }

        System.out.println("装入背包最大价值的物品：=>");
        //行的最大下标
        int i = path.length - 1;
        //列的最大下标
        int j = path[0].length - 1;
        while (i > 0 && j > 0) {
            if (path[i][j] == 1) {
                System.out.printf("第%d 个商品放入到背包\n", i);
                j-=w[i-1];
            }
            i--;
        }
    }
}
