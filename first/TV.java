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

    public TV(String brand, String operSystem) {
        this.brand = brand;
        this.operSystem = operSystem;
        this.serialNumber = serNumGen();
    }

    public void power() {
        mode = !mode;
        System.out.println("Телевизор " + (mode ? "включен" : "выключен"));
        if (!mode) { // Если ТВ выключили
            mute = true; // Принудительно выключаем звук
        }else mute = true;
    }

  /*
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
    */

    private String serNumGen() {
        Random random = new Random();
        return "SN-" + random.nextInt(10000); // Например: SN-1234
    }

    public static int randomChannel() {
        Random ranChan = new Random();
        int randomize = ranChan.nextInt(channels.length);
        return channels[randomize];
    }

    /*
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
    */

    public void zvuk() {
        if (mode) {
            mute = !mute;
            System.out.println("Звук " + (mute ? "выключен" : "включен"));
        } else {
            System.out.println("Сначала включите телевизор!");
        }
    }

    public void settings() {
        System.out.println("=== Настройки ===");
        System.out.println("Бренд: " + brand);
        System.out.println("ОС: " + operSystem);
        System.out.println("Модель: " + model[new Random().nextInt(model.length)]);
        System.out.println("Серийник: " + serialNumber);
    }
    /*
    public void settings() {
        System.out.println("Бренд: " + brand);
        System.out.println("Операционная система: " + operSystem);
        Random harakter = new Random();
        int kakoy = harakter.nextInt(model.length);
        String display = model[kakoy];
        System.out.println("Модель: " + display);
    }
    */

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

