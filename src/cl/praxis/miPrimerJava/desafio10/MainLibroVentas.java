package cl.praxis.miPrimerJava.desafio10;

public class mainLibroVentas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tiare Linco", 28);
        Vehiculo vehiculo = new Vehiculo("ASDF11");
        LibroVentas libroVentas = new LibroVentas("venta1","05/06/2024");
        String directorio = "C:/Users/tmlin/IdeaProjects/MiPrimerProyectoJava1/ficheros";

        libroVentas.guardarVenta(cliente,vehiculo, directorio);
    }
}