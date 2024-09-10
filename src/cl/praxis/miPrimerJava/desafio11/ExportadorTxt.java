package cl.praxis.miPrimerJava.desafio11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends ExportarTxt {

    @Override
    public void exportar(ArrayList<Producto> listaProductos) throws IOException {
        String nombreArchivo = "productos.txt";

        if(listaProductos.isEmpty()){
            System.out.println("No existen productos para exportar. Por favor agrega productos.");
            Utilidad.espacio();
        }else {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
                for (Producto producto : listaProductos) {
                    writer.write(producto.toString());
                    writer.newLine();
                }
                System.out.println("Se ha exportado correctamente a productos.txt");
            } catch (IOException e) {
                System.out.println("Error al exportar los productos: " + e.getMessage());
                throw e;
            }
        }

    }
}