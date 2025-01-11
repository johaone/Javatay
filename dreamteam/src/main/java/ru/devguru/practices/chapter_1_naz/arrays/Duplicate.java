package ru.devguru.practices.chapter_1_naz.arrays;

import java.util.HashSet;

/**
 * Напишите функцию, которая принимает массив целых чисел и возвращает true,
 * если в массиве есть хотя бы два одинаковых элемента, и false в противном случае.
 */
public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Без дубликата: " + duplicate(array));

        int[] array2 = {1, 2, 3, 4, 5, 2};
        System.out.println("С дубликатом: " + duplicate(array2));
    }

    public static boolean duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
