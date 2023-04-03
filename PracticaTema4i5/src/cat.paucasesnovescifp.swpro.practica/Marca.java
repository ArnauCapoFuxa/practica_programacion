package cat.paucasesnovescifp.swpro.practica;

import java.util.ArrayList;

public class Marca {
    private String nom;
    private String contacte;
    private ArrayList<Jugeta> llistaJugetes = new ArrayList<>();

    public Marca(Dades dades, String nom, String contacte) {
        this.nom = nom;
        this.contacte = contacte;
        dades.afegirMarca(this);
    }

    public String llistaJugetes() {
        return nom +  " = " + llistaJugetes;
    }

    public void afegriJugetaMarca(Jugeta jugeta){
        llistaJugetes.add(jugeta);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nom='" + nom + '\'' +
                ", contacte='" + contacte + '\'' +
                '}';
    }
}
