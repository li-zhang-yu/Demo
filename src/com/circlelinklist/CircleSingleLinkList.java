package com.circlelinklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 22:17
 */
public class CircleSingleLinkList {

    private Boy first = null;

    /**
     * 添加构建成环
     * @param num
     */
    public void add(int num) {

        if (num < 1) {
            System.out.println("输入的数据不对");
            return;
        }

        Boy curBoy = null;
        for (int i = 1; i <= num; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);
                curBoy = boy;
            }else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    /**
     * 遍历
     */
    public void list() {
        if (first == null) {
            System.out.println("没有任何小孩");
            return;
        }

        Boy curBoy = first;

        while (true) {
            System.out.println("当前的小孩为：" + curBoy.getNo());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    /**
     * 小孩出圈
     * @param startNo
     * @param countNum
     * @param num
     */
    public void outList(int startNo, int countNum, int num) {
        if (first == null || startNo < 1 || startNo > num) {
            System.out.println("输入的参数有误");
        }

        Boy helpBoy = first;
        while (true) {
            if (helpBoy.getNext() == first) {
                break;
            }
            helpBoy = helpBoy.getNext();
        }

        for (int i = 0; i < startNo-1; i++) {
            first = first.getNext();
            helpBoy = helpBoy.getNext();
        }

        while (true) {

            if (first == helpBoy) {
                break;
            }

            for (int i = 0; i < countNum-1; i++) {
                first = first.getNext();
                helpBoy = helpBoy.getNext();
            }

            System.out.println("出圈的小孩为"+ first.getNo());

            first = first.getNext();
            helpBoy.setNext(first);

        }

        System.out.println("最后出圈的小孩为" + first.getNo());
    }
}
