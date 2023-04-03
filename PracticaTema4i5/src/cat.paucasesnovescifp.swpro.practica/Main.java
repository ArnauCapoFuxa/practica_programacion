package cat.paucasesnovescifp.swpro.practica;

public class Main {
    public static void main(String[] args) {
        Dades dades = new Dades();
        dades.inicialitzacio();

        // llista de jugetes i el preu de cada proveidor
        System.out.println(dades.pccom.getLlistaJugetes().toString());


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

        dades.getLlistaJugetes().
    }
}
