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

    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return getNom().equals(client.getNom());
    }
}
