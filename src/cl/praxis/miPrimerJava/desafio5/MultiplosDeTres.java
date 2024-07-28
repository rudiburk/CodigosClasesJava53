package cl.praxis.miPrimerJava.desafio5;

import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (String arg : args) {
            int numero = Integer.parseInt(arg);
            numeros.add(numero);
        }
        int suma = sumar(numeros);
        int promedio = promediar(numeros);
        System.out.println(suma);
        System.out.println(promedio);

    }
    public static int sumar (ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0){
                suma += numero;
            }
        }
        return suma;
    }

    public static int promediar (ArrayList<Integer> numeros) {
        int suma = 0;
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0){
                suma += numero;
                contador++;
            }
        }
        if (contador == 0) {
            return 0;
        }
        return suma / contador;
    }
}