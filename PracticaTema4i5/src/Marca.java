import java.util.ArrayList;

public class Marca {
    private String nom;
    private String contacte;
    //private Jugetes jugetaMarca;

    public Marca(String nom, String contacte) {
        this.nom = nom;
        this.contacte = contacte;
        Dades.llistaMarca.add(this);
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContacte() {
        return contacte;
    }

    public void setContacte(String contacte) {
        this.contacte = contacte;
    }

   /* public Marca(String nom, String contacte, Jugetes jugetaMarca) {
        this.nom = nom;
        this.contacte = contacte;
        //this.jugetaMarca = jugetaMarca;
    }*/



    public void marcaModelos(){
        String busca = "Nintendo";
        boolean encuentra = Dades.llistaMarca.contains(busca);
        if (encuentra){
            System.out.println(busca);
        } else {
            System.out.println("no existe");
        }

    }


}
