package first;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        TV info = new TV();
        //Показываем информацию о телевизоре
        info.setBrand();

        info.settings();

        TV newTv = new TV();
        //Включаем
        newTv.power();
        //Тыкаем случайный канал
        int sKanal = TV.randomChannel();
        System.out.println("Случайный канал: " + sKanal);

        TV.randomChannel();

    }

}
