package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int[] a = Arrays.copyOfRange(array, 0, (array.length + 1) / 2);
        int[] b = Arrays.copyOfRange(array, (array.length + 1) / 2, array.length);

        result[0] = a;
        result[1] = b;

        System.out.println(Arrays.deepToString(result));
    }
}
