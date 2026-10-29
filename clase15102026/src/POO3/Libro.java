package POO3;

public class Libro {
    private String tituloLibro;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    public Libro(){

    }

    public Libro(String tituloLibro, String autor, int numEjemplares, int numPrestados) {
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }

    //Quijote => 0 prestados 0 ejemplares (10)
    public boolean prestamo(){
        boolean resultado = true;
        if(this.numPrestados < this.numEjemplares){
            this.numPrestados++;
        }else{
            resultado = false;
        }
        return resultado;
    }

    public boolean devolucion(){
        boolean resultado = true;
        if (this.numPrestados != 0){
            this.numPrestados--;
        }else{
            resultado = false;
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Titulo: "+tituloLibro+", Autor: "+autor+", Num Prestados: "+numPrestados+", Num Ejemplares: "+numEjemplares;
    }

}
