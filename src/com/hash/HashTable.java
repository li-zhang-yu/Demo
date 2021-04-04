package com.hash;

/**
 * @author lizhangyu
 * @date 2021/3/6 12:06
 */
public class HashTable {

    private int size;
    private EmpLinkedList[] empLinkedListArray;

    public HashTable(int size) {
        this.size = size;
        this.empLinkedListArray = new EmpLinkedList[size];
        //初始化链表
        for (int i = 0; i < size ; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    /**
     * 查找
     * @param id
     */
    public void find(int id) {
        int empLinkedListNO = hashFun(id);
        Employee employee = empLinkedListArray[empLinkedListNO].find(id);
        if (employee != null) {
            System.out.printf("在第%d条链表中找到雇员id = %d\n", (empLinkedListNO + 1), id);
        }else {
            System.out.println("在哈希表中中找到雇员");
        }
    }

    /**
     * 遍历
     */
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }

    /**
     * 添加
     * @param employee
     */
    public void add(Employee employee) {
        int employeeNo = hashFun(employee.id);
        empLinkedListArray[employeeNo].add(employee);
    }

    /**
     * 取模运算
     * @param id
     * @return
     */
    public int hashFun(int id) {
        return id % size;
    }
}
