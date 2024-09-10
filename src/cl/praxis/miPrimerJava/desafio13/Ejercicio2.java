package cl.praxis.miPrimerJava.desafio13;


import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args) {

        //1.-Set invitados con treeSet
        Set<String> invitados = new TreeSet<>();

        //2.- añadir invitados
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        //3.- añadir 3 ex compañeros en posibles invitados, y sout

        Set<String> posiblesInvitados = new TreeSet<>();

        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);

        for (String listaInvitados: invitados) {
            System.out.println(listaInvitados);
        }
        System.out.println("**********************************");
        System.out.println("Lista sin Jorge");

        //4.- eliminar a jorge

        invitados.remove("Jorge");
        for (String listaInvitados: invitados) {
            System.out.println(listaInvitados);
        }

    }
}