import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Marca nintendo = new Marca("Nintendo", "nintendo@nintendo");

        Jugeta snes = new Jugeta(nintendo, "Super Nes", "consola", "video consola", "11-13");
        Jugeta wii = new Jugeta(nintendo, "Wii", null, null, null);

        Proveidor pccom = new Proveidor("Pccomponentes", "pccom@gmail");
        ArrayList<PreuJugeta> llistaJugetes = new ArrayList<>();
        //PreuJugetes compraSnes= new PreuJugetes(snes, 99.99);
        //PreuJugetes compraWii = new PreuJugetes(wii, 0.99);
        //llistaJugetes.add(compraSnes);
        //llistaJugetes.add(compraWii);
        pccom.afegirJugeta(snes, 99.95);
        //pccom.setLlistaJugetes(llistaJugetes);

        System.out.println(pccom.stringllista());
        System.out.println(pccom.getLlistaJugetes().toString());


        //LocalDate fecha2 = LocalDate.of(2002, 01, 31);

        //System.out.println(fecha2.getMonthValue());
        // com pasam sa fecha determinada que cercam?

        //Jugetes.totesJugetes.toString();

        //Ventes a clients
        Client pep = new Client("Pep");
        Ventes venta1 = new Ventes(pep, snes, 4.99, 5, 0.33, 2023, 3, 20);

        System.out.println(snes.facturacioTotal());
        System.out.println(snes.facturacioMesAnterior());
        System.out.println(pep.facturacioMesActual());
        System.out.println(snes.proveidors());
        System.out.println(pep.facturacioApartirDe(2023, 3, 19));

    }
}
