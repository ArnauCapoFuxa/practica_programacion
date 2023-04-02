import java.time.LocalDate;

public class Client {
    private String nom;

    public Client(String nom) {
        this.nom = nom;
        Dades.llistaClients.add(this);
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

        for(Ventes i: Dades.llistaVentes){
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

        for(Ventes i: Dades.llistaVentes){
            if (i.getData().getYear() >= fecha.getYear()
                    && i.getData().getMonthValue() >= fecha.getMonthValue()
                    && i.getData().getDayOfMonth() >= fecha.getDayOfMonth()) {
                facturacio = facturacio + ((i.getProducte().getPreu() * i.getProducte().getQuantitat()) * i.getDescompte());
            }
        }
        return facturacio;
    }
}
