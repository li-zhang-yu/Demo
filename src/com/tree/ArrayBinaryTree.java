package com.tree;

/**
 * @author lizhangyu
 * @date 2021/3/11 22:19
 */
public class ArrayBinaryTree {

    private int[] arr;

    public ArrayBinaryTree(int[] arr) {
        this.arr = arr;
    }

    /**
     * 前序遍历顺序存储二叉树
     * @param index
     */
    public void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.print("数组为空，不能按照二叉树的前序遍历");
            return;
        }

        System.out.print(arr[index] + "\t");

        if ((index * 2 + 1) < arr.length) {
            preOrder(index * 2 + 1);
        }

        if (((index * 2 + 2) < arr.length)) {
            preOrder(index * 2 + 2);
        }
    }

    /**
     * 中序遍历顺序存储二叉树
     * @param index
     */
    public void midOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.print("数组为空，不能按照二叉树的前序遍历");
            return;
        }

        if ((index * 2 + 1) < arr.length) {
            midOrder(index * 2 + 1);
        }

        System.out.print(arr[index] + "\t");

        if (((index * 2 + 2) < arr.length)) {
            midOrder(index * 2 + 2);
        }
    }

    /**
     * 后序遍历顺序存储二叉树
     * @param index
     */
    public void postOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.print("数组为空，不能按照二叉树的前序遍历");
            return;
        }

        if ((index * 2 + 1) < arr.length) {
            postOrder(index * 2 + 1);
        }

        if (((index * 2 + 2) < arr.length)) {
            postOrder(index * 2 + 2);
        }

        System.out.print(arr[index] + "\t");
    }
}
