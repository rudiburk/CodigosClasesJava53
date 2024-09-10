package cl.praxis.miPrimerJava.Objects;

import java.util.List;

public class AutoConRuedas {
    // atributos del objeto
    private String modelo;
    private String marca;
    private String combustible;
    private String color;
    private String origen;
    private int anio;
    private boolean catalitico;
    private List<Rueda> ruedas;
// constructor vacio (nos permiten instanciar al objeto sin parametros )
    public AutoConRuedas() {
    }
// constructor completo nos permite instanciar al objeto con todos sus parametros.

    public AutoConRuedas(String modelo, List<Rueda> ruedas, boolean catalitico, int anio, String origen, String color, String combustible, String marca) {
        this.modelo = modelo;
        this.ruedas = ruedas;
        this.catalitico = catalitico;
        this.anio = anio;
        this.origen = origen;
        this.color = color;
        this.combustible = combustible;
        this.marca = marca;
    }
    //Setters & Getters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isCatalitico() {
        return catalitico;
    }

    public void setCatalitico(boolean catalitico) {
        this.catalitico = catalitico;
    }

    public List<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    // metodo toString

    @Override
    public String toString() {
        return "AutoConRuedas{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", combustible='" + combustible + '\'' +
                ", color='" + color + '\'' +
                ", origen='" + origen + '\'' +
                ", anio=" + anio +
                ", catalitico=" + catalitico +
                ", ruedas=" + ruedas +
                '}';
    }
}
