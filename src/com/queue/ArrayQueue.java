package com.queue;

/**
 * @author lizhangyu
 * @date 2021/3/8 19:54
 */
public class ArrayQueue {

    private int size;

    private int first;

    private int rear;

    private int[] arr;

    public ArrayQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.first = -1;
        this.rear = -1;
    }

    /**
     * 判断队列是否已经满了
     * @return
     */
    public boolean isFull() {
        return rear == size - 1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty() {
        return rear == first;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列已经满了，不能加入数据了");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    /**
     * 获取队列首个数据并出队列
     * @return
     */
    public int getQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        first++;
        return arr[first];
    }

    /**
     * 获取队列首个数据但是不出队列
     * @return
     */
    public int headQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        return arr[first+1];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("队列第" + (i + 1) + "个数据为：" + arr[i]);
        }
    }
}
