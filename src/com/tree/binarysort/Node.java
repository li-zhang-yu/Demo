package com.tree.binarysort;

/**
 * @author lizhangyu
 * @date 2021/3/15 19:55
 */
public class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    /**
     * 中序遍历
     */
    public void midOrder() {
        if (this.left != null) {
            this.left.midOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.midOrder();
        }
    }

    /**
     * 添加节点
     * @param node
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }

        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            }else {
                this.left.add(node);
            }
        }else {
            if (this.right == null) {
                this.right = node;
            }else {
                this.right.add(node);
            }
        }

    }

    /**
     * 搜索当前节点
     * @param value
     * @return
     */
    public Node search(int value) {
        if (value == this.value) {
            return this;
        }else if (value < this.value) {
            if (this.left == null) {
                return null;
            }
            return this.left.search(value);
        }else {
            if (this.right == null) {
                return null;
            }
            return this.right.search(value);
        }
    }

    /**
     * 搜索当前节点的父节点
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
            return this;
        }else {
            if (this.left != null && value < this.value) {
                return this.left.searchParent(value);
            }else if (this.right != null && value >= this.value) {
                return this.right.searchParent(value);
            }else {
                return null;
            }
        }
    }

}
