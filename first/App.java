package first;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        //Создаем новый телек
        TV newTv = new TV("Testovyi", "Abra-kadabra OS");

        //Включаем
        newTv.power();
        System.out.println("");
        System.out.println("Вас приветствует тестовый ТВ!");
        System.out.println("");

        Scanner user = new Scanner(System.in);
        System.out.print("Как вас зовут?");
        String line = user.nextLine();
        System.out.println("Привет, " + line + "!");
        user.close();


        //Показываем информацию о телевизоре
        newTv.settings();

        //Тыкаем случайный канал
        int sKanal = TV.randomChannel();
        System.out.println("Случайный канал: " + sKanal);
        System.out.println("");
        TV.randomChannel();

        //Включаем / выключаем звук
        newTv.zvuk();
        System.out.println("");

        newTv.nextKanal();
        System.out.println("");

        newTv.prevKanal();
        System.out.println("");

        newTv.tekKanalInfo();
        System.out.println("");

        //Выключаем
        newTv.power();
        System.out.println("");

        //Пробуем тыкнуть следующий канал
        newTv.nextKanal();
        System.out.println("");

        //Пробуем включить звук на выключенном телеке
        newTv.zvuk();
        System.out.println("");
    }
}
