package first;

public class Homework_3_3_Sortyrovka {

    public static void main(String[] args) {
        // Входная строка (пример: "Hello World")
        String input = "Hello World";

        // Разделяем строку на слова по пробелу
        String[] words = input.split(" ");

        // Обрабатываем каждое слово
        for (int i = 0; i < words.length; i++) {
            // Разбиваем слово на буквы
            char[] letters = words[i].toCharArray();

            // Сортируем буквы пузырьковой сортировкой
            for (int j = 0; j < letters.length - 1; j++) {
                for (int k = 0; k < letters.length - j - 1; k++) {
                    // Сравниваем две соседние буквы
                    if (letters[k] > letters[k + 1]) {
                        // Меняем их местами, если нужно
                        char temp = letters[k];
                        letters[k] = letters[k + 1];
                        letters[k + 1] = temp;
                    }
                }
            }

            // Собираем отсортированные буквы обратно в слово
            String sortedWord = new String(letters);

            // Переводим слово в нижний регистр
            words[i] = sortedWord.toLowerCase();
        }

        // Собираем слова обратно в строку и выводим
        String result = String.join(" ", words);
        System.out.println(result);
    }
}