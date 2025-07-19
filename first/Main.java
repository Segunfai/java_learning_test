package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String line = vvod.nextLine();
        System.out.println("Привет, " + line + "!");
        vvod.close();
    }
}