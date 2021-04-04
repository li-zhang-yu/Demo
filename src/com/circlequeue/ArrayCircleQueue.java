package com.circlequeue;

/**
 * @author lizhangyu
 * @date 2021/3/8 19:54
 */
public class ArrayCircleQueue {

    private int size;

    private int first;

    private int rear;

    private int[] arr;

    public ArrayCircleQueue(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    /**
     * 判断队列是否已经满了
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % size == first;
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
        arr[rear] = n;
        rear = (rear + 1) % size;
    }

    /**
     * 获取队列首个数据并出队列
     * @return
     */
    public int getQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        int value = arr[first];
        first = (first + 1) % size;
        return value;
    }

    /**
     * 获取队列首个数据但是不出队列
     * @return
     */
    public int headQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
        }
        return arr[first];
    }

    /**
     * 显示队列数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = first; i < first + size(); i++) {
            System.out.println("队列第" + (i + 1) + "个数据为：" + arr[i]);
        }
    }

    /**
     * 队列中的有效数据
     * @return
     */
    public int size() {
        return (rear - first) % size;
    }
}
