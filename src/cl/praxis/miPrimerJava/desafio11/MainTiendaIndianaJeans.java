package cl.praxis.miPrimerJava.desafio11;
import java.io.IOException;
public class MainTiendaIndianaJeans {
    static Menu menu = new Menu();
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenidos a Tienda Indiana Jeans");
        Utilidad.esperar();
        Utilidad.espacio();
        menu.mostrarMenu();

    }
}