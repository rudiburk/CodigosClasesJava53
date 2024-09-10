package cl.praxis.miPrimerJava.Objects;

public class CuartoDeMilla extends Caballo{
    public CuartoDeMilla padre;
    public CuartoDeMilla madre;

    public CuartoDeMilla() {
    }

    public CuartoDeMilla(CuartoDeMilla padre, CuartoDeMilla madre) {
        this.padre = padre;
        this.madre = madre;
    }

    public CuartoDeMilla getPadre() {
        return padre;
    }

    public void setPadre(CuartoDeMilla padre) {
        this.padre = padre;
    }

    public CuartoDeMilla getMadre() {
        return madre;
    }

    public void setMadre(CuartoDeMilla madre) {
        this.madre = madre;
    }

    @Override
    public String toString() {
        return "CuartoDeMilla{" +
                "padre=" + padre +
                ", madre=" + madre +
                '}';
    }
}
