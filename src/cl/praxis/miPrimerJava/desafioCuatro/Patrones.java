package cl.praxis.miPrimerJava.desafioCuatro;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int div1;
        int div2;
        int modulo1;
        int modulo2;
        String bloque1 = "1234";
        String bloque2 = "||*";

        // Patrón 1.
        System.out.println("Ingrese el número de caracteres a imprimir");
        int ciclo = sc.nextInt();

        div1 = (ciclo/4);
        modulo1 = (ciclo%4);
        div2 = (ciclo/3);
        modulo2 = (ciclo%3);

        System.out.println("Patrón 1: ");

        for (int i = 0; i < ciclo; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else
                System.out.print(",");
        }
//**************************************************************************
        // Patrón 2.
        System.out.println("\n\nPatron 2: ");

        if (ciclo <4){
            for (int i = 1; i < ciclo +1; i++)
                System.out.print(i);
        } else {
                for(int i = 1; i <= div1; i++){
                    System.out.print(bloque1);
                }
                for (int j = 1; j <= modulo1; j++){
                    System.out.print(j);
                }
        }
//***********************************************************************+
        // Patrón 3
        System.out.println("\n\nPatron 3: ");

        if (ciclo <3){
            for (int i = 1; i < ciclo +1; i++)
                System.out.print("|");
        } else {
            for(int i = 1; i <= div2 ; i++){
                System.out.print(bloque2);
            }
            for (int j = 1; j <= modulo2 ; j++){
                System.out.print("|");
            }
        }




    }
}
