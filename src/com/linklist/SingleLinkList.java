package com.linklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 16:30
 */
public class SingleLinkList {

    HeroNode head = new HeroNode(0, "");

    /**
     * 遍历
     */
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }

        HeroNode cur = head.next;

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
    public void add(HeroNode node) {
        HeroNode cur = head;
        while (true) {
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }
        cur.next = node;
    }

    /**
     * 查找
     * @param no
     */
    public HeroNode find(int no) {
        HeroNode cur = head.next;
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
    public void update(HeroNode node) {
        HeroNode oldNode = find(node.no);
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
    public void delete(HeroNode node) {
        HeroNode cur = head;
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
            System.out.println("成功删除节点");
        }else {
            System.out.println("没有找到对应的节点");
        }
    }

}
