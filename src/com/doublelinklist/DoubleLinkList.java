package com.doublelinklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 16:30
 */
public class DoubleLinkList {

    DoubleHeroNode head = new DoubleHeroNode(0, "");

    /**
     * 遍历
     */
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }

        DoubleHeroNode cur = head.next;

        while (true) {
            System.out.println(cur);
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }

    }

    /**
     * 添加
     * @param node
     */
    public void add(DoubleHeroNode node) {
        DoubleHeroNode cur = head;
        while (true) {
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }
        cur.next = node;
        node.pre = cur;
    }

    /**
     * 查找
     * @param no
     */
    public DoubleHeroNode find(int no) {
        DoubleHeroNode cur = head.next;
        if (cur == null) {
            System.out.println("链表为空");
            return null;
        }

        while (true) {
            if (cur.no == no) {
                System.out.println("找到对应的节点:" + cur);
                return cur;
            }

            if (cur.next == null) {
                System.out.println("没有找到对应的节点");
                break;
            }

            cur = cur.next;
        }

        return null;
    }

    /**
     * 修改
     * @param node
     */
    public void update(DoubleHeroNode node) {
        DoubleHeroNode oldNode = find(node.no);
        if (oldNode != null) {
            oldNode.name = node.name;
        }else {
            System.out.println("由于没有找到对应的节点，所以不能修改");
        }
    }

    /**
     * 删除
     * @param node
     */
    public void delete(DoubleHeroNode node) {
        DoubleHeroNode cur = head;
        Boolean flag = false;
        while (true) {
            if (cur.next == null) {
                System.out.println("链表为空");
                break;
            }

            if (cur.next.no == node.no) {
                flag = true;
                break;
            }

            cur = cur.next;
        }

        if (flag) {
            cur.next = cur.next.next;
            //避免是最后一个节点，从而出现空指针异常
            if (cur.next.next != null) {
                cur.next.next.pre = cur.next.pre;
            }
            System.out.println("成功删除节点");
        }else {
            System.out.println("没有找到对应的节点");
        }
    }

}
