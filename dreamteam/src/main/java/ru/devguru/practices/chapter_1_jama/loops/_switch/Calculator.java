package ru.devguru.practices.chapter_1_jama.loops._switch;

import java.util.Scanner;

/**
 * Создайте простой текстовый калькулятор. Программа должна запрашивать у пользователя два числа
 * и операцию (+, -, *, /). Используйте switch-case для обработки операций и if-else для обработки ошибок (например, деление на ноль).
 * Результат выведите на консоль, используя StringBuilder для вывода выражения и результата.
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        calculator(scanner);
    }

    public static void calculator(Scanner scanner) {

        System.out.println("Введите 1 число");
        int num1 = scanner.nextInt();
        System.out.println("Введите 2 число");
        int num2 = scanner.nextInt();
        System.out.println("Введите введите одну из перечисленных операций: +,-,*,/");
        String operation = scanner.next();

        switch (operation) {
            case "+": {
                System.out.println(num1 + num2);
                break;
            }
            case "-": {
                System.out.println(num1 - num2);
                break;
            }
            case "*": {
                System.out.println(num1 * num2);
                break;
            }
            case "/": {
                if (operation == "/" || num2 == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            }
            default: {
                System.out.println("Недопустимая операция");
            }
        }
    }
}





