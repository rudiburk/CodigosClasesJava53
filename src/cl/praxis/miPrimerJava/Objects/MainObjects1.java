package cl.praxis.miPrimerJava.Objects;

import java.util.ArrayList;
import java.util.List;

public class MainObjects1 {
    public static void main(String[] args) {

        AutoConRuedas auto1 = new AutoConRuedas();
        // Instancia de Ruedas, 5 objetos
        Rueda rueda1 = new Rueda("Michelin", "nieve", 15);
        Rueda rueda2 = new Rueda("Michelin", "nieve", 15);
        Rueda rueda3 = new Rueda("Michelin", "nieve", 15);
        Rueda rueda4 = new Rueda("Michelin", "nieve", 15);
        Rueda ruedaRepuesto = new Rueda("Michelin", "nieve", 15);
        // Lista con la ruedas
        List<Rueda> ruedas = new ArrayList<>();
        ruedas.add(rueda1);
        ruedas.add(rueda2);
        ruedas.add(rueda3);
        ruedas.add(rueda4);
        ruedas.add(ruedaRepuesto);
        // Seteo de atributos de auto1
        auto1.setAnio(2024);
        auto1.setCatalitico(true);
        auto1.setColor("Azul");
        auto1.setCombustible("95 octanos");
        auto1.setMarca("Ñuñuki");
        auto1.setModelo("spresso");
        auto1.setOrigen("India");
        auto1.setRuedas(ruedas);

        System.out.println(auto1.toString());

    }
}
