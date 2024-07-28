package cl.praxis.miPrimerJava.desafio5;

import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {
        ArrayList<Integer> visitas = new ArrayList<>();
        for (String arg : args) {
            int visita = Integer.parseInt(arg);
            visitas.add(visita);
        }
        int promedio = Promedio(visitas);
        System.out.println("Para la entrada anterios, el resultado es: " + promedio);


    }
    public static int Promedio (ArrayList <Integer> visitas){
        int suma = 0;
        for (int visita: visitas){
            suma += visita;
        }
        return suma / visitas.size();
    }
}