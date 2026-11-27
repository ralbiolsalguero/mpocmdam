package Arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Preparar reunión");
        tareas.add("Revisar código"); //2
        tareas.add(1,"Ejecutar pruebas"); //1
        tareas.add("Adios");

        //For each
        /*for(String i : tareas){
            System.out.println(i);
        }*/

        //For

        for(int i = 0;i<tareas.size();i++){
            System.out.println(tareas.get(i));
        }








    }
}
