package cl.praxis.miPrimerJava.desafio12;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    public ProductoServicio() {
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    public void editarProducto(int index, Scanner sc) {
        if (index >= 0 && index < listaProductos.size()) {
            Producto producto = listaProductos.get(index);
            Utilidad.linea();
            Utilidad.esperar();
            System.out.println("Editando producto: \n" + producto + "\n");
            boolean continuar = true;
            while (continuar) {
                System.out.println("1.-El nombre del articulo actual es: " + producto.getArticulo());
                System.out.println("2.-El código del producto: " + producto.getCodigo());
                System.out.println("3.-El color del producto: " + producto.getColor());
                System.out.println("4.-La descripción del producto: " + producto.getDescripcion());
                System.out.println("5.-La marca del producto: " + producto.getMarca());
                System.out.println("6.-El precio del producto: " + producto.getPrecio());
                System.out.println("7.-La talla del producto: " + producto.getTalla());
                System.out.println("8.-Salir");
                Utilidad.linea();
                System.out.println("Ingrese la opción a editar de los datos del producto:");
                int opcion = sc.nextInt();
                Utilidad.limpiar();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nuevo artículo: ");
                        producto.setArticulo(sc.nextLine());
                        break;

                    case 2:
                        System.out.print("Ingrese el nuevo código: ");
                        producto.setCodigo(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Ingrese el nuevo color: ");
                        producto.setColor(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("Ingrese la nueva descripción: ");
                        producto.setDescripcion(sc.nextLine());
                        break;
                    case 5:
                        System.out.print("Ingrese la nueva marca: ");
                        producto.setMarca(sc.nextLine());
                        break;
                    case 6:
                        System.out.print("Ingrese el nuevo precio: ");
                        producto.setPrecio(sc.nextLine());
                        break;
                    case 7:
                        System.out.print("Ingrese la nueva talla: ");
                        producto.setTalla(sc.nextLine());
                        break;

                    case 8:
                        System.out.println("Saliendo del Menu Editar.");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        continue;
                }

            }
        }

    }

    public void importarProductos(ArrayList<Producto> productosImportados) {
        listaProductos.addAll(productosImportados);
        System.out.println("Datos cargados correctamente en la lista");
    }

}