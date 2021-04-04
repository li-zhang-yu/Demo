package com.tree.avl;

import java.util.Random;

/**
 * @author lizhangyu
 * @date 2021/3/15 20:15
 */
public class AvlTreeDemo {

    public static void main(String[] args) {
        // 创建一个 AVLTree 对象 A
        AvlTree avlTree = new AvlTree();
        Random r = new Random(1);
        // 添加结点
        for(int i=0; i < 10; i++) {
            avlTree.add(new Node(r.nextInt(10000)));
        }
        System.out.println("中序遍历");
        avlTree.midOrder();
        System.out.println("在平衡处理~~");
        System.out.println("树的高度=" + avlTree.getRoot().height());
        System.out.println("树的左子树高度=" + avlTree.getRoot().leftHeight());
        System.out.println("树的右子树高度=" + avlTree.getRoot().rightHeight());
        System.out.println("当前的根结点=" + avlTree.getRoot());

        avlTree.deleteNode(avlTree.getRoot().value);
        System.out.println("删除当前节点后的中序遍历");
        avlTree.midOrder();
        System.out.println("在平衡处理~~");
        System.out.println("树的高度=" + avlTree.getRoot().height());
        System.out.println("树的左子树高度=" + avlTree.getRoot().leftHeight());
        System.out.println("树的右子树高度=" + avlTree.getRoot().rightHeight());
        System.out.println("当前的根结点=" + avlTree.getRoot());
    }
}
