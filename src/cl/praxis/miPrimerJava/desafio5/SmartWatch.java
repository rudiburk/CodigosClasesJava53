package cl.praxis.miPrimerJava.desafio5;

import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> steps = new ArrayList<>();
        for (String arg : args) {
            steps.add(Integer.parseInt(arg));
        }
        ArrayList<Integer> filteredSteps = clearSteps(steps);
        int suma=0;

        for (int step : filteredSteps) {
            suma += step;
        }
        int averageSteps = suma/filteredSteps.size();
        System.out.println("El promedio de los pasos es: "+ averageSteps);
    }

    public static ArrayList<Integer> clearSteps(ArrayList<Integer> steps) {
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (int step : steps) {
            if (step >= 200 && step <= 100000) {
                filteredList.add(step);
            }
        }
        return filteredList;
    }
}






