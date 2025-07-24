package first;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        //Создаем новый телек
        TV newTv = new TV("Testovyi", "Abra-kadabra OS");

        //Включаем
        newTv.power();
        System.out.println("Вас приветствует тестовый ТВ!");

        //Показываем информацию о телевизоре
        newTv.settings();

        //Тыкаем случайный канал
        int sKanal = TV.randomChannel();
        System.out.println("Случайный канал: " + sKanal);
        TV.randomChannel();

        //Включаем / выключаем звук
        newTv.zvuk();

        newTv.nextKanal();

        newTv.prevKanal();

        newTv.tekKanalInfo();

        //Выключаем
        newTv.power();

        //Пробуем тыкнуть следующий канал
        newTv.nextKanal();

        //Пробуем включить звук на выключенном телеке
        newTv.zvuk();
    }
}
