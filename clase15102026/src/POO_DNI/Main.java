package POO_DNI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Nif nif1 = new Nif();
        nif1.leer();
        System.out.println(nif1);

        Nif nif2 = new Nif(12345678);
        System.out.println(nif2);

    }
}
