package ru.devguru.practices.chapter_1_jama.arrays;

/**
 * Напишите функцию, которая принимает массив целых чисел и возвращает true,
 * если в массиве есть хотя бы два одинаковых элемента, и false в противном случае.
 */
public class FindTheSameNumbersOfArrays {
    public static void main(String[] args) {

        int[] numbers = {7, 23, 13, 89, 2, 13, 23, 57, 93};

        System.out.println("дубликат: " + isDuplicate(numbers));
    }

    // метод проверяет: имеется ли дубликаты в массиве
    public static boolean isDuplicate(int[] arr) {

        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {    // i =7; i = 23;
            for (int j = i + 1; j < arr.length; j++) { // j = 23; j = 13 -> 89-> 2-> 13-> 23 -> duplicate = true;
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
        }
        return duplicate;
    }
}
