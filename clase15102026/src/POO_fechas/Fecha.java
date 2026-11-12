package POO_fechas;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {

    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private boolean esBisiesto() {
        boolean resultado = false;
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            resultado = true;
        }
        return resultado;
    }

    public boolean fechaCorrecta() {
        boolean resultado = false;
        boolean diaCorrecto, mesCorrecto, anioCorrecto;
        anioCorrecto = anio > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;

        }
        if(diaCorrecto && mesCorrecto && anioCorrecto){
            resultado = true;
        }
        return resultado;
    }
}
