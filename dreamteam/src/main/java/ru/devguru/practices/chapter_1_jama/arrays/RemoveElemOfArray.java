package ru.devguru.practices.chapter_1_jama.arrays;

import java.util.Arrays;

/**
 * Напишите функцию, которая принимает массив целых чисел и индекс элемента который нужно удалить.
 * Функция должна вернуть новый массив без элемента, указанного по индексу.
 */
public class RemoveElemOfArray {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4};

        removeElementOfArray(array, 1);
    }

    // метод удаляет элемент по индексу из массива и возвращает новый массив без удаленного элемента
    public static void removeElementOfArray(int[] arr, int index) {

        int[] result = new int[arr.length - 1]; // Результирующий массив

        System.arraycopy(arr, 0, result, 0, index);    // копирую элементы с лева от индекса
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);  //копирую элементы с право от индекса

        System.out.println(Arrays.toString(result));
    }
}


