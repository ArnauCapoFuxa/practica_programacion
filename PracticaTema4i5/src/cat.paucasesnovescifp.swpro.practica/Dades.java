package cat.paucasesnovescifp.swpro.practica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dades {
    private ArrayList<Marca> llistaMarca = new ArrayList<>();
    private ArrayList<Jugeta> llistaJugetes = new ArrayList<>();
    private ArrayList<PreuJugeta> llistaPreuJugetes = new ArrayList<>();
    private ArrayList<Proveidor> llistaProveidors = new ArrayList<>();
    private ArrayList<Client> llistaClients = new ArrayList<>();
    private ArrayList<Ventes> llistaVentes = new ArrayList<>();
    private ArrayList<Compres> llistaCompres = new ArrayList<>();

    public void afegirMarca(Marca marca){
        llistaMarca.add(marca);
    }
    public void afegirJugeta(Jugeta jugeta){
        llistaJugetes.add(jugeta);
    }
    public void afegirPreuJugetes(PreuJugeta preuJugeta){
        llistaPreuJugetes.add(preuJugeta);
    }
    public void afegirProveidor(Proveidor proveidor){
        llistaProveidors.add(proveidor);
    }
    public void afegirClient(Client client){
        llistaClients.add(client);
    }
    public void afegirVenta(Ventes venta){
        llistaVentes.add(venta);
    }
    public void afegirCompra(Compres compra){
        llistaCompres.add(compra);
    }
    public ArrayList<Ventes> getLlistaVentes() {
        return llistaVentes;
    }
    public ArrayList<Proveidor> getLlistaProveidors() {
        return llistaProveidors;
    }

    public void inicialitzacio(){
        // Inicialitzam les dades

        // Rangs d'edat
        RangEdat cero_tres = new RangEdat("0-3");
        RangEdat cuatre_vuit = new RangEdat("4-8");
        RangEdat vuit_dotze = new RangEdat("8-12");
        RangEdat dotze_devuit = new RangEdat("12-18");
        RangEdat mesDevuit = new RangEdat("+18");

        // Marques
        Marca nintendo = new Marca(this, "Nintendo", "nintendo@nintendo.jp");
        Marca lego = new Marca(this, "Lego", "lego@lego.com");
        Marca hotWheels = new Marca(this, "Nerf", "nerf@nerf.es");

        // Jugetes
        Jugeta snes = new Jugeta(this, nintendo, "Super Nes", "consola", "video consola", dotze_devuit);
        Jugeta wii = new Jugeta(this, nintendo, "Wii", "consola", "video consola", dotze_devuit);
        Jugeta estrellaDeLaMuerte = new Jugeta(this, lego, "Lego Estrella De La Muerte", "set de lego star wars", "set de construcció", dotze_devuit);
        Jugeta terreneitor = new Jugeta(this, hotWheels, "Terreneitor", "Cotxe rc", "rc", dotze_devuit);

        // Proveidors
        Proveidor pccom = new Proveidor(this, "Pccomponentes", "pccom@gmail");
        pccom.afegirJugeta(snes, 69.99);
        pccom.afegirJugeta(wii, 99.95);
        pccom.afegirJugeta(terreneitor, 24.5);
        // llista de jugetes i el preu de cada proveidor
        System.out.println(pccom.getLlistaJugetes().toString());

        // Compres, s'ha de fer una compra diferent per cada jugeta
        Compres compra1 = new Compres(this, pccom, wii, 7, 149.99, 0.15, 2023, 2, 1);
        Compres compra2 = new Compres(this, pccom, snes, 3, 99.99, 0.10, 2023, 3, 1);

        // Clients
        Client jugettos = new Client(this, "Jugettos");

        // Ventes
        Ventes venta1 = new Ventes(this, jugettos, wii, 1, 199.99, 0.01, 2023, 3, 25);
        Ventes venta2 = new Ventes(this, jugettos, snes, 2, 129.99, 0.05, 2023, 3, 29);

        // Saber les existencies d'una jugeta
        System.out.println(wii.getExistencies());

    }

    // Hem de poder saber les compres d'un determinat client a partir d'una data determinada.
    public ArrayList<Ventes> compresApartirDe(int any, int mes, int dia){
        LocalDate fecha = LocalDate.of(any, mes, dia);
        ArrayList<Ventes> llista = new ArrayList<>();

        for(Ventes i: llistaVentes){
            if (i.getClient().equals(this) && i.getData().isAfter(fecha)){
                llista.add(i);
            }
        }

        return llista;
    }



    public ArrayList<Marca> getLlistaMarca() {
        return llistaMarca;
    }

    public ArrayList<Jugeta> getLlistaJugetes() {
        return llistaJugetes;
    }

    public ArrayList<PreuJugeta> getLlistaPreuJugetes() {
        return llistaPreuJugetes;
    }

    public ArrayList<Client> getLlistaClients() {
        return llistaClients;
    }

    public ArrayList<Compres> getLlistaCompres() {
        return llistaCompres;
    }
}
