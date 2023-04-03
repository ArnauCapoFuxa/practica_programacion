package cat.paucasesnovescifp.swpro.practica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    private String nom;
    private Dades dades;

    public Client(Dades dades, String nom) {
        this.nom = nom;
        this.dades = dades;
        dades.afegirClient(this);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // metode per trobar la facturacio d'un client en el mes actual
    public double facturacioMesActual(){
        double facturacio = 0;
        LocalDate date=LocalDate.now();

        for(Ventes i: dades.getLlistaVentes()){
            if (i.getData().getMonthValue() == date.getMonthValue() && i.getClient().getNom() == this.getNom()) {
                facturacio = facturacio + ((i.getProducte().getPreu() * i.getProducte().getQuantitat()) * i.getDescompte());
            }
        }
        return facturacio;
    }

    // metode per trobar la facturacio d'un client a partir d'una fecha determinada
    public double facturacioApartirDe(int any, int mes, int dia){
        double facturacio = 0;
        LocalDate fecha = LocalDate.of(any, mes, dia);

        for(Ventes i: dades.getLlistaVentes()){
            if (i.getData().getYear() >= fecha.getYear()
                    && i.getData().getMonthValue() >= fecha.getMonthValue()
                    && i.getData().getDayOfMonth() >= fecha.getDayOfMonth()) {
                facturacio = facturacio + ((i.getProducte().getPreu() * i.getProducte().getQuantitat()) * 1-i.getDescompte());
            }
        }
        return facturacio;
    }



    // Metode per veure les compres d'un determinat client a partir d'una data determinada
    public ArrayList<Ventes> compresApartirDe(int any, int mes, int dia){
        LocalDate fecha = LocalDate.of(any, mes, dia);
        ArrayList<Ventes> llista = new ArrayList<>();

        for(Ventes i: dades.getLlistaVentes()){
            if (i.getClient().equals(this) && i.getData().isAfter(fecha)){
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

    public boolean equals(Client obj) {
        if (obj == this) { // Comprobación de referencia al mismo objeto
            return true;
        }
        if (!(obj instanceof Client)) { // Comprobación de que el objeto es de la clase Jugetes
            return false;
        }
        return nom.equals(obj.nom);
    }
}
