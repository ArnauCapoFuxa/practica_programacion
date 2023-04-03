import java.util.ArrayList;

public class Proveidor {
    private String nom;
    private String contacte;
    private ArrayList<PreuJugeta> llistaJugetes;
    public Proveidor(String nom, String contacte) {
        this.nom = nom;
        this.contacte = contacte;
        this.llistaJugetes = new ArrayList<>();
        Dades.llistaProveidors.add(this);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<PreuJugeta> getLlistaJugetes() {
        return llistaJugetes;
    }

    // metode per afegir jugetes i preu directament
    public void afegirJugeta(Jugeta jugeta, double preu){
        PreuJugeta obj1 = new PreuJugeta(jugeta, preu);
        llistaJugetes.add(obj1);
    }

    public String toString() {
        return "Proveidors{" +
                "nom='" + nom + '\'' +
                ", contacte='" + contacte + '\'' +
                '}';
    }
}