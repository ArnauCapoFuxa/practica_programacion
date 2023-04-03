package cat.paucasesnovescifp.swpro.practica;

public class PreuJugeta {
    private Jugeta jugeta;
    private Double preu;
    private int quantitat;

    public PreuJugeta(Dades dades, Jugeta jugeta, Double preu) {
        this.jugeta = jugeta;
        this.preu = preu;
        dades.afegirPreuJugetes(this);
    }

    public Jugeta getJugeta() {
        return jugeta;
    }

    public Double getPreu() {
        return preu;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public String toString() {
        return "PreuJugetes{" +
                "jugeta=" + jugeta.getNom() +
                ", preu=" + preu +
                '}';
    }

}
