package cl.praxis.miPrimerJava.desafio9;

public class Taxi extends Vehiculo {

    private int valorPasaje;


    public Taxi() {
    }

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public Taxi(String color, String patente) {
        super(color, patente);
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "valorPasaje=" + valorPasaje +
                '}';
    }

    public int pagarPasaje (int pasaje) {
        int vuelto = 0;

        if (pasaje >= getValorPasaje()) {
            vuelto = getValorPasaje() - pasaje;
        }
        return vuelto;
    }
}
