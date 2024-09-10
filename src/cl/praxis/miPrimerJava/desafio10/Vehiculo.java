package cl.praxis.miPrimerJava.desafio10;

public class Vehiculo {
    private String patente;

    public Vehiculo() {
    }

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                '}';
    }
}
