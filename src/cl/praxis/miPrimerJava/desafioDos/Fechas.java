package cl.praxis.miPrimerJava.desafioDos;

import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1;
        String date2;
        int day1, day2, month1, month2, year1, year2;


        System.out.println("Ingrese la fecha de nacimiento de la persona 1 en formato DD/MM/AAAA: ");
        date1 = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona 2 en formato DD/MM/AAAA: ");
        date2 = sc.nextLine();

        day1 = Integer.parseInt(date1.substring(0, 2));
        month1 = Integer.parseInt(date1.substring(3, 5));
        year1 = Integer.parseInt(date1.substring(6, 10));
        day2 = Integer.parseInt(date2.substring(0, 2));
        month2 = Integer.parseInt(date2.substring(3, 5));
        year2 = Integer.parseInt(date2.substring(6, 10));



        if ((year1 == year2) && (month1 == month2) && (day1 == day2)) {
            System.out.println("Ambos tienen la misma edad");
        } else if ((year1 > year2) || ((year1 == year2)
                    && (month1 > month2)) || ((year1 == year2)
                    && (month1 == month2) && (day1 > day2))) {
            System.out.println(" La persona 2 es mayor");
        } else {
            System.out.println(" La persona 1 es mayor");
        }

    }}



