package cl.praxis.miPrimerJava.clases;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Clase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número entre el 1 y 10");
//        int numero = sc.nextInt();
//
//        while (numero >= 1 && numero <= 10) {
//            System.out.println("el número debe ser entre el 1 y el 10, ingresa otra vez");
//            numero = sc.nextInt();
//        }
//        System.out.printf("El número es %d", numero);

        // ejemplo 2 de whilde
//        System.out.println("Ingresa tu pass");
//        String pass = sc.nextLine();
//        String validacion = "password";
//
//        while ( !pass.equals(validacion)) {
//            System.out.println("La pass es incorrecta, vuelva a ingresar su pass");
//            pass = sc.nextLine();
//        }
//        System.out.println("Adelante master");

        //ejemplo 1 do whilde

//        int numero;
//
//       do {
//           System.out.println("Introduzca un numero entre el 1 y el 10 ");
//           numero = sc.nextInt();
//       }while (numero < 1 || numero > 10);
//        System.out.printf("el numero es %d", numero);

        // ejemplo for

//        for (int i=0 ; i<=10 ; i++) {
//            System.out.println(i);
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


       // ejemplo wilde (sumatoria del 1 a 100) sería mas útil hacerlo con un for.
//        int contador = 0;
//        int suma = 0;
//
//        while (contador <=100) {
//            suma += contador;
//            contador += 1;
//        }
//        // a+= 1 --> a = a+1
//        System.out.println(suma);

            int suma2=0;
            for (int i=5; i<=100; i++) {
                suma2 +=i;
            }
        System.out.println(suma2);



    }
}
