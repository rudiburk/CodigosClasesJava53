package cl.praxis.miPrimerJava.Objects;

public class PuraSangre extends Caballo{
    private PuraSangre padre;
    private PuraSangre madre;

    public PuraSangre() {
    }


    public PuraSangre(String nombre, String fechaDeNacimiento, PuraSangre padre, PuraSangre madre) {
        this.padre = padre;
        this.madre = madre;
    }

    public PuraSangre getPadre() {
        return padre;
    }


    public PuraSangre getMadre() {
        return madre;
    }

}
