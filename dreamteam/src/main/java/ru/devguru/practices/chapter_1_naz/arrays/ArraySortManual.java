package ru.devguru.practices.chapter_1_naz.arrays;

/**
 * Напишите функцию, которая сортирует массив целых чисел по возрастанию,
 * используя алгоритм сортировки по выбору (selection sort)
 * или пузырьком (bubble sort). Не используйте встроенные методы сортировки Java.
 */
public class ArraySortManual {
    public static void main(String[] args) {
        int[] array={5,2,8,1,9};
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j < array.length-i-1 ; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив");
        for(Integer i : array) {
            System.out.println(i);
        }
    }
}
