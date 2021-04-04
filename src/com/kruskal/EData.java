package com.kruskal;

/**
 * @author lizhangyu
 * @date 2021/3/30 21:21
 */
public class EData {

    /**
     * 边的一个点
     */
    char start;

    /**
     * 边的另外一个点
     */
    char end;

    /**
     * 边的权值
     */
    int weight;

    /**
     * 构造器
     */
    public EData(char start, char end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    /**
     * 重写 toString, 便于输出边信息
     * @return
     */
    @Override
    public String toString() {
        return "EData [<" + start + ", " + end + ">= " + weight + "]";
    }
}
