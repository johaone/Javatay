package ru.devguru.practices.chapter_1_jama.arrays;

/**
 * Напишите функцию, которая принимает массив чисел с плавающей запятой и возвращает их среднее арифметическое.
 * Обработайте случай пустого массива.
 */
public class AverageOfArrays {
    public static void main(String[] args) {

        double[] array = {3.7, 5.3, 7.8, 8.6, 11.9, 13.13, 23.32};

        System.out.println("average of the numbers is:  " + average(array));
    }

    // метод средне арифметическое
    public static double average(double[] arr) {

        double sum = 0;

        for (Double i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
