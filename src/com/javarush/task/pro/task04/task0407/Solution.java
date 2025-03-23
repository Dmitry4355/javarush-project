package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int b = 1;
        while (b <= 100) {
            if (b % 3 == 0) {
                b++;
                continue;
            }
            i = i + b;
            b++;
        }
        System.out.println(i);

        //напишите тут ваш код

    }
}