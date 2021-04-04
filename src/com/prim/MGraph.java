package com.prim;

/**
 * @author lizhangyu
 * @date 2021/3/30 20:06
 */
public class MGraph {

    /**
     * 表示图的节点个数
     */
    int verxs;

    /**
     * 存放节点数据
     */
    char[] data;

    /**
     * 存放边，就是我们的邻接矩阵
     */
    int[][] weight;

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }

}
