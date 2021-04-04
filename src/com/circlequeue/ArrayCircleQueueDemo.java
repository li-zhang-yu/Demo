package com.circlequeue;

import java.util.Scanner;

/**
 * @author lizhangyu
 * @date 2021/3/8 20:09
 */
public class ArrayCircleQueueDemo {

    public static void main(String[] args) {
        ArrayCircleQueue arrayCircleQueue = new ArrayCircleQueue(3);
        String key = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("show: 显示队列");
            System.out.println("add: 添加数据到队列");
            System.out.println("get: 从队列中取出数据");
            System.out.println("find: 查看队列头的数据");
            System.out.println("exit: 退出系统");
            key = scanner.next();
            switch (key) {
                case "add" :
                    System.out.println("请输入一个数");
                    int n = scanner.nextInt();
                    arrayCircleQueue.addQueue(n);
                    break;
                case "find" :
                    int res = arrayCircleQueue.headQueue();
                    System.out.println("从队列中取出数据为：" + res);
                    break;
                case "get" :
                    res = arrayCircleQueue.getQueue();
                    System.out.println("从队列中取出数据为：" + res);
                    break;
                case "show" :
                    arrayCircleQueue.showQueue();
                    break;
                case "exit" :
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
