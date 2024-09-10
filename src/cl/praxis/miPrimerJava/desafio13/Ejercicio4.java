package cl.praxis.miPrimerJava.desafio13;


import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {
    public static void main(String[] args) {
        Queue<String> juegos = new LinkedList();
        System.out.println("Lista de juegos: ");
        System.out.println("");
        juegos.add("Tombo");
        juegos.add("Congelados");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");

        for (String juego : juegos) {
            System.out.println(juego);
        }
        System.out.println("");
        System.out.println("La cantidad de juegos en la lista son: " + juegos.size());
    }
}