package ru.devguru.practices.chapter_1_naz.arrays;

import java.util.Arrays;

/**
 * Напишите функцию, которая принимает массив целых чисел и индекс элемента который нужно удалить.
 * Функция должна вернуть новый массив без элемента, указанного по индексу.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int [] array={3,5,8,6,34,23,5,70};
        removeElement(array,4);
    }

    public static void removeElement(int [] array, int index){
        int [] result=new int[array.length-1];
        System.arraycopy(array, 0, result, 0, index);    // копирую элементы с лева от индекса
        System.arraycopy(array, index + 1, result, index, array.length - index - 1);
        System.out.println(Arrays.toString(result));
    }
}
