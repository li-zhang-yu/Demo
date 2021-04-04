package com.circlelinklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 22:18
 */
public class CircleSingleLinkListDemo {

    public static void main(String[] args) {
        CircleSingleLinkList circleSingleLinkList = new CircleSingleLinkList();
        circleSingleLinkList.add(8);
        circleSingleLinkList.list();
        circleSingleLinkList.outList(2, 3, 8);
    }
}
