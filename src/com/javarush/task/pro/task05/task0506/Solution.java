package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        array = new int[b];
        for (int i = 0; i < b; i++) {
            array[i] = s.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
