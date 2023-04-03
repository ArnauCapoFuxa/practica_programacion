package cat.paucasesnovescifp.swpro.practica;

public class ProveidorPreu {
    private Proveidor proveidor;
    private Jugeta jugeta;
    private double preu;

    public ProveidorPreu(Proveidor proveidor, Jugeta jugeta, double preu) {
        this.proveidor = proveidor;
        this.jugeta = jugeta;
        this.preu = preu;
    }

    public String toString() {
        return "ProveidorPreu{" +
                "proveidor=" + proveidor +
                ", preu=" + preu +
                '}';
    }
}
