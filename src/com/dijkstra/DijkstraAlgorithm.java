package com.dijkstra;

/**
 * @author lizhangyu
 * @date 2021/4/3 23:13
 */
public class DijkstraAlgorithm {

    public static void main(String[] args) {
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        int[][] matrix = new int[vertex.length][vertex.length];

        //表示不可连接
        final int N = 65535;

        matrix[0] = new int[]{N, 5, 7, N, N, N, 2};
        matrix[1] = new int[]{5, N, N, 9, N, N, 3};
        matrix[2] = new int[]{7, N, N, N, 8, N, N};
        matrix[3] = new int[]{N, 9, N, N, N, 4, N};
        matrix[4] = new int[]{N, N, 8, N, N, 5, 4};
        matrix[5] = new int[]{N, N, N, 4, 5, N, 6};
        matrix[6] = new int[]{2, 3, N, N, 4, 6, N};
        //创建 Graph 对象
        Graph graph = new Graph(vertex, matrix);
        //测试, 看看图的邻接矩阵是否 ok
        graph.showGraph();

        //测试迪杰斯特拉算法，C为起点
        graph.dsj(2);
        graph.showDijkstra();
    }
}
