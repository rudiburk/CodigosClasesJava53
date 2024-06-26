package cl.praxis.miPrimerJava.desafio1;


import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {

        float resistencia1, resistencia2, resistencia3, rTotal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el valor de resistencia 1: ");
        resistencia1 = sc.nextFloat();
        System.out.println("Digite el valor de resistencia 2: ");
        resistencia2 = sc.nextFloat();
        System.out.println("Digite el valor de resistencia 3: ");
        resistencia3 = sc.nextFloat();

        rTotal = (1/((1/resistencia1) + (1/resistencia2) + (1/resistencia3)));

        if (resistencia1 <= 0 || resistencia2 <= 0 || resistencia3 <= 0) {
            System.out.println("Valor invalido, ingrese solamente valores positivos");
        }
        else {
            System.out.println("La resistencia total es :" + rTotal);
        }








    }
}