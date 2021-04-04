package com.doublelinklist;

/**
 * @author lizhangyu
 * @date 2021/3/6 16:43
 */
public class DoubleLinkListDemo {
    public static void main(String[] args) {
        //先创建节点
        DoubleHeroNode hero1 = new DoubleHeroNode(1, "宋江");
        DoubleHeroNode hero2 = new DoubleHeroNode(2, "卢俊义");
        DoubleHeroNode hero3 = new DoubleHeroNode(3, "吴用");
        DoubleHeroNode hero4 = new DoubleHeroNode(4, "林冲");
        DoubleLinkList singleLinkList = new DoubleLinkList();
        singleLinkList.add(hero1);
        singleLinkList.add(hero2);
        singleLinkList.add(hero3);
        singleLinkList.add(hero4);
        System.out.println("添加之后的链表为:");
        singleLinkList.list();
        System.out.println("查找编号为1的员工:");
        singleLinkList.find(1);
        singleLinkList.list();
        System.out.println("查找编号为5的员工:");
        singleLinkList.find(5);
        singleLinkList.list();
        DoubleHeroNode hero5 = new DoubleHeroNode(4, "林冲1");
        System.out.println("修改员工信息:");
        singleLinkList.update(hero5);
        singleLinkList.list();
        System.out.println("删除员工信息:");
        singleLinkList.delete(hero2);
        singleLinkList.list();
    }
}
