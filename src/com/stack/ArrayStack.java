package com.stack;

/**
 * @author lizhangyu
 * @date 2021/3/9 19:52
 */
public class ArrayStack {

    private int top;
    private int size;
    private int[] stack;

    public ArrayStack(int size) {
        this.top = -1;
        this.size = size;
        stack = new int[size];
    }

    /**
     * 栈是否满了
     * @return
     */
    public boolean isFull() {
        return top == size - 1;
    }

    /**
     * 栈是否为空
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 进栈
     * @param n
     */
    public void push(int n) {
        if (isFull()) {
            System.out.println("栈已经满了");
            return;
        }
        top++;
        stack[top] = n;
    }

    /**
     * 出栈
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空，没有数据~");
        }

        int val = stack[top];
        top--;
        return val;
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("栈空，没有数据~");
        }
        return stack[top];
    }

    /**
     * 栈的遍历
     */
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空，没有数据~");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
