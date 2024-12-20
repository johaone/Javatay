package ru.devguru.practices.chapter_1_jama.loops._while;

import java.util.Scanner;

/**
 * Напишите игру "Угадай число". Программа генерирует случайное число от 1 до 100.
 * Пользователь пытается угадать это число. Программа должна сообщать, больше или меньше введенное число, чем загаданное.
 * Используйте цикл while, if-else и Math.random(). Подсчитайте количество попыток.
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        guessTheNumber(scanner);
    }

    public static void guessTheNumber(Scanner scanner) {
        int randomNumber = (int) (Math.random() * 100);    // Генерация числа от 0 до 99
        int countOfTry = 0;
        int number = 0;

        System.out.println("Угадайте число от 0 до 99:");
        System.out.println("Введите число");

        while (number != randomNumber) {
            number = scanner.nextInt();
            countOfTry++;

            if (number < randomNumber) {
                System.out.println("Вы ввели МЕНЬШЕ рандомного числа!");
            } else if (number > randomNumber) {
                System.out.println("Вы ввели БОЛЬШЕ рандомного числа!");
            } else {
                System.out.println("Поздравляю, Вы угадали число!");
            }
            System.out.println("У вас было " + countOfTry + " попыток");
        }
    }
}

