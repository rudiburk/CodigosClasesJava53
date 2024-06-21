package cl.praxis.miPrimerJava.clases;

import java.util.Scanner;
// Comparaciones de integer.
public class Clase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese su edad");
//        int edad = sc.nextInt();
//        if (edad < 18){
//            System.out.println("Es menor15 edad");
//        } else if (edad > 18){
//            System.out.println("Es mayor de edad");
//        }else {
//            System.out.println("No es mayor ni menor de 18");
//        }
//        // si el if solo tiene una linea de código, puede escribirse sin llaves.
//        if (edad == 18)
//            System.out.println("Es Menor de edad");

        //metodo equals en ves de == para objeto String
//        System.out.println("inserte texto1");
//        String texto1 = sc.next();
//        System.out.println("inserte texto2");
//        String texto2 = sc.next();
//
//        if (texto1.equalsIgnoreCase(texto2) ) {
//            System.out.println("los textos son iguales");
//        } else {
//            System.out.println("los textos no son iguales");
//        }
//
//        System.out.println(texto1.compareTo(texto2));

        System.out.println("Ingresse un porcentaje");
        int porcentaje = sc.nextInt();

//        if (porcentaje == 0) {
//            System.out.println("Pendiente");
//        }
//        else if (porcentaje >  0 && porcentaje <= 99) {
//            System.out.println("En Proceso");
//        }
//        else if (porcentaje == 100) {
//            System.out.println("Terminado");
//        }else {
//            System.out.println("Ingrese un valor correcto");
//        }

            if (porcentaje > 0) {
                System.out.println("pendiente");
                if (porcentaje <= 99) {
                    System.out.println("En Proceso");
                }else if (porcentaje == 100) {
                    System.out.println("Terminado");
                }else {
                    System.out.println("Ingrese un valor menor o igual a 100");
                }


            }else {
                System.out.println("ingrese un valor positivo");
            }

    }
}
