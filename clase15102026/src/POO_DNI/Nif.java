package POO_DNI;

import java.util.Scanner;

public class Nif {
    private int dni;
    private char letra;

    public Nif(){

    }

    public Nif(int dni){
        this.dni = dni;
        this.letra = calcularLetra();
    }

    private char calcularLetra(){
        char [] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        return letrasDNI[dni % 23];

    }

    public void leer(){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Introduzca dni");
            dni = scn.nextInt();
        }while(dni <= 0);
        letra = calcularLetra();
    }

    @Override
    public String toString(){
        return dni + " - "+letra;
    }
}
