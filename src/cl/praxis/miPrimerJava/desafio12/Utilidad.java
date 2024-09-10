package cl.praxis.miPrimerJava.desafio12;

import java.util.Scanner;

public class Utilidad {
    static Scanner sc = new Scanner(System.in);

    public static void limpiar() {
        System.out.println("/n /n /n /n /n /n");
    }

    public static void cerrar() {
        sc.close();
    }

    public static void esperar() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void espacio() {
        System.out.println("");
    }

    public static void linea() {
        System.out.println("------------------------------------");
    }


}
