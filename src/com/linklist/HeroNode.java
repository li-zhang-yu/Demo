package com.linklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 16:28
 */
public class HeroNode {

    public int no;
    public String name;

    public HeroNode next;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
