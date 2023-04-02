import java.time.LocalDate;

public class Compres {
    private Jugeta jugeta;
    private LocalDate data;
    private int quantitat;
    private double preu;
    private int descompte;

    public Compres(Jugeta jugeta, LocalDate data, int quantitat, double preu, int descompte) {
        this.jugeta = jugeta;
        this.data = data;
        this.quantitat = quantitat;
        this.preu = preu;
        this.descompte = descompte;
        // this.existencies = existencies;
        //totesJugetes.add(this);
        Dades.llistaCompres.add(this);
    }
    public Jugeta getJugeta(){
        return jugeta;
    }
    public LocalDate getData(){
        return data;
    }
    public int getQuantitat(){
        return quantitat;
    }
    public double getPreu(){
        return preu;
    }
    public int getDescompte(){
        return descompte;
    }
}