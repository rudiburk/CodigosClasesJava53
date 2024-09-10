package cl.praxis.miPrimerJava.desafio12;

import java.util.ArrayList;
import java.util.Scanner;

import static cl.praxis.miPrimerJava.desafio12.Utilidad.esperar;

public class Menu {
    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        ArchivoServicio archivoServicio = new ArchivoServicio();
        int opcion;
        Scanner sc = new Scanner(System.in);

        Utilidad.esperar();
        Utilidad.espacio();

        while (true) {


            System.out.println("------------Menú--------------------");
            System.out.println("1 Listar Producto");
            System.out.println("2 Editar Datos");
            System.out.println("3 Importar Datos");
            System.out.println("4 Salir");
            Utilidad.linea();
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt();
            Utilidad.espacio();
            Utilidad.esperar();

            switch (opcion) {
                case 1:
                    Utilidad.linea();
                    System.out.println("Datos del Producto: ");
                    productoServicio.listarProductos();
                    Utilidad.espacio();
                    Utilidad.linea();
                    Utilidad.esperar();
                    break;

                case 2:
                    Utilidad.linea();
                    System.out.println("Editar Producto");
                    productoServicio.listarProductos();
                    System.out.print("Seleccione el número del producto a editar: ");
                    int indice = sc.nextInt() - 1;
                    Utilidad.limpiar();
                    productoServicio.editarProducto(indice, sc);
                    Utilidad.espacio();
                    Utilidad.linea();
                    Utilidad.esperar();
                    break;

                case 3:
                    Utilidad.linea();
                    System.out.println("Importar Datos");
                    System.out.print("Ingresa la ruta en donde se encuentra el archivo ProductosImportados.csv: ");
                    sc.nextLine();  // Limpiar el buffer
                    String rutaArchivo = sc.nextLine();
                    ArrayList<Producto> productosImportados = archivoServicio.cargarDatos(rutaArchivo);
                    productoServicio.importarProductos(productosImportados);
                    System.out.println(productosImportados);
                    Utilidad.espacio();
                    Utilidad.linea();
                    Utilidad.esperar();
                    break;

                case 4:
                    Utilidad.linea();
                    System.out.println("Saliendo...");
                    Utilidad.espacio();
                    Utilidad.esperar();
                    Utilidad.linea();
                    Utilidad.cerrar();
                    return;

                default:
                    Utilidad.linea();
                    System.out.println("Opción no válida. Intente nuevamente.");
                    Utilidad.espacio();
                    Utilidad.linea();
                    Utilidad.esperar();
            }

        }
    }
}