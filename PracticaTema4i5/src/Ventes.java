import java.time.LocalDate;

public class Ventes {

    private Client client;
    private LocalDate data;
    private PreuJugeta producte;
    private Double descompte;


    public Ventes(Client client, Jugeta jugeta, double preu, int quantitat, Double descompte, int any, int mes, int dia) {
        this.client = client;
        this.descompte = descompte;
        this.data = LocalDate.of(any, mes, dia);
        this.producte = new PreuJugeta(jugeta, preu, quantitat);


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



}

