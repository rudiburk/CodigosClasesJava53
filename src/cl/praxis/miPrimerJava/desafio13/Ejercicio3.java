package cl.praxis.miPrimerJava.desafio13;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {

        Map<String, Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman ", 100);
        golosinas.put("Trululú ", 100);
        golosinas.put("Centella ", 100);
        golosinas.put("Kilate ", 50);
        golosinas.put("Miti-miti ", 30);
        golosinas.put("Traga traga ", 150);
        golosinas.put("Tabletón ", 5);

        System.out.println("Listado de golosinas: ");
        System.out.println("");

        for (Map.Entry<String,Integer> entry : golosinas.entrySet()) {
            System.out.println(entry.getKey() + "a " + entry.getValue() + " pesos");
        }
        System.out.println("");

        System.out.println("****************************************");
        System.out.println("");
        System.out.println("Listado de las golosinas que cuestan menos de 100 pesos: ");
        System.out.println("");

        for (Map.Entry<String,Integer> entry : golosinas.entrySet()) {
            if(entry.getValue() < 100){
                System.out.println(entry.getKey()+ "a " + entry.getValue() + " pesos");
            }
        }
    }
}