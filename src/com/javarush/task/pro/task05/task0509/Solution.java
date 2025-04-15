package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            MULTIPLICATION_TABLE[0][i] = i + 1;
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                if (j == 0) {
                    MULTIPLICATION_TABLE[i][j] = i + 1;
                } else {
                    MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                }
            }
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++)
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            System.out.println();
        }
    }
}