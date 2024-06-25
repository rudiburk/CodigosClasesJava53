package cl.praxis.miPrimerJava.desafioUno;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de caracteres a imprimir");
        int ciclos = sc.nextInt();

        for (int i = 0; i < ciclos; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else
                System.out.print(",");
        }



    }
}
