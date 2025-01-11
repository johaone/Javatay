package ru.devguru.practices.chapter_1_naz.arrays;

/**
 * Напишите программу, которая генерирует случайный пароль заданной длины. Пароль должен содержать только буквы
 * (заглавные и строчные)и цифры.
 * Используйте цикл for, Math.random() и if-else для проверки типа генерируемого символа.
 * Результат выведите в консоль используя String.
 */
public class RandomPassword {
    public static void main(String[] args) {
        int passwordLength = 6;
        String password=generatePassword(passwordLength);
        System.out.println("Сгенерированный пароль: "+password);

    }
    public static String generatePassword(int length) {
        String character="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
           int index=(int)(Math.random()*character.length());
           password.append(character.charAt(index));
        }
        return password.toString();
    }
}
