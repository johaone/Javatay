package ru.devguru.practices.chapter_1_naz.arrays;

/**
 * Напишите функцию, которая принимает массив чисел с плавающей запятой и возвращает
 * их среднее арифметическое. Обработайте случай пустого массива.
 */
public class AverageOfArrays {
    public static void main(String[] args) {
        double[] array = {3.5, 4.5, 7.6, 8.9};
        double result = averageOfArrays(array);
        System.out.println("Average of the numbers is "+result);
    }

    public static double averageOfArrays(double[] array) {

        double sum = 0;
        for (Double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
