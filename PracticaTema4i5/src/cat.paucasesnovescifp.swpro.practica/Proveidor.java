package cat.paucasesnovescifp.swpro.practica;

import java.util.ArrayList;

public class Proveidor {
    private String nom;
    private String contacte;
    private ArrayList<PreuJugeta> llistaJugetes;
    private Dades dades;
    public Proveidor(Dades dades, String nom, String contacte) {
        this.nom = nom;
        this.contacte = contacte;
        this.llistaJugetes = new ArrayList<>();
        this.dades = dades;
        dades.afegirProveidor(this);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<PreuJugeta> getLlistaJugetes() {
        return llistaJugetes;
    }

    // metode per afegir jugetes i preu directament
    public void afegirJugeta(Jugeta jugeta, double preu){
        PreuJugeta obj1 = new PreuJugeta(dades, jugeta, preu);
        llistaJugetes.add(obj1);
    }

    public String toString() {
        return "Proveidors{" +
                "nom='" + nom + '\'' +
                ", contacte='" + contacte + '\'' +
                '}';
    }
}