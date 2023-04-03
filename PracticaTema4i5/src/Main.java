public class Main {
    public static void main(String[] args) {
        // Inicialitzam les dades

        // Rangs d'edat
        RangEdat cero_tres = new RangEdat("0-3");
        RangEdat cuatre_vuit = new RangEdat("4-8");
        RangEdat vuit_dotze = new RangEdat("8-12");
        RangEdat dotze_devuit = new RangEdat("12-18");
        RangEdat mesDevuit = new RangEdat("+18");

        // Marques
        Marca nintendo = new Marca("Nintendo", "nintendo@nintendo.jp");
        Marca lego = new Marca("Lego", "lego@lego.com");
        Marca hotWheels = new Marca("Nerf", "nerf@nerf.es");

        // Jugetes
        Jugeta snes = new Jugeta(nintendo, "Super Nes", "consola", "video consola", dotze_devuit);
        Jugeta wii = new Jugeta(nintendo, "Wii", "consola", "video consola", dotze_devuit);
        Jugeta estrellaDeLaMuerte = new Jugeta(lego, "Lego Estrella De La Muerte", "set de lego star wars", "set de construcció", dotze_devuit);
        Jugeta terreneitor = new Jugeta(hotWheels, "Terreneitor", "Cotxe rc", "rc", dotze_devuit);

        // Proveidors
        Proveidor pccom = new Proveidor("Pccomponentes", "pccom@gmail");
        pccom.afegirJugeta(snes, 69.99);
        pccom.afegirJugeta(wii, 99.95);
        pccom.afegirJugeta(terreneitor, 24.5);
        // llista de jugetes i el preu de cada proveidor
        System.out.println(pccom.getLlistaJugetes().toString());

        // Compres, s'ha de fer una compra diferent per cada jugeta
        Compres compra1 = new Compres(pccom, wii, 7, 149.99, 0.15, 2023, 2, 1);
        Compres compra2 = new Compres(pccom, snes, 3, 99.99, 0.10, 2023, 3, 1);

        // Clients
        Client jugettos = new Client("Jugettos");

        // Ventes
        Ventes venta1 = new Ventes(jugettos, wii, 1, 199.99, 0.01, 2023, 3, 25);
        Ventes venta2 = new Ventes(jugettos, snes, 2, 129.99, 0.05, 2023, 3, 29);

        // Saber les existencies d'una jugeta
        System.out.println(wii.existencies);


        // Hem de poder saber les compres d'un determinat client a partir d'una data determinada.
        jugettos.compresApartirDe(2023, 3, 3);
        System.out.println(jugettos.llistaCompresApartirDe(2023, 3, 27));

        // Hem de poder saber les compres d'una determinada jugueta a partir d'una data determinada.
        estrellaDeLaMuerte.compresApartirDe(2023, 3, 20);
        System.out.println(estrellaDeLaMuerte.llistaCompresApartirDe(2023, 3, 20));

        // Volem saber els proveïdors que ens serveixen una determinada jugueta i a quin preu ho fan.
        System.out.println(snes.proveidors());

        // Necessitam saber la facturació d'un determinat client en el més actual.
        System.out.println(jugettos.facturacioMesActual());

        // Necessitam saber la facturació d'una determinada jugueta en el més anterior.
        System.out.println(snes.facturacioMesAnterior());

        // Hem de poder saber totes les juguetes que tenim d'una determinada marca.
        System.out.println(nintendo.llistaJugetes());
    }
}
