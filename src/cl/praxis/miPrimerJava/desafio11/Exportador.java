package cl.praxis.miPrimerJava.desafio11;


import java.io.IOException;
import java.util.ArrayList;

public abstract class Exportador {

    public abstract void exportar(ArrayList<Producto> listaProductos) throws IOException;

}