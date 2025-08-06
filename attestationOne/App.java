package attestationOne;

import java.util.Scanner;

public class App {
    Scanner people = new Scanner(System.in);
    Scanner produkty = new Scanner(System.in);
    String name = people.nextLine();
    String magaz = produkty.nextLine();

    public String getName() {
        return name;
    }

    public String getMagaz() {
        return magaz;
    }


}
