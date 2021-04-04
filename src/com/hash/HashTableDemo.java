package com.hash;

import java.util.Scanner;

/**
 * @author lizhangyu
 * @date 2021/3/6 12:45
 */
public class HashTableDemo {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(7);
        String key = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("add: 添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("find: 查找雇员");
            System.out.println("exit: 退出系统");
            key = scanner.next();
            switch (key) {
                case "add" :
                    System.out.println("请输入员工id");
                    int id = scanner.nextInt();
                    System.out.println("请输入员工名字");
                    String name = scanner.next();
                    Employee employee = new Employee(id, name);
                    hashTable.add(employee);
                    break;
                case "find" :
                    System.out.println("请输入员工id");
                    id = scanner.nextInt();
                    hashTable.find(id);
                    break;
                case "list" :
                    hashTable.list();
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
