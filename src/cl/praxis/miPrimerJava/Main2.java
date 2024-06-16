package cl.praxis.miPrimerJava;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nombre, apellido, direccion, ciudad;
    int numDireccion, telefono;

        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = scanner.nextLine();
        System.out.println("Ingrese el direccion: ");
        direccion = scanner.nextLine();
        System.out.println("Ingrese el ciudad: ");
        ciudad = scanner.nextLine();
        System.out.println("Ingrese el numero direccion: ");
        numDireccion = scanner.nextInt();
        System.out.println("Ingrese el telefono: ");
        telefono = scanner.nextInt();

        String etiqueta = String.format(
                "De:%s %s\n"
                +"Dirección:%s %d\n"
                +"Ciudad:%s\n"
                +"Contacto:%d\n",
                nombre, apellido, direccion, numDireccion, ciudad, telefono);
        System.out.println(etiqueta);
    }
}
