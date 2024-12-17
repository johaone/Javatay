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

        countVowelAndConsonant(str);


    }

    // метод считает количество: слов, гласных и согласных
    public static void countVowelAndConsonant(String text) {

        boolean inWord = false;
        int vowelCount = 0;
        int consonantCount = 0;
        int countWord = 0;
        char[] vowel = {'а', 'у', 'о', 'ы', 'э', 'я', 'ю', 'ё', 'и', 'е'};
        char[] consonant = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'л', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        for (int i = 0; i < text.length(); i++) {
            for (int ch = 0; ch < vowel.length; ch++) {
                if (Character.isLetter(ch)) {
                    inWord = true;             // здесь не получилось посчитать количество слов в тексте
                    countWord++;
                } else if (text.charAt(i) == vowel[ch]) {
                    vowelCount++;
                } else if (text.charAt(i) == consonant[ch]) {
                    consonantCount++;
                }
            }
        }
        System.out.print("количество слов: " + countWord + " количество гласных: " + vowelCount + " количество согласных: " + consonantCount);
    }
}
