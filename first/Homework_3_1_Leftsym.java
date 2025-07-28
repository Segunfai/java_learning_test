package first;

import java.util.Scanner;

public class Homework_3_1_Leftsym {
    public static void main(String[] args) {
        // Строка с допустимыми символами (все строчные)
        String validSymbols = "qwertyuiopasdfghjklzxcvbnm";
        Scanner klava = new Scanner(System.in);

        System.out.println("Введите один символ: ");

        String input = klava.nextLine(); // Считываем ввод

        // Проверка: ввёл ли пользователь ровно один символ
        if (input.length() != 1) {
            System.out.println("Ошибка: нужно ввести ровно один символ!");
            System.out.println("Вы ввели: \"" + input + "\" (длина: " + input.length() + ")");
        } else {
            char inputSym = input.charAt(0); // Получаем символ

            // Проверяем, является ли символ буквой (на всякий случай)
            if (!Character.isLetter(inputSym)) {
                System.out.println("Ошибка: '" + inputSym + "' — это не буква. Введите букву от a до z.");
            } else {
                // Приводим к нижнему регистру, чтобы работало и с 'A', и с 'a'
                char inputSymLower = Character.toLowerCase(inputSym);

                // Проверяем, есть ли такой символ в нашей строке
                int position = validSymbols.indexOf(inputSymLower);

                if (position == -1) {
                    System.out.println("Ошибка: символ '" + inputSym + "' не найден");
                } else if (position == 0) {
                    System.out.println("Символ '" + inputSym + "' — самый первый");
                } else {
                    char leftSym = validSymbols.charAt(position - 1);
                    System.out.println(leftSym);
                }
            }
        }

        klava.close();
    }
}