package cl.praxis.miPrimerJava.desafio11;

import com.sun.source.doctree.EscapeTree;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private ProductoServicio productoServicio;

    private Exportador exportador;


    public Menu () {
        sc = new Scanner(System.in);
        productoServicio = new ProductoServicio();
        exportador = new ExportadorTxt();
    }

    public void mostrarMenu () throws IOException {
        int opcion;

        do {
            System.out.println("----------------Menú--------------");
            Utilidad.espacio();
            System.out.println("1.- Listar Producto");
            System.out.println("2.- Agregar Producto");
            System.out.println("3.- Exportar Datos");
            System.out.println("4.- Salir");
            Utilidad.espacio();
            System.out.println("----------------------------------");
            Utilidad.espacio();
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    productoServicio.listarProductos();
                    break;
                case 2:
                    productoServicio.agregarProductos();
                    break;
                case 3:
                    exportador.exportar(productoServicio.getListaProductos());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 4) ;
    }
}