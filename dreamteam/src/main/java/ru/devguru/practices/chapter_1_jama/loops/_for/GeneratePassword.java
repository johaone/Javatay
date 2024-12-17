package ru.devguru.practices.chapter_1_jama.loops._for;

/**
 * Напишите программу, которая генерирует случайный пароль заданной длины.
 * Пароль должен содержать только буквы (заглавные и строчные) и цифры.
 * Используйте цикл for, Math.random() и if-else для проверки типа генерируемого символа.
 * Результат выведите в консоль используя String.
 */
public class GeneratePassword {
    public static void main(String[] args) {

        System.out.println("Password: "+ generateRandomPassword(12));

    }

    public static String generateRandomPassword(int length) {
        String numbers = "1234567890";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

        String symbols =  numbers + lowercase + uppercase;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return sb.toString();
    }
}



