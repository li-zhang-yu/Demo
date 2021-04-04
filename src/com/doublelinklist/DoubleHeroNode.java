package com.doublelinklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 16:28
 */
public class DoubleHeroNode {

    public int no;
    public String name;

    public DoubleHeroNode next;
    public DoubleHeroNode pre;

    public DoubleHeroNode(int no, String name) {
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
