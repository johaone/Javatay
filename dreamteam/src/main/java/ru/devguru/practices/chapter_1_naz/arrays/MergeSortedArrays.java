package ru.devguru.practices.chapter_1_naz.arrays;

import java.util.Arrays;

/**
 * Напишите функцию, которая принимает два отсортированных по возрастанию массива целых чисел
 * и возвращает новый отсортированный массив,
 * содержащий все элементы из обоих исходных массивов.
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] result = mergeSortedArrays(array, array2);
        System.out.println("Результат обьединения массивов");
        System.out.println(Arrays.toString(result));

    }

    public static int[] mergeSortedArrays(int[] array, int[] array2) {
        int[] result = new int[array.length + array2.length]; //Новый массив результата
        int i = 0, j = 0, k = 0;

        //Слияние массивов до исчерпания одного из них
        while (i < array.length && j < array2.length) {
            if (array[i] < array2[j]) {
                result[k++] = array[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        //Добавление оставшихся элементов из array,если они есть
        while (i < array.length) {
            result[k++] = array[i++];
        }
        //Добавление оставшихся элементов из array2,если они есть
        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }
}
