package cl.praxis.miPrimerJava.desafio11;

import java.util.Scanner;

public class Utilidad {
    public static void esperar() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void limpiarPantalla() {
        System.out.println("\n \n \n \n \n \n \n \n \n \n");
    }

    public static void espacio() {
        System.out.println("");
    }

}