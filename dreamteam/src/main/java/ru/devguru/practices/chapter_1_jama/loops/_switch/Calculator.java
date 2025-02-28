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

        StringBuilder result = new StringBuilder();

        switch (operation) {
            case "+": {
                result.append(num1 + num2);
                break;
            }
            case "-": {
                result.append(num1 - num2);
                break;
            }
            case "*": {
                result.append(num1 * num2);
                break;
            }
            case "/": {
                if (num2 == 0) {
                    result.append("Нельзя делить на 0");
                } else {
                    result.append(num1 / num2);
                }
                break;
            }
            default: {
                result.append("Недопустимая операция");
            }
        }
        System.out.println(result);
    }
}





