package ru.devguru.practices.chapter_1_jama.arrays;

/**
 * Напишите функцию, которая принимает массив целых чисел и возвращает максимальный элемент в этом массиве.
 */
public class MaxOfArrays {
    public static void main(String[] args) {

        int[] numbers = {11, 23, 35, 48, 5, 16, 7, 8, 99, 10};
        System.out.println("max number: " + findMaxNumOfArrays(numbers));
    }

    // находит максимальное число в массиве
    public static int findMaxNumOfArrays(int[] arr) {

        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
