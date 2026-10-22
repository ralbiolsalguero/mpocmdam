package POO1;

public class Cuenta {
    //ATRIBUTO: modificador de acceso (public/private/protected) + tipo + nombre + (valor)
    //public: se puede acceder a él fuera de su clase, fuera del paquete donde se crea y dentro de la clase
    //private: no se puede acceder a el fuera de su clase, pero si se puede acceder dentro de su clase

    //Encapsulación:
    //1. atributos privados
    //2. métodos públicos getters y setters

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructores: Constructor por defecto, constructor copia y el constructor con parametros
    //public + nombreClase(parametros){}

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        //donde = el que
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta() {

    }

    public Cuenta(Cuenta c) {
        this.nombreCliente = c.nombreCliente;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo;
    }

    //Método getter -> return
    /*+
     * public + tipo + getNombreAtributo(){
     *   return + nombreAtributo;
     * }
     *
     * */

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters

    /*
     *
     * public + void + nombreMetodo(atributo){
     *   this.nombreAtributo = nombreParametro;
     * }
     *
     * */

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        // = -> operador de asignación
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public boolean ingreso(double cantidad) {
        boolean resultado = false;
        if (cantidad >= 0) {
            this.saldo += cantidad; //this.saldo = this.saldo + cantidad
            resultado = true;
        }
        return resultado;
    }

    public boolean reintegro(double cantidad) {
        boolean resultado = true;
        if (cantidad < 0 || cantidad > this.saldo) {
            //OR: true + false -> true; true + true = true; false + false = false; ||
            //AND: true + true = true; true + false = false; false + false = false; &&
            resultado = false;
        } else {
            this.saldo -= cantidad; //this.saldo = this.saldo - cantidad;
        }

        return resultado;
    }

    public boolean transferencia(Cuenta c, double dinero) {
        boolean resultado = true;
        if (dinero < 0 || dinero > this.saldo) {
            resultado = false;
        } else {
            reintegro(dinero);
            c.ingreso(dinero);
        }

        return resultado;
    }

}
