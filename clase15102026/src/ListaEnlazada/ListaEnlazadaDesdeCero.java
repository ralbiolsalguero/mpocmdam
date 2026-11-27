package ListaEnlazada;

public class ListaEnlazadaDesdeCero<T> {

    private static class Nodo<E>{
        E dato;
        Nodo<E> anterior;
        Nodo <E> siguiente;

        Nodo(E dato){
            this.dato = dato;
        }

        private Nodo<T> cabeza;
        private Nodo<T> cola;
        private int tamanio;

    }

}
