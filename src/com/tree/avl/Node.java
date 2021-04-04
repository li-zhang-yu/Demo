package com.tree.avl;

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

        //当右子树的高度-左子树的高度 > 1，则左旋
        if (rightHeight() - leftHeight() > 1) {
            if (right != null && right.leftHeight() > right.rightHeight()) {
                //右节点右旋
                right.rightRotate();
                //当前节点左旋
                leftRotate();
            }else {
                //当前节点左旋
                leftRotate();
            }
            return;
        }

        //当左子树的高度-右子树的高度 > 1，则左旋
        if (leftHeight() - rightHeight() > 1) {
            if (left != null && left.rightHeight() > left.leftHeight()) {
                //左节点左旋转
                left.leftRotate();
                //当前节点右旋转
                rightRotate();
            }else {
                //当前节点右旋转
                rightRotate();
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

    /**
     * 返回树的高度
     * @return
     */
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
    }

    /**
     * 返回右子树的高度
     * @return
     */
    public int rightHeight() {
        if (right == null) {
            return 0;
        }
        return right.height();
    }

    /**
     * 返回左子树的高度
     * @return
     */
    public int leftHeight() {
        if (left == null) {
            return 0;
        }
        return left.height();
    }

    /**
     * 左旋转方法
     */
    private void leftRotate() {
        //以当前根节点创建一个新的节点
        Node newNode = new Node(value);
        //将新的节点的左子树设置为当前节点的左子树
        newNode.left = left;
        //将新的节点的右子树设置为当前节点的右子树的左子树
        newNode.right = right.left;
        //把当前节点的值设置为右子节点的值
        value = right.value;
        //把当前节点的右子树设置为当前节点的右子树的右子树
        right = right.right;
        //当当前节点的左子树设置为新的节点
        left = newNode;
    }

    /**
     * 右旋方法
     */
    private void rightRotate() {
        //以当前根节点创建一个新的节点
        Node newNode = new Node(value);
        //将新的节点的右子树设置为当前节点的右子树
        newNode.right = right;
        //将新的节点的左子树设置为当前节点的左子树的右子树
        newNode.left = left.right;
        //把当前节点的值设置为左子节点的值
        value = left.value;
        //把当前节点的左子树设置为当前节点的左子树的左子树
        left = left.left;
        //当当前节点的右子树设置为新的节点
        right = newNode;
    }

}
