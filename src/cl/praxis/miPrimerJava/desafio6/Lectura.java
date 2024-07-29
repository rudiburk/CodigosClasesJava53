package cl.praxis.miPrimerJava.desafio6;

import java.io.*;
import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese el nombre del archivo: ");
            String nombreArchivo = sc.nextLine();
            System.out.println("Ingrese la palabra a buscar: ");
            String palabra = sc.nextLine();

            buscarTexto(nombreArchivo, palabra);

        } catch (IOException e) {
            System.out.println("Error al leer la entrada del usuario.");
            e.printStackTrace();
        }
    }

    public static void buscarTexto (String nombreFichero, String palabra) throws FileNotFoundException {

        File archivo = new File("src/directorio/" + nombreFichero);

        if (!archivo.exists()) {
            System.out.println("El fichero ingresado no existe");
            return;
        }

        try (BufferedReader buffRead = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contador = 0;
            while ((linea = buffRead.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String palabraArchivo : palabras) {
                    if (palabraArchivo.equals(palabra)) {
                        contador++;
                    }
                }
            }System.out.println("La palabra \"" + palabra + "\" se encuentra " + contador + " veces en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }

    }
}