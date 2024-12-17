package ru.devguru.practices.chapter_1_jama.loops._switch;

import java.util.Scanner;

/**
 * Напишите программу, которая преобразует целое число (от 0 до 999) в его словесное представление.
 * Например, 123 -> "сто двадцать три".
 * Используйте switch-case, массивы String для хранения названий чисел
 * (единиц, десятков, сотен) и логику обработки сотен, десятков и единиц.
 */
public class ConvertNumIntoWord {
    public static void main(String[] args) {

        System.out.println(convertNumIntoWord(45));

    }

    public static String convertNumIntoWord(int num) {

        if (num < 0 || num > 999) {
            return "Число вне диапазона (0 - 999)";
        }

        String[] units = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        int unitsDigit = num % 10;
        int tensDigit = (num / 10) % 10;
        int hundredsDigit = num / 100;

        String result = "";

        if (hundredsDigit > 0) {
            result += hundreds[hundredsDigit] + " ";
        }

        if (tensDigit == 1) { // обработка для 10-19
            switch (unitsDigit) {
                case 0:
                    result += "десять";
                    break;
                case 1:
                    result += "одиннадцать";
                    break;
                case 2:
                    result += "двенадцать";
                    break;
                case 3:
                    result += "тринадцать";
                    break;
                case 4:
                    result += "четырнадцать";
                    break;
                case 5:
                    result += "пятнадцать";
                    break;
                case 6:
                    result += "шестнадцать";
                    break;
                case 7:
                    result += "семнадцать";
                    break;
                case 8:
                    result += "восемнадцать";
                    break;
                case 9:
                    result += "девятнадцать";
                    break;
            }
        } else {
            if (tensDigit > 0) {
                result += tens[tensDigit] + " ";
            }
            if (unitsDigit > 0) {
                result += units[unitsDigit];
            }
        }

        return result.trim();
    }
}








