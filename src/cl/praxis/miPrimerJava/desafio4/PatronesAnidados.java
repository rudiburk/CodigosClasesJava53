package cl.praxis.miPrimerJava.desafio4;


import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        dibujarPatron1();
        dibujarPatron2();
        dibujarPatron3();
        dibujarPatron4();

    }
    // Método 1
    public static String dibujarPatron1(){
        String patron1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el digito del patron1: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == 0 || i == numero -1  || j == numero-1 || j == 0 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return patron1;
    }
    //Método2
    public static String dibujarPatron2() {
        String patron2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dígito del patron2: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == 0 || i == numero - 1 || j + i == numero - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return patron2;
    }

    //Método 3.
    public static String dibujarPatron3() {
        String patron3 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dígito del patron3: ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if ( j + i == numero - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        return patron3;
    }

    //Método 4.
    public static String dibujarPatron4() {
        String patron4 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el digito del patron4: ");
        int numero = sc.nextInt();
        System.out.println(" ");
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (j == 0 && j+i != 0 || j == numero -1 && j +i != ((numero-1) + (numero -1)) ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        return patron4;
    }
}

