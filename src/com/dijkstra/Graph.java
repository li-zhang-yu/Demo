package com.dijkstra;

import java.util.Arrays;

/**
 * @author lizhangyu
 * @date 2021/4/3 23:14
 */
public class Graph {

    /**
     * 顶点数组
     */
    private char[] vertex;

    /**
     * 邻接矩阵
     */
    private int[][] matrix;

    /**
     * 已经访问的顶点的集合
     */
    private VisitedVertex vv;

    /**
     * 构造器
     * @param vertex
     * @param matrix
     */
    public Graph(char[] vertex, int[][] matrix) {
        this.vertex = vertex;
        this.matrix = matrix;
    }

    /**
     * 显示结果
     */
    public void showDijkstra() {
        vv.show();
    }

    /**
     * 显示图
     */
    public void showGraph() {
        for (int[] link : matrix) {
            System.out.println(Arrays.toString(link));
        }
    }

    /**
     * 更新 index 下标顶点到周围顶点的距离和周围顶点的前驱顶点,
     * @param index
     */
    private void update(int index) {
        int len = 0;
        //根据遍历我们的邻接矩阵的 matrix[index]行
        for (int j = 0; j < matrix[index].length; j++) {
            // len 含义是 : 出发顶点到 index 顶点的距离 + 从 index 顶点到 j 顶点的距离的和
            len = vv.getDis(index) + matrix[index][j];

            // 如果 j 顶点没有被访问过，并且 len 小于出发顶点到 j 顶点的距离，就需要更新
            if (!vv.in(j) && len < vv.getDis(j)) {
                //更新 j 顶点的前驱为 index 顶点
                vv.updatePre(j, index);
                //更新出发顶点到 j 顶点的距离
                vv.updateDis(j, len);
            }
        }
    }

    /**
     * 迪杰斯特拉算法实现
     * @param index 表示出发顶点对应的下标
     */
    public void dsj(int index) {
        vv = new VisitedVertex(vertex.length, index);
        //更新 index 顶点到周围顶点的距离和前驱顶点
        update(index);

        for (int j = 1; j < vertex.length; j++) {
            // 选择并返回新的访问顶点
            index = vv.updateArr();
            // 更新 index 顶点到周围顶点的距离和前驱顶点
            update(index);
        }
    }
}
