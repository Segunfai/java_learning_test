package first;

import java.util.Random;
import java.util.Scanner;

public class TV {

    private final String[] model = {"plockiy", "shirokiy", "krasiviy"};
    private String serialNumber;
    public String brand;
    private String operSystem;
    private static final int[] channels = {1, 2, 3, 4, 6, 7, 8, 9};
    private int tekKanal = 0;
    public boolean mute = false;
    public String switchOn;
    public String switchOff;
    private boolean mode = false;


    public void power() {
        mode = !mode;
        System.out.println("Телевизор " + (mode ? "включен" : "выключен"));
    }

    public void setBrand() {

        Scanner vvodBrand = new Scanner(System.in);
        System.out.println("Введите бренд телевизора: ");
        String brandim = vvodBrand.nextLine();
        if (brandim != null && !brandim.isEmpty()) {
            brand = brandim;
        } else {
            System.out.println("Марка телевизора неопознана!");
        }
    }

    public static int randomChannel() {
        Random ranChan = new Random();
        int randomize = ranChan.nextInt(channels.length);
        return channels[randomize];
    }

    public void setOs() {

        Scanner vvodOs = new Scanner(System.in);
        System.out.println("Введите название операционной системы телевизора: ");
        String osim = vvodOs.nextLine();
        if (osim != null && !osim.isEmpty()) {
            operSystem = osim;
        } else {
            System.out.println("Операционная система телевизора неопознана!");
        }
    }

    public void zvuk() {
        mute = !mute;
        System.out.println("Звук " + (mute ? "включен" : "выключен"));
    }

    public void settings() {
        System.out.println("Бренд: " + brand);
        System.out.println("Операционная система: " + operSystem);
        Random harakter = new Random();
        int kakoy = harakter.nextInt(model.length);
        String display = model[kakoy];
        System.out.println("Модель: " + display);
        serialNumber = "Секретная информация";
        System.out.println(serialNumber);
    }

    public void nextKanal() {
        if (!mode) {
            System.out.println("Сначала включите телевизор!");
            return;
        }

        tekKanal = (tekKanal + 1) % channels.length;
        System.out.println("Текущий канал: " + channels[tekKanal]);
    }

    public void prevKanal() {
        if (!mode) {
            System.out.println("Сначала включите телевизор!");
            return;
        }

        tekKanal = (tekKanal - 1 + channels.length) % channels.length;
        System.out.println("Текущий канал: " + channels[tekKanal]);
    }

    public void tekKanalInfo() {
        if (!mode) {
            System.out.println("Телевизор выключен!");
            return;
        }
        System.out.println("Сейчас на телевизоре включен канал: " + channels[tekKanal]);
    }
}

}
