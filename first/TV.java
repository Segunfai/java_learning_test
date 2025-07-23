package first;

import java.util.Random;
import java.util.Scanner;

public class TV {

    private String[] model = {"plockiy", "shirokiy", "krasiviy"};
    private String serialNumber;
    public String brand;
    private String operSystem;
    private static final int[] channels = {1, 2, 3, 4, 6, 7, 8, 9};
    public String mute;
    public String unmute;
    public String switchOn;
    public String switchOff;
    private boolean mode = false;


    public void power() {
        mode = !mode;
        System.out.println("Телевизор " + (mode ? "включен" : "выключен"));
    }

    public void setBrand(String tvBrand) {
        if (tvBrand != null && !tvBrand.isEmpty()) {
            brand = tvBrand;
        } else {
            System.out.println("Марка телевизора неопознана!");
        }
    }

    public static int randomChannel() {
        Random ranChan = new Random();
        int randomize = ranChan.nextInt(channels.length);
        return channels[randomize];
    }

    public void settings() {
        Scanner vvodBrand = new Scanner(System.in);
        System.out.println(vvodBrand);

    }

}
