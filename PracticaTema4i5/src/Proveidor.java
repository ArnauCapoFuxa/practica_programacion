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

    public void setLlistaJugetes(ArrayList<PreuJugeta> llistaJugetes) {
        this.llistaJugetes = llistaJugetes;
    }

    public ArrayList<PreuJugeta> getLlistaJugetes() {

        return llistaJugetes;
    }
    // metode per passar la llista a string
    public String stringllista(){
        String str = "Preu jugetes, distribuidor " + nom + ": \n";
        for (PreuJugeta i : llistaJugetes) {
            str = str.concat("[" + i.getJugeta().getNom() + "] = [" +i.getPreu() + "]\n");
            System.out.println(i);
        }
        return str;
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