package com.stack;

import java.util.Scanner;

/**
 * @author lizhangyu
 * @date 2021/3/9 20:06
 */
public class ArrayStackDemo {

        public static void main(String[] args) {
            ArrayStack arrayStack = new ArrayStack(4);
            String key = "";
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("show: 显示栈");
                System.out.println("push: 添加数据到栈");
                System.out.println("pop: 从栈中取出数据");
                System.out.println("peek: 查看栈头的数据");
                System.out.println("exit: 退出系统");
                key = scanner.next();
                switch (key) {
                    case "push" :
                        System.out.println("请输入一个数");
                        int n = scanner.nextInt();
                        arrayStack.push(n);
                        break;
                    case "peek" :
                        int res = arrayStack.peek();
                        System.out.println("从栈中取出数据为：" + res);
                        break;
                    case "pop" :
                        res = arrayStack.pop();
                        System.out.println("从栈中取出数据为：" + res);
                        break;
                    case "show" :
                        arrayStack.list();
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
