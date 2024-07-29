package cl.praxis.miPrimerJava.desafio6;

import java.io.*;
import java.util.ArrayList;

public class Escritura {
    public static void main(String[] args) throws IOException {
        crearArchivo("directorio","fichero.txt");

    }

    public static void crearArchivo(String directorio, String fichero) throws IOException {

        File dir = new File("src/" + directorio);
        File archivo = new File(dir, fichero);

        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio.");
                return;
            }
        } else {
            System.out.println("El directorio ya existe.");
        }

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        try {
            FileWriter filew = new FileWriter(archivo);
            BufferedWriter buffereredWriter = new BufferedWriter(filew);
            for (String palabras : lista) {
                buffereredWriter.write(palabras);
                buffereredWriter.newLine();
            }
            buffereredWriter.close();
        }catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();

        }

    }
}