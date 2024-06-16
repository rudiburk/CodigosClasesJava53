package cl.praxis.miPrimerJava;
// comentarios en una sola linea
/* esto me permite
comentar más de una linea
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // tipos de datos primitivos.
        int numero1= 6;
        int numero2= 2;
        int numero3= 3;
        int suma;
        char caracter; // solo 1 caracter
        boolean booleano;
        float decimal1 = 1.7f;// hasta 7 decimales | si pongo solo el numero sin declararlo le pongu una f
        double decimal2; // más de 7 decimales | si pongo el numero sin declararlo le pongo una d
        long numeroLargo1 = 987654321;

        //Constantes ( final se utiliza para declarar constantes )
        final int DIAS_DE_LA_SEMANA = 7;

        //Tipos de datos que vienen de clases. hace referencia a los objetos de las clases de java
        String texto = "Hola mundo";
        String vacio= ""; // String vacio
        Double decimalLargo;
        Integer numeroEntero2 = 5;
        String texto2= new String("Hola mundos2 !"); // crea una referencia a un objeto
        String nulo=null; // String objeto nulo, != del vacio porque este no ocupa un espacio en memoria
        nulo= new String(); // inicializacion del objeto nulo
        System.out.println(texto + '!');
        System.out.println(texto2);

        //Operadores

        suma = numero1 + numero2;
        System.out.println(suma);
        System.out.println((numero1 + numero3)/decimal1);
        System.out.println(17.8);
        System.out.println(9/1.5f);
        System.out.println(3+5);
        vacio = texto + texto2;
        System.out.println(vacio);
        System.out.println(texto.substring(4, 7));
        numero3 = texto.length();
        System.out.println(numero3);
        System.out.println(vacio.startsWith("Hola"));
        System.out.println(vacio.indexOf("a"));

        //Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto");
        //texto = sc.nextLine();
        System.out.println(texto);

        // Casting o casteo de datos
        numero2 = (int) decimal1;
        System.out.println(numero2);
        vacio = String.valueOf( numeroLargo1);
        System.out.println(vacio);
        // Parseo
        numero2 = Integer.parseInt(vacio);
        System.out.println(numero2);





    }
}