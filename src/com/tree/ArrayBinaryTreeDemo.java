package com.tree;

/**
 * @author lizhangyu
 * @date 2021/3/11 22:27
 */
public class ArrayBinaryTreeDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
        System.out.println("前序遍历结果为：");
        arrayBinaryTree.preOrder(0);
        System.out.println();
        System.out.println("中序遍历结果为：");
        arrayBinaryTree.midOrder(0);
        System.out.println();
        System.out.println("后序遍历结果为：");
        arrayBinaryTree.postOrder(0);
    }
}
