package ru.devguru.practices.chapter_1_naz.arrays;

import java.util.List;

/**
 * Напишите функцию, которая принимает массив целых чисел и возвращает максимальный элемент в этом массиве.
 */
public class FindMaxArray {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 56, 78, 43, 54, 2, 4, 7);
        System.out.println("Max: "+findMax(integers));
    }

    public static int findMax(List<Integer> array) {

        int max = 0;
        for (Integer i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
