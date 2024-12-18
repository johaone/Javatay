package ru.devguru.practices.chapter_1_jama.loops._for;

/**
 * Напишите программу, которая анализирует введенный пользователем текст.
 * Программа должна подсчитывать количество слов, количество гласных и согласных букв.
 * Используйте цикл for, if-else (для проверки гласных/согласных), и массивы символов (char[]). Результаты выведите на консоль.
 */
public class VowelAndConsonant {
    public static void main(String[] args) {

        // гласные = а,у,о,ы,э,я,ю,ё,и,е
        // согласные = б, в, г, д, ж,з,й,к,л,м,н,п,р,с,т,ф,х,ц,ч,ш,щ.
        String str = "мёд юмор";

//        countVowelAndConsonant(str);

        System.out.println("количество слов: " + countWords(str));
        System.out.println("количество гласных:  " + countVowel(str));
        System.out.println("количество согласных: " + countConsonants(str));


    }

    // метод считает количество слов в тексте
    public static int countWords(String text) {

        int wordCount = 0;
        boolean word = false;
        int endOfLine = text.length() - 1;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(text.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(text.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    // метод считает гласных слов в тексте
    public static int countVowel(String text) {

        int vowelCount = 0;
        char[] vowel = {'а', 'у', 'о', 'ы', 'э', 'я', 'ю', 'ё', 'и', 'е'};

        for (int i = 0; i < text.length(); i++) {
            for (char c : vowel) {
                if (text.charAt(i) == c) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    // метод считает согласных слов в тексте
    public static int countConsonants(String text) {

        int consonantCount = 0;
        char[] consonant = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'л', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        for (int i = 0; i < text.length(); i++) {
            for (char c : consonant) {
                if (text.charAt(i) == c) {
                    consonantCount++;
                }
            }
        }
        return consonantCount;
    }
}
