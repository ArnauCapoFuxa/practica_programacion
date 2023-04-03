import java.time.LocalDate;

public class Compres {
    private Proveidor proveidor;
    private Jugeta jugeta;
    private LocalDate data;
    private int quantitat;
    private double preu;
    private double descompte;

    public Compres(Proveidor proveidor, Jugeta jugeta, int quantitat, double preu, double descompte, int any, int mes, int dia) {
        this.proveidor = proveidor;
        this.jugeta = jugeta;
        this.quantitat = quantitat;
        this.preu = preu;
        this.descompte = descompte;
        this.data = LocalDate.of(any, mes, dia);
        Dades.llistaCompres.add(this);
        // quan es fa una compra es suma a les existencies
        jugeta.existencies = jugeta.existencies + quantitat;
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
    public double getDescompte(){
        return descompte;
    }
}