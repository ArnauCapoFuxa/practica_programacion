import java.util.ArrayList;
import java.time.LocalDate;

public class Jugeta {
    private Marca marca;
    private String nom;
    private String descripcio;
    private String tipus;
    private RangEdat edat;
    public int existencies;


    public Jugeta(Marca marca, String nom, String descripcio, String tipus, RangEdat edat) {
        this.marca = marca;
        this.nom = nom;
        this.descripcio = descripcio;
        this.tipus = tipus;
        this.edat = edat;

        Dades.llistaJugetes.add(this);
        marca.llistaJugetes.add(this.nom);
    }

    public String getNom() {
        return nom;
    }

    // metode per trobar la facturacio total de la jugeta
    public double facturacioTotal() {
        double facturacio = 0.0;
        for(Ventes i: Dades.llistaVentes){
            facturacio = facturacio + ((i.getProducte().getPreu() * i.getProducte().getQuantitat()) * i.getDescompte());
        }
        return facturacio;
    }

    // metode per trobar la facturacio del mes anterior de una jugeta
    public double facturacioMesAnterior() {
        LocalDate fecha = LocalDate.now();
        double facturacio = 0.0;
        for(Ventes i: Dades.llistaVentes){
            if (i.getData().getMonthValue() == fecha.getMonthValue()-1 && this.equals(i.getJugeta())) {
                facturacio = facturacio + i.getPreuTotal();
            }
        }
        return facturacio;
    }

    public ArrayList<String> proveidors(){
        ArrayList<String> llitaProveidors= new ArrayList<>();
        llitaProveidors.add(this.getNom() + " = \n");
        for(Proveidor i: Dades.llistaProveidors){
            for(PreuJugeta j: i.getLlistaJugetes()){
                if(this.equals(j.getJugeta())){
                    llitaProveidors.add(i.toString() + " Preu = " + j.getPreu() + "\n");
                }
            }
        }
        return llitaProveidors;
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

    // Metode per veure les compres d'una determinada jugeta a partir d'una data determinada
    public ArrayList<Ventes> compresApartirDe(int any, int mes, int dia){
        LocalDate fecha = LocalDate.of(any, mes, dia);
        ArrayList<Ventes> llista = new ArrayList<>();

        for(Ventes i: Dades.llistaVentes){
            if (i.getJugeta().equals(this) && i.getData().isAfter(fecha)){
                llista.add(i);
            }
        }

        return llista;
    }
    public String llistaCompresApartirDe(int any, int mes, int dia) {
        String str = "";

        for(Ventes i: compresApartirDe(any, mes, dia)){
            str = str + "[" + i.getJugeta().getNom() + ", Cantidad= " + i.getQuantitat() + ", Preu= " + i.getPreu() + ", Descompte= " + i.getDescompte() + ", Preu Total= " + i.getPreuTotal() + "]\n";
        }

        return str;
    }
}
