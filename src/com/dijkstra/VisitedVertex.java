package com.dijkstra;

import java.util.Arrays;

/**
 * @author lizhangyu
 * @date 2021/4/3 23:17
 */
public class VisitedVertex {

    /**
     * 记录各个顶点是否访问过，1表示访问过，0未访问，会动态更新
     */
    private int[] already_arr;

    /**
     * 每个下标对应的值为前一个顶点下标，会动态更新
     */
    private int[] pre_visited;

    /**
     * 记录出发顶点到其他所有顶点的距离,比如 G 为出发顶点，就会记录 G 到其它顶点的距离，会动态更新，求 的最短距离就会存放到 dis
     */
    private int[] dis;

    /**
     * 构造器
     * @param length 表示顶点的个数
     * @param index 出发顶点对应的下标, 比如 G 顶点，下标就是 6
     */
    public VisitedVertex(int length, int index) {
        this.already_arr = new int[length];
        this.pre_visited = new int[length];
        this.dis = new int[length];
        Arrays.fill(dis, 65535);

        //设置出发顶点被访问过
        this.already_arr[index] = 1;
        //设置出发顶点的访问距离为0
        this.dis[index] = 0;
    }

    /**
     * 功能：判断index顶点是否被访问过
     * @param index
     * @return 如果访问过，就返回 true, 否则访问 false
     */
    public boolean in(int index) {
        return already_arr[index] == 1;
    }

    /**
     * 功能: 更新出发顶点到 index 顶点的距离
     * @param index
     * @param len
     */
    public void updateDis(int index, int len) {
        dis[index] = len;
    }

    /**
     * 功能: 更新 pre 这个顶点的前驱顶点为 index 顶点
     * @param pre
     * @param index
     */
    public void updatePre(int pre, int index) {
        pre_visited[pre] = index;
    }

    /**
     * 功能:返回出发顶点到 index 顶点的距离
     * @param index
     * @return
     */
    public int getDis(int index) {
        return dis[index];
    }

    /**
     * 继续选择并返回新的访问顶点， 比如这里的 G 完后，就是 A 点作为新的访问顶点(注意不是出发顶点)
     * @return
     */
    public int updateArr() {
        int min = 65535, index = 0;
        for (int i = 0; i < already_arr.length; i++) {
            if (already_arr[i] == 0 && dis[i] < min) {
                min = dis[i];
                index = i;
            }
        }

        //更新 index 顶点被访问过
        already_arr[index] = 1;
        return index;
     }

    /**
     * 显示最后的结果
     * 即将三个数组的情况输出
     */
    public void show() {
        System.out.println("==========================");

        //输出already_arr
        for (int i : already_arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        //输出pre_visited
        for (int i : pre_visited) {
            System.out.print(i + " ");
        }

        System.out.println();

        //输出dis
        for (int i : dis) {
            System.out.print(i + " ");
        }

        System.out.println();

        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int count = 0;
        for (int i : dis) {
            if (i != 65535) {
                System.out.print(vertex[count] + "("+i+") ");
            }else {
                System.out.println("N");
            }

            count++;
        }

        System.out.println();
    }


}
