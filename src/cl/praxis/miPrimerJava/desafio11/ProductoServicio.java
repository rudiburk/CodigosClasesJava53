package cl.praxis.miPrimerJava.desafio11;

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

    public void listarProductos () {
        if (listaProductos.isEmpty()){
            System.out.println("No existen productos. Porfavor añade productos");
            Utilidad.espacio();
        }else {
            System.out.println("--------------------Lista de Productos----------------------");
            for (Producto producto : listaProductos) {
                System.out.println("Nombre del producto: " + producto.getArticulo());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Descripción: " + producto.getDescripcion());
                System.out.println("Código: " + producto.getCodigo());
                System.out.println("Talla: " + producto.getTalla());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Color: " + producto.getColor());
                System.out.println("---------------------------------------------------------");
            }
            Utilidad.espacio();
        }
    }

    public void agregarProductos () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String articulo = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        String precio = scanner.nextLine();

        System.out.println("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();

        System.out.println("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();

        System.out.println("Ingrese la talla del producto: ");
        String talla = scanner.nextLine();

        System.out.println("Ingrese la marca del producto: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el color del producto: ");
        String color = scanner.nextLine();

        Producto nuevoProducto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
        listaProductos.add(nuevoProducto);
        Utilidad.espacio();
        System.out.println("Producto agregado correctamente ");
        Utilidad.espacio();
        listarProductos();
        Utilidad.espacio();
        Utilidad.espacio();
    }


}