package cl.praxis.miPrimerJava.desafioUno;

import java.util.Scanner;

public class WhilePorDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1: While for diWhile
//        int i = 0;
//        while (i < 50) {
//            i += 1;
//            System.out.printf("Iteración %d\n", i);
//        }

//        int i = 0;
//        do{
//            i += 1;
//            System.out.printf("Iteración %d\n", i);
//
//            }while (i <50);
//
//**************************************************************************++

        // Ejercicio 2: Solo pares 1.

//        int numero= 0;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ingresa un numero entero");
//        numero = sc.nextInt();
//
//        for (int i = 0; i <= ((numero*2)-1); i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        // Solo pares 2
//        int numero= 0;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ingresa un numero entero");
//        numero = sc.nextInt();
//
//        for (int i = 2; i <= (numero*2); i++) {
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//****************************************************************************


 //       Ejercicio 3:  SumaImpar 1
//
//        int i=0;
//        int num;
//        int suma = 0;
//
//        System.out.println("Ingrese un número natural");
//        num = sc.nextInt();
//
//        for (i = 1; i <= num; i+=2) {
//            suma += i;
//        }
//        System.out.println(" la suma de los números impares del 0 al " + num + " es: " + suma);
//

//        Suma impar limite.
//        int i = 0;
//        int num1;
//        int num2;
//        int varAux = 0;
//        int suma = 0;
//
//        System.out.println("Ingrese el primer numero: ");
//        num1 = sc.nextInt();
//        System.out.println("Ingrese el segundo numero: ");
//        num2 = sc.nextInt();
//        while (num1 == num2) {
//            System.out.println("ingrese números distintos");
//            System.out.println("Ingrese el primer numero: ");
//            num1 = sc.nextInt();
//            System.out.println("Ingrese el segundo numero: ");
//            num2 = sc.nextInt();
//        }
//        if (num2 < num1) {
//            varAux = num2;
//            num2 = num1;
//            num1 = varAux;
//        }else{}
//
//
//        for (i = num1; i <= num2; i++) {
//            if (i % 2 != 0) {
//                suma += i;
//            } else {}
//        }
//        System.out.println(
//                "la suma de impares en el intervalo [" +num1+ " - " +num2+ "] es: " +suma );
//****************************************************************************************
        // secuencia de fibonacci:

        int num1=0;
        int num2=1;
        int suma=0;
        int digito;

        System.out.println("Digite um numero: ");
        digito = sc.nextInt();

        for(int i=1; i<=(digito+1); i++){
            System.out.println(num1);
            suma =num1+num2;
            num1=num2;
            num2=suma;
        }







    }}

