package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i][0] = i;
        }
        for (int i = 0; i < result[i].length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = i + j;

                System.out.print(result[i][j]);
                System.out.println();
            }
        }
    }
}
