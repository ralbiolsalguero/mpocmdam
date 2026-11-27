package Linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> colaTareas = new LinkedList<>();
        colaTareas.addFirst("Urgente: revisar documentación");
        colaTareas.addLast("Ejecutar pruebas");

        System.out.println(colaTareas.peekFirst());
        System.out.println(colaTareas.pollFirst());
        System.out.println(colaTareas);
    }
}
