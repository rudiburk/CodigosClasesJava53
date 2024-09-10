package cl.praxis.miPrimerJava.desafio9;

import java.util.Arrays;

public class MiniBus extends Bus{

    private String tipoViaje;

    public MiniBus() {
    }

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "tipoViaje='" + tipoViaje + '\'' +
                '}';
    }

    public void imprimeBus() {
        System.out.println("color: " + super.getColor());
        for (String s : Arrays.asList("patente: " + super.getPatente(), "cantidadDeAsientos: " + super.getCantidadDeAsientos(), "tipo de viaje: " + getTipoViaje())) {
            System.out.println(s);
        }

    }

}