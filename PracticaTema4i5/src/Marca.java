import java.util.ArrayList;

public class Marca {
    private String nom;
    private String contacte;
    public ArrayList<String> llistaJugetes = new ArrayList<>();

    public Marca(String nom, String contacte) {
        this.nom = nom;
        this.contacte = contacte;
        Dades.llistaMarca.add(this);
    }

    public String toString() {
        return "Marca{" +
                "nom='" + nom + '\'' +
                ", contacte='" + contacte + '\'' +
                '}';
    }

    public String llistaJugetes() {
        return nom +  " = " + llistaJugetes;
    }
}
