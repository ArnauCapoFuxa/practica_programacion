package cat.paucasesnovescifp.swpro.practica;

import java.util.ArrayList;
import java.time.LocalDate;

public class Jugeta {
    private Marca marca;
    private String nom;
    private String descripcio;
    private String tipus;
    private RangEdat edat;
    private int existencies;
    private Dades dades;


    public Jugeta(Dades dades, Marca marca, String nom, String descripcio, String tipus, RangEdat edat) {
        this.marca = marca;
        this.nom = nom;
        this.descripcio = descripcio;
        this.tipus = tipus;
        this.edat = edat;
        this.dades = dades;
        dades.afegirJugeta(this);
        marca.afegriJugetaMarca(this);
    }

    public String getNom() {
        return nom;
    }

    public boolean equals(Jugeta obj) {
        if (obj == this) { // Comprobación de referencia al mismo objeto
            return true;
        }
        if (!(obj instanceof Jugeta)) { // Comprobación de que el objeto es de la clase Jugetes
            return false;
        }
        return marca.equals(obj.marca)
                && nom.equals(obj.nom)
                && descripcio.equals(obj.descripcio)
                && tipus.equals(obj.tipus)
                && edat.equals(obj.edat);
    }

    public int getExistencies() {
        return existencies;
    }
    public void setExistencies(int existencies) {
        this.existencies = existencies;
    }

    public String toString() {
        return "Jugeta{" +
                "marca=" + marca +
                ", nom='" + nom + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", tipus='" + tipus + '\'' +
                ", edat=" + edat +
                ", existencies=" + existencies +
                '}';
    }
}
