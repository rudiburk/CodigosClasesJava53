package cl.praxis.miPrimerJava.desafio10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LibroVentas {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVentas() {
    }

    public LibroVentas(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo, String directorio){

        File dir = new File (directorio);
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

        String nombreArchivo = "ficheros/" + this.nombreVenta + "_venta.txt";

        ArrayList<String> info = new ArrayList<String>();
        info.add("Patente Vehículo: " + vehiculo.getPatente());
        info.add("Edad Cliente: " + cliente.getEdad());
        info.add("Fecha Venta: " + this.fechaVenta);
        info.add("Nombre Venta: "+ this.nombreVenta);

        try {
            FileWriter filew = new FileWriter(nombreArchivo);
            BufferedWriter buffereredWriter = new BufferedWriter(filew);
            for (String datos : info) {
                buffereredWriter.write(datos);
                buffereredWriter.newLine();
            }
            buffereredWriter.close();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();

        }

        System.out.println("Se ha guardado la venta");
    }

}