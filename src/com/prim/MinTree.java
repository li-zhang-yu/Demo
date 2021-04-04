package com.prim;

import java.util.Arrays;

/**
 * @author lizhangyu
 * @date 2021/3/30 20:07
 */
public class MinTree {

    /**
     * 创建图的邻接矩阵
     * @param graph 图对象
     * @param verxs 图对应的顶点个数
     * @param data 图的各个顶点的值
     * @param weight 图的邻接矩阵
     */
    public void create(MGraph graph, int verxs, char data[], int[][] weight) {
        for (int i = 0; i < verxs; i++) {
            graph.data[i] = data[i];
            for (int j = 0; j < verxs; j++) {
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    /**
     * 显示图的邻接矩阵
     * @param graph
     */
    public void showGraph(MGraph graph) {
        for (int[] link : graph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }

    /**
     * prim 算法，得到最小生成树
     * @param graph 图
     * @param v 表示从图的第几个顶点开始生成
     */
    public void prim(MGraph graph, int v) {
        //visited[] 标记结点(顶点)是否被访问过
        int[] visited = new int[graph.verxs];

        //把当前这个节点标记为已访问
        visited[v] = 1;

        //h1和h2记录两个顶点的下标
        int h1 = -1;
        int h2 = -1;

        //将minWeight初始化为一个大数，后面在遍历过程中，会被替换i
        int minWeight = 10000;

        //因为有graph.verxs顶点，普利姆算法结束后，有graph.verxs-1边
        for (int k = 1; k < graph.verxs; k++) {

            //这个是确定每一次生成的子图，和那个节点的距离最近
            // i 结点表示被访问过的结点
            for (int i = 0; i < graph.verxs; i++) {
                //j 结点表示还没有访问过的结点
                for (int j = 0; j < graph.verxs; j++) {
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        minWeight = graph.weight[i][j];
                        h1 = i;
                        h2 = j;
                    }
                }
            }

            //找到一条边是最小
            System.out.println("边<" + graph.data[h1] + "," + graph.data[h2] + "> 权值:" + minWeight);
            //将当前这个结点标记为已经访问
            visited[h2] = 1;
            //minWeight 重新设置为最大值 10000
            minWeight = 10000;
        }

    }

}
