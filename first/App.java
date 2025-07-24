package first;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        //Включаем
        TV newTv = new TV();
        newTv.power();

        //Показываем информацию о телевизоре
        TV info = new TV();
        info.setBrand();

        info.settings();

        //Тыкаем случайный канал
        int sKanal = TV.randomChannel();
        System.out.println("Случайный канал: " + sKanal);

        TV.randomChannel();
        //Включаем / выключаем звук
        TV mute = new TV();
        mute.zvuk();

        TV sledKanal = new TV();
        sledKanal.nextKanal();

        TV predKanal = new TV();
        predKanal.prevKanal();

        TV whatKanal = new TV();
        whatKanal.tekKanalInfo();

        newTv.power();
    }
}
