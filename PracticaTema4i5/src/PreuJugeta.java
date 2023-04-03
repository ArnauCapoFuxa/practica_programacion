public class PreuJugeta {
    private Jugeta jugeta;
    private Double preu;
    private int quantitat;

    public PreuJugeta(Jugeta jugeta, Double preu) {
        this.jugeta = jugeta;
        this.preu = preu;
        Dades.llistaPreuJugetes.add(this);
    }

    //constructor amb quantitat
    public PreuJugeta(Jugeta jugeta, Double preu, int quantit) {
        this.jugeta = jugeta;
        this.preu = preu;
        this.quantitat = quantit;
        Dades.llistaPreuJugetes.add(this);
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
