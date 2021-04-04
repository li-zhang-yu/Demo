package com.tree.huffman;

/**
 * @author lizhangyu
 * @date 2021/3/13 15:47
 */
public class Node implements Comparable<Node>{

    /**
     * 节点的权值
     */
    public int value;
    /**
     * 左子节点
     */
    public Node left;
    /**
     * 右子节点
     */
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}
