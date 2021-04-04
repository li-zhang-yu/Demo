package com.hash;

/**
 * @author lizhangyu
 * @date 2021/3/6 12:26
 */
public class EmpLinkedList {

    private Employee head;

    /**
     * 添加
     * @param employee
     */
    public void add(Employee employee) {
        if (head == null) {
            head = employee;
            return;
        }

        Employee cur = head;

        while (true) {
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }

        cur.next = employee;
    }

    /**
     * 遍历链表
     * @param no
     */
    public void list(int no) {
        if (head == null) {
            System.out.println("第" + (no + 1) + "条链表为空" );
            return;
        }
        System.out.print("第" + (no + 1) + "条链表信息为");
        Employee cur = head;
        while(true) {
            System.out.printf("=> id=%d name=%s\t",cur.id, cur.name);
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 查找
     * @param id
     * @return
     */
    public Employee find(int id) {
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }

        Employee cur = head;

        while (true) {
            if (cur.id == id) {
                break;
            }

            if (cur.next == null) {
                cur = null;
                break;
            }

            cur = cur.next;
        }

        return cur;
    }

}
