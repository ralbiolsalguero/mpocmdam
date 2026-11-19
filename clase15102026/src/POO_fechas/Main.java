package POO_fechas;

public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(30,04,1999);
        System.out.println(f1);
        f1.diaSiguiente();
        System.out.println(f1);
    }
}
