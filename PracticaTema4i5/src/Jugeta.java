import java.util.ArrayList;
import java.time.LocalDate;

public class Jugeta {
    private Marca marca;
    private String nom;
    private String descripcio;
    private String tipus;
    private String edat;
    // private int existencies;


    public Jugeta(Marca marca, String nom, String descripcio, String tipus, String edat) {
        this.marca = marca;
        this.nom = nom;
        this.descripcio = descripcio;
        this.tipus = tipus;
        this.edat = edat;

        Dades.llistaJugetes.add(this);
        // this.existencies = existencies;
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
        LocalDate date=LocalDate.now();
        double facturacio = 0.0;
        for(Ventes i: Dades.llistaVentes){
            if (i.getData().getMonthValue() == date.getMonthValue()-1) {
                facturacio = facturacio + ((i.getProducte().getPreu() * i.getProducte().getQuantitat()) * i.getDescompte());
            }
        }
        return facturacio;
    }

    public String proveeidorVenJugueta (){
//        for(PreuJugetes i: llistaJugetes){
//            System.out.println(i);
        return null;
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

    /*
  public ArrayList<Jugetes> void totalJuguetes (){
      for(int i = 0; i < totesJugetes.size(); i++){
          System.out.println(totesJugetes.get(i));
      }




    return null;
    } */

}
