package ru.devguru.practices.chapter_1_jama.arrays;

/**
 * Напишите функцию, которая сортирует массив целых чисел по возрастанию,
 * используя алгоритм сортировки по выбору (selection sort) или пузырьком (bubble sort).
 * Не используйте встроенные методы сортировки Java.
 */
public class SortArrays {
    public static void main(String[] args) {

        int[] numbers = {23, 57, 13, 93, 7, 2, 8, 3};

        bubbleSort(numbers);

    }

    // метод сортирует по пузырьковому методу
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tempVar = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVar;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
//    // метод сортирует по методу выбором
//    public static void selectionSort(int [] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            int minIndex = i;
//            int min = arr[i];
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[j ] < min) {
//                    minIndex = j;
//                    min = arr[j];
//                }
//            }
//           arr[minIndex] = arr[i];
//            arr[i] = min;
//            System.out.println(minIndex + " ");
//
//        }
//    }
}





