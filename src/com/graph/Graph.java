package com.graph;

import java.util.ArrayList;

/**
 * @author lizhangyu
 * @date 2021/3/16 22:21
 */
public class Graph {

    /**
     * 存储顶点集合
     */
    private ArrayList<String> vertexList;

    /**
     * 存储图对应的邻结矩阵
     */
    private int[][] edges;

    /**
     * 表示边的数目
     */
    private int numOfEdges;

    /**
     * 定义给数组boolean[]，记录某个节点是否被访问
     */
    private boolean[] isVisited;

    public static void main(String[] args) {

    }

    public Graph(int n) {
        this.vertexList = new ArrayList<>(n);
        this.edges = new int[n][n];
        this.numOfEdges = 0;
    }

    /**
     * 添加顶点
     * @param vertex
     */
    public void addVertex(String vertex) {
        vertexList.add(vertex);
    }

    /**
     * 添加边
     * @param v1 表示点的下标即是第几个顶点 "A"-"B" "A"->0 "B"->1
     * @param v2 第二个顶点对应的下标
     * @param weight
     */
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    /**
     * 返回v1和v2的权值
     * @param v1
     * @param v2
     * @return
     */
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    /**
     * 得到边的个数
     * @return
     */
    public int getNumOfEdges() {
        return numOfEdges;
    }

}
