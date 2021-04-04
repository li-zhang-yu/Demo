package com.recursion;

/**
 * @author lizhangyu
 * @date 2021/3/10 20:54
 */
public class MiGong {

    public static void main(String[] args) {
        int[][] map = new int[8][7];

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        for (int j = 0; j < 7; j++) {
            map[0][j] = 1;
            map[7][j] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("初始化的地图map:");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

//        Boolean isTrue = setWay(map, 1, 1);
        Boolean isTrue = setWay2(map, 1, 1);
        System.out.println(isTrue);
        System.out.println("走过后的地图map:");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * 当map[i][j] = 0时，表示该点没有走过，当为1表示为墙，当为2表示通路可以走通，当为3表示该点已经走过，但是走不通
     * 走路策略 下-右-上-左
     * @param map
     * @param i
     * @param j
     * @return
     */
    public static boolean setWay(int[][] map, int i, int j) {
        //递归结束的条件
        if (map[6][5] == 2) {
            return true;
        }

        if (map[i][j] == 0) {
            //表示该点可以走通
            map[i][j] = 2;
            if (setWay(map, i+1, j)) {
                return true;
            }else if (setWay(map, i, j+1)) {
                return true;
            }else if (setWay(map, i-1, j)) {
                return true;
            }else if (setWay(map, i, j-1)) {
                return true;
            }else {
                //表示走不通了
                map[i][j] = 3;
                return false;
            }
        }else {
            return false;
        }

    }


    /**
     * 当map[i][j] = 0时，表示该点没有走过，当为1表示为墙，当为2表示通路可以走通，当为3表示该点已经走过，但是走不通
     * 走路策略 上-左-下-右
     * @param map
     * @param i
     * @param j
     * @return
     */
    public static boolean setWay2(int[][] map, int i, int j) {
        //递归结束的条件
        if (map[6][5] == 2) {
            return true;
        }

        if (map[i][j] == 0) {
            //表示该点可以走通
            map[i][j] = 2;
            if (setWay2(map, i-1, j)) {
                return true;
            }else if (setWay2(map, i, j-1)) {
                return true;
            }else if (setWay2(map, i+1, j)) {
                return true;
            }else if (setWay2(map, i, j+1)) {
                return true;
            }else {
                //表示走不通了
                map[i][j] = 3;
                return false;
            }
        }else {
            return false;
        }

    }
}
