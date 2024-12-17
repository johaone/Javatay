//package ru.devguru.practices.chapter_1_jama.arrays;
//
///**
// * Напишите функцию, которая принимает два отсортированных по возрастанию массива целых чисел
// * и возвращает новый отсортированный массив,
// * содержащий все элементы из обоих исходных массивов.
// */
//public class MergeArrays {
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 2, 4, 5, 6, 8};
//        int[] arr2 = {3, 5, 7, 9, 11, 13};
//        int[] dest = new int[arr1.length + arr2.length];
//        mergeArrays(arr1,arr2);
//
//
//        System.out.println(dest);
//    }
//
//    public static void mergeArrays(int[] arr1, int arrOneStart,
//                                   int[] arr2, int arrTwoStart,
//                                   int[] dest, int destStart,
//                                   int size) {
//
//        int index1 = arrOneStart;
//        int index2 = arrTwoStart;
//
//        int arrOneEnd = Math.min(arrOneStart + size, arr1.length);
//        int arrTwoEnd = Math.min(arrTwoStart + size, arr2.length);
//        int iterationCount = arrOneEnd - arrOneStart + arrTwoEnd - arrTwoStart;
//
//        for (int i = destStart; i < destStart + iterationCount; i++) {
//
//            if (index1 < arrOneEnd && (index2 >= arrTwoEnd || arr1[index1] < arr2[index2])) {
//                dest[i] = arr1[index1];
//                index1++;
//            } else {
//                dest[i] = arr2[index2];
//                index2++;
//            }
//        }
//    }
//
////        public static void mergeArrays(int[] arr1, int[] arr2, int[] dest) {
////            int i = 0;
////            // Копируем элементы из первого массива
////            for (int value : arr1) {
////                dest[i++] = value;
////            }
////            // Копируем элементы из второго массива
////            for (int value : arr2) {
////                dest[i++] = value;
////            }
////        }
//    }
//
