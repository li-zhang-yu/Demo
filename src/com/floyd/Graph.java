package com.floyd;

import java.util.Arrays;

/**
 * @author lizhangyu
 * @date 2021/4/4 19:45
 */
public class Graph {

    /**
     * 存放顶点的数组
     */
    private char[] vertex;

    /**
     * 保存，从各个顶点出发到其他顶点的距离，最后的结果，也是保留在该数组
     */
    private int[][] dis;

    /**
     * 保存到达目标顶点的前驱顶点
     */
    private int[][] pre;

    /**
     * 构造器
     * @param length 大小
     * @param matrix 邻接矩阵
     * @param vertex 顶点数组
     */
    public Graph(int length, int[][] matrix, char[] vertex) {
        this.vertex = vertex;
        this.dis = matrix;
        this.pre = new int[length][length];
        // 对 pre 数组初始化, 注意存放的是前驱顶点的下标
        for (int i = 0; i < length; i++) {
            Arrays.fill(pre[i], i);
        }
    }

    /**
     * 显示pre数组和dis数组
     */
    public void show() {

        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        for (int k = 0; k < dis.length; k++) {

            // 输出 pre 数组的一行
            for (int i = 0; i < dis.length; i++) {
                System.out.print(vertex[pre[k][i]] + "");
            }

            System.out.println();

            // 输出 dis 数组的一行
            for (int i = 0; i < dis.length; i++) {
                System.out.print("("+vertex[k]+"到"+vertex[i]+"的最短路径是" + dis[k][i] + ") ");
            }

            System.out.println();
            System.out.println();
        }
    }

    /**
     * 弗洛伊德算法
     */
    public void floyd() {
        //变量保存距离
        int len = 0;
        //对中间顶点遍历，K就是中间顶点的下标[A, B, C, D, E, F, G]
        for (int k = 0; k < dis.length; k++) {
            //从 i 顶点开始出发 [A, B, C, D, E, F, G]
            for (int i = 0; i < dis.length; i++) {
                //到达 j 顶点 // [A, B, C, D, E, F, G]
                for (int j = 0; j < dis.length; j++) {
                    // => 求出从 i 顶点出发，经过 k 中间顶点，到达 j 顶点距离
                    len = dis[i][k] + dis[k][j];
                    if (len < dis[i][j]) {
                        //更新距离
                        dis[i][j] = len;
                        //更新距离
                        pre[i][j] = pre[k][j];
                    }
                }
            }
        }
    }
}
