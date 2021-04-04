package com.prim;

/**
 * @author lizhangyu
 * @date 2021/3/30 20:10
 */
public class PrimAlgorithm {

    public static void main(String[] args) {
        //测试看看图是否创建OK
        char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        //节点的数量
        int verxs = data.length;

        //邻接矩阵的关系使用二维数组表示,10000 这个大数，表示两个点不联通
        int[][] weight = new int[][] {
                {10000, 5, 7, 10000, 10000, 10000, 2},
                {5, 10000, 10000, 9, 10000, 10000, 3},
                {7, 10000, 10000, 10000, 8, 10000, 10000},
                {10000, 9, 10000, 10000, 10000, 4, 10000},
                {10000, 10000, 8, 10000, 10000, 5, 4},
                {10000, 10000, 10000, 4, 5, 10000, 6},
                {2, 3, 10000, 10000, 4, 6, 10000}
        };

        //创建MGraph对象
        MGraph graph = new MGraph(verxs);

        //创建一个MinTree对象
        MinTree minTree = new MinTree();

        minTree.create(graph, verxs, data, weight);

        //输出
        minTree.showGraph(graph);

        //测试普利姆算法
        minTree.prim(graph, 0);

    }
}
