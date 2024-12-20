package ru.devguru.practices.chapter_1_naz.loops._while;

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

        int randomNumber = (int) (Math.random() * 100);

        int number = 0;
        int count = 0;
        while (number != randomNumber) {
            number = scanner.nextInt();
            count++;
            if (number < randomNumber) {
                System.out.println("Вы ввели меньше рандомного числа");
            } else if (number > randomNumber) {
                System.out.println("Вы ввели больше рандомного числа");
            } else {
                System.out.println("Вы угадали число");
            }
            System.out.println("У вас было " + count + " попыток");
        }
    }
}
