package first;

import java.util.Arrays;

public class Homework_3_3_Sortyrovka {

    public static void main(String[] args) {
        String input = "Absolute Cinema";
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            // Переводим слово в нижний регистр до сортировки
            char[] letters = words[i].toLowerCase().toCharArray();

            // Пузырьковая сортировка
            for (int j = 0; j < letters.length - 1; j++) {
                for (int k = 0; k < letters.length - j - 1; k++) {
                    if (letters[k] > letters[k + 1]) {
                        char temp = letters[k];
                        letters[k] = letters[k + 1];
                        letters[k + 1] = temp;
                    }
                }
            }
            words[i] = new String(letters);  // Заменяем слово на отсортированное
        }

        String result = String.join(" ", words);
        System.out.println(result);
    }
}