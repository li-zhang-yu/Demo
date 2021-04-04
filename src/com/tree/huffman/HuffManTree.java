package com.tree.huffman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lizhangyu
 * @date 2021/3/13 16:00
 */
public class HuffManTree {

    public static void main(String[] args) {

        int[] arr = {7,8,4,6,5,9};
        Node root = createHuffManTree(arr);

        preOrder(root);
    }

    /**
     * 前序遍历
     * @param root
     */
    private static void preOrder(Node root) {
        if (root != null) {
            root.preOrder();
        }else {
            System.out.println("是空树，不能遍历");
        }
    }

    /**
     * 创建赫夫曼树
     * @param arr
     * @return
     */
    public static Node createHuffManTree(int[] arr) {
        //为了便于操作，将int[]转为List类型
        List<Node> nodes = new ArrayList<>();
        for (int val : arr) {
            nodes.add(new Node(val));
        }

        while (nodes.size() > 1) {
            //从小到大进行排序
            Collections.sort(nodes);

            //取出权值最小的节点（二叉树）
            Node leftNode = nodes.get(0);
            //取出权值第二小的节点
            Node rightNode = nodes.get(1);

            //构建一个新的二叉树（二叉树）
            Node parent = new Node(leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;

            //将处理过的二叉树剔除掉
            nodes.remove(leftNode);
            nodes.remove(rightNode);

            //将parent加入到nodes
            nodes.add(parent);
        }

        return nodes.get(0);
    }
}
