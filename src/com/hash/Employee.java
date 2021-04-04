package com.hash;

/**
 * @author lizhangyu
 * @date 2021/3/6 12:23
 */
public class Employee {

    public int id;
    public String name;
    public Employee next;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
