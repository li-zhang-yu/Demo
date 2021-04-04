package com.linklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 16:43
 */
public class SingleLinkListDemo {
    public static void main(String[] args) {
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江");
        HeroNode hero2 = new HeroNode(2, "卢俊义");
        HeroNode hero3 = new HeroNode(3, "吴用");
        HeroNode hero4 = new HeroNode(4, "林冲");
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.add(hero1);
        singleLinkList.add(hero2);
        singleLinkList.add(hero3);
        singleLinkList.add(hero4);
        singleLinkList.list();
        singleLinkList.find(1);
        singleLinkList.find(5);
        HeroNode hero5 = new HeroNode(4, "林冲1");
        singleLinkList.update(hero5);
        singleLinkList.list();
        singleLinkList.delete(hero2);
        singleLinkList.list();
    }
}
