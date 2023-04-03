package cat.paucasesnovescifp.swpro.practica;

import java.time.LocalDate;

public class Ventes {

    private Client client;
    private LocalDate data;
    private int quantitat;
    private PreuJugeta producte;
    private double descompte;
    private double preuTotal;

    public Ventes(Dades dades, Client client, Jugeta jugeta,int quantitat,  double preu, double descompte, int any, int mes, int dia) {
        this.client = client;
        this.quantitat = quantitat;
        this.descompte = descompte;
        this.data = LocalDate.of(any, mes, dia);
        this.producte = new PreuJugeta(dades, jugeta, preu);
        // quan es fa una venta es resta de les existencies
        jugeta.setExistencies(jugeta.getExistencies() - quantitat);
        this.preuTotal = (quantitat * preu) * (1-descompte);
        dades.afegirVenta(this);
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

    public String toString() {
        return "Ventes{" +
                "client=" + client +
                ", quantitat=" + quantitat +
                ", producte=" + producte +
                ", descompte=" + descompte +
                ", preuTotal=" + preuTotal +
                '}';
    }
}

