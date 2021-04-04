package com.tree.binarysort;

/**
 * @author lizhangyu
 * @date 2021/3/15 20:15
 */
public class BinarySortTreeDemo {

    public static void main(String[] args) {
        int[] arr = {7, 9, 8, 6, 1, 2, 4};
        BinarySortTree binarySortTree = new BinarySortTree();
        for (int i = 0; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            binarySortTree.add(node);
        }

        System.out.println("输出的中序遍历为：");
        binarySortTree.midOrder();
        System.out.println("输出根节点" + binarySortTree.getRoot());
        binarySortTree.deleteNode(7);
        System.out.println("删除之后的输出结果");
        binarySortTree.midOrder();
        System.out.println("输出根节点" + binarySortTree.getRoot());
    }
}
