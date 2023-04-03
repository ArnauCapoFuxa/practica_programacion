import java.time.LocalDate;

public class Ventes {

    private Client client;
    private LocalDate data;
    private int quantitat;
    private PreuJugeta producte;
    private double descompte;
    private double preuTotal;


    public Ventes(Client client, Jugeta jugeta,int quantitat,  double preu, double descompte, int any, int mes, int dia) {
        this.client = client;
        this.quantitat = quantitat;
        this.descompte = descompte;
        this.data = LocalDate.of(any, mes, dia);
        this.producte = new PreuJugeta(jugeta, preu, quantitat);
        // quan es fa una venta es resta de les existencies
        jugeta.existencies = jugeta.existencies - quantitat;
        this.preuTotal = (quantitat * preu) * (1-descompte);
        Dades.llistaVentes.add(this);
    }


    // GETTERS
    public Client getClient() {
        return client;
    }
    public LocalDate getData() {
        return data;
    }
    public PreuJugeta getProducte() {
        return producte;
    }
    public Double getDescompte() {
        return descompte;
    }
    public Jugeta getJugeta() {
        return producte.getJugeta();
    }
    public int getQuantitat() {
        return quantitat;
    }
    public double getPreu() {
        return producte.getPreu();
    }
    public double getPreuTotal() {
        return preuTotal;
    }
}

