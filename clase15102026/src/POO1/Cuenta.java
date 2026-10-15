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

    //Constructor por parámetros
    //public + nombre de la clase + (parametros)
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    //Constructor por defecto
    public Cuenta(){

    }


    //Método getter -> return
    /*+
    * public + tipo + getNombreAtributo(){
    *   return + nombreAtributo;
    * }
    *
    * */

    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }

    public double getSaldo(){
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

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        // = -> operador de asignación
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }





}
