package POO2;

public class Contador {

    private int cont;

    public Contador() {

    }

    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public Contador(Contador c) {
        this.cont = c.cont;
    }


}
