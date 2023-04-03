package cat.paucasesnovescifp.swpro.practica;

import java.time.LocalDate;

public class Compres {
    private Proveidor proveidor;
    private Jugeta jugeta;
    private LocalDate data;
    private int quantitat;
    private double preu;
    private double descompte;

    public Compres(Dades dades, Proveidor proveidor, Jugeta jugeta, int quantitat, double preu, double descompte, int any, int mes, int dia) {
        this.proveidor = proveidor;
        this.jugeta = jugeta;
        this.quantitat = quantitat;
        this.preu = preu;
        this.descompte = descompte;
        this.data = LocalDate.of(any, mes, dia);
        dades.afegirCompra(this);
        // quan es fa una compra es suma a les existencies
        jugeta.setExistencies(jugeta.getExistencies() + quantitat);
    }
}