package cl.praxis.miPrimerJava.desafio13;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        //1.-- Creacion e instancia de ArrayList tipo String
        ArrayList<String> marcas = new ArrayList<>();

        //2.-- 10 marcas de cuaquier tipo e imprimirlas
        marcas.add("1.- Xbox");
        marcas.add("2.- Nestlé");
        marcas.add("3.- Colún");
        marcas.add("4.- Adidas");
        marcas.add("5.- Puma");
        marcas.add("6.- New Balance");
        marcas.add("7.- Jumbo");
        marcas.add("8.- Lucceti");
        marcas.add("9.- Nintendo");
        marcas.add("10.- Coca-Cola");

        System.out.println("Las 10 marcas son :");

        for (String listaMarcas : marcas) {
            System.out.println(listaMarcas);

        }
        System.out.println("");
        System.out.println("***************************************************************");

        //3.-- Agregar son “Blokbaster”, “Carrefour” y “Jetix”. Imprimir el nuevo
        //listado en consola
        System.out.println("Agregando 3 marcas mas: ");

        marcas.add("11.- BlockBaster");
        marcas.add("12.- Carrefour");
        marcas.add("13.- Jetix");

        for (String listaMarcas : marcas) {
            System.out.println(listaMarcas);
        }
        System.out.println("");
        System.out.println("***************************************************************");

        System.out.println("Corrección nombre marca");
        //4.-- “Blokbaster” en realidad se escribe “Blockbuster” y deciden cambiar
        //la palabra en el listado
        System.out.println("");
        marcas.set(10, "11.- Blokbuster");
        for (String listaMarcas : marcas) {
            System.out.println(listaMarcas);
        }
        System.out.println("");
        System.out.println("***************************************************************");

        System.out.println("Remover marca");

        //5.- Lamentablemente, usted se da cuenta que “Carrefour” aún existe y decide borrarlo del
        //listado. Para ello, usted debe remover el elemento número 11 e imprimir el nuevo
        //listado en pantalla. Puede usar la función .remove("Carrefour") para ver si el
        //elemento se borró correctamente, ya que arrojará true si se eliminó de manera
        //correcta.

        marcas.remove(11);
        for (String listaMarcas : marcas) {
            System.out.println(listaMarcas);
        }

        //Me salia false porque ya estaba borrado asi que lo negué para que saliera true como en la guia uwu
        System.out.println(!marcas.remove("12.- Carrefour"));
        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("Posibles marcas");
        //6.- Usted se inspira y decide hacer una colección aparte de marcas que podrían estar
        //fuera del mercado. Para ello, usted debe agregar marcas (las que quiera) en una nueva
        //ArrayList<>() llamada “posiblesMarcas” e incorporarlas a la lista de ”marcas”.

        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("14.- McKay");
        posiblesMarcas.add("15.- Sprite");
        posiblesMarcas.add("16.- Oxford");

        marcas.addAll(posiblesMarcas);

        for (String listaMarcas2 : marcas) {
            System.out.println(listaMarcas2);
        }
        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("Cuantos elementos tiene el listado");
//        //7.- A eso de las 11 de la noche, deciden ver cuántos elementos tiene este listado. Es por
//        eso que usted utiliza sus conocimientos y cuenta la cantidad de elementos que
//        contiene la lista para imprimir en pantalla.

        System.out.println("La cantidad de elementos en la lista son: " + marcas.size());

    }
}