package ru.devguru.practices.chapter_1_naz.arrays;
import java.util.Arrays;

/**
 * Напишите функцию, которая принимает массив целых чисел и вращает его на одну позицию вправо.
 * Например, {1, 2, 3, 4} станет {4, 1, 2, 3}.
 */
public class RotateArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4};
        System.out.println("Исходный массив " + Arrays.toString(array));
        rotateArray(array);
        System.out.println("После вращения " + Arrays.toString(array));
    }
    public static void rotateArray(int[] array) {
        if(array.length==0){
            return; //Если массив пустой, ничего не делаем
        }
        //Сохраняем последний элемент
        int last=array[array.length-1];

        //Сдвигаем все элементы вправо
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=last;
    }
}
