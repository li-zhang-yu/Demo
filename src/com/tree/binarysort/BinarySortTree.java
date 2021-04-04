package com.tree.binarysort;

/**
 * @author lizhangyu
 * @date 2021/3/15 20:07
 */
public class BinarySortTree {

    private Node root;

    public BinarySortTree() {
    }

    public Node getRoot() {
        return root;
    }

    /**
     * 添加节点
     * @param node
     */
    public void add(Node node) {
        if (root == null) {
            root = node;
        }else {
            root.add(node);
        }
    }

    /**
     * 中序遍历
     */
    public void midOrder() {
        if (root != null) {
            root.midOrder();
        }else {
            System.out.println("树为空，不能遍历");
        }
    }

    /**
     * @param node 传入的结点(当做二叉排序树的根结点)
     * @return 返回的 以 node 为根结点的二叉排序树的最小结点的值
     */
    public int deleteRightTreeMin(Node node) {
        Node target = node;

        while (target.left != null) {
            target = target.left;
        }

        deleteNode(target.value);
        return target.value;
    }

    /**
     * 查找当前节点
     * @param value
     * @return
     */
    public Node search(int value) {
        if (root != null) {
            return root.search(value);
        }else {
            return null;
        }
    }

    /**
     * 查找当前节点的父节点
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if (root != null) {
            return root.searchParent(value);
        }else {
            return null;
        }
    }

    /**
     * @param value
     */
    public void deleteNode(int value) {
        if (root == null) {
            return;
        }else {
            Node targetNode = search(value);
            //如果当前节点没有找到
            if (targetNode == null) {
                return;
            }

            //如果我们发现二叉树只有一个节点
            if (root.left == null && root.right == null) {
                root = null;
                return;
            }

            //找打当前节点的父节点
            Node parent = searchParent(value);

            //如果要删除的节点为叶子节点
            if (targetNode.left == null && targetNode.right == null) {
                if (parent.left != null && parent.left.value == value) {
                    parent.left = null;
                }else if (parent.right != null && parent.right.value == value) {
                    parent.right = null;
                }
            }else if (targetNode.left != null && targetNode.right != null) { //如果要删除的节点存在左右节点
                int minVal = deleteRightTreeMin(targetNode.right);
                targetNode.value = minVal;
            }else {
                //如果目标节点存在左节点
                if (targetNode.left != null) {
                    if (parent != null) {
                        if (parent.left.value == value) {
                            parent.left = targetNode.left;
                        }else if (parent.right.value == value) {
                            parent.right = targetNode.left;
                        }else {
                            root = targetNode.left;
                        }
                    }
                }else { //如果目标节点存在右节点
                    if (parent != null) {
                        if (parent.left.value == value) {
                            parent.left = targetNode.right;
                        }else if (parent.right.value == value) {
                            parent.right = targetNode.right;
                        }else {
                            root = targetNode.right;
                        }
                    }
                }
            }
        }
    }

}
