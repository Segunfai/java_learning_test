package first;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        TV newTv = new TV();

        newTv.power();

        int sKanal = TV.randomChannel();
        System.out.println("Случайный канал: " + sKanal);

        TV.randomChannel();
    }

}
