package attestationOne;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner magaz = new Scanner(System.in);
        List<Person> lyudi = new ArrayList<>();
        List<Products> spisokpokupok  = new ArrayList<>();

        System.out.println("Введите Имя покупателя и количество его денег в формате 'Имя = деньги'. Для завершения программы введите 'END'.");
        /* Моя изначальная версия
        while (true) {
            String vvod = magaz.nextLine();
            if (vvod.equals("END")) break;

            String[] razdelenie = vvod.split(" = ");
            String imya = razdelenie[0];
            int dengi = Integer.parseInt(razdelenie[1]);

            lyudi.add(new Person(imya, dengi));
        }
        */

        // Дополнение от нейросети по формату "Имя = деньги"
        while (true) {
            String vvod = magaz.nextLine();
            if (vvod.equals("END")) break;

            try {
                String[] razdelenie = vvod.split(" = ");
                if (razdelenie.length != 2) {
                    System.out.println("Ошибка формата! Используйте 'Имя = деньги'");
                    continue;  // Пропускаем эту итерацию и запрашиваем ввод снова
                }
                String imya = razdelenie[0].trim();
                int dengi = Integer.parseInt(razdelenie[1].trim());
                lyudi.add(new Person(imya, dengi));
            }
            catch (NumberFormatException e) {
                System.out.println("Ошибка! Деньги должны быть числом.");
            }
        }

        System.out.println("\nВведите список продуктов в формате 'Наименование = стоимость'. Для завершения введите 'END'.");
        while (true) {
            String vvod = magaz.nextLine();
            if (vvod.equals("END")) break;

            try {
                String[] razdelenie = vvod.split(" = ");
                if (razdelenie.length != 2) {
                    System.out.println("Ошибка формата! Введите данные в формате 'Наименование = стоимость'!");
                    continue;
                }
                String naimenovanie = razdelenie[0].trim();
                int cost = Integer.parseInt(razdelenie[1].trim());
                spisokpokupok.add(new Products(naimenovanie, cost));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Цена введена не числом!");
            }
        }

        System.out.println("Введите покупки в формате 'Имя - наименование'. Для завершения введите 'END'.");

    }
}