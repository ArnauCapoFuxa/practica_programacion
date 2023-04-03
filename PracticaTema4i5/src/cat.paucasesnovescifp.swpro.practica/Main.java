package cat.paucasesnovescifp.swpro.practica;

public class Main {
    public static void main(String[] args) {
        Dades dades = new Dades();
        dades.inicialitzacio();

        // Per saber les existencies de cada jugeta
        System.out.println(dades.getJugeta("Wii").getExistencies());
        // Per saber les jugetes que ens ofereix cada proveidor i a quin preu
        System.out.println(dades.getProveidor("Pccomponentes").getLlistaJugetes());


        // Hem de poder saber les compres d'un determinat client a partir d'una data determinada.
        System.out.println(dades.compresClientApartirDe(dades.getClient("Jugettos"), 2023, 3, 3));
        // Hem de poder saber les compres d'una determinada jugueta a partir d'una data determinada.
        System.out.println(dades.compresJugetesApartirDe(dades.getJugeta("Wii"), 2023, 3, 3));
        // Volem saber els proveïdors que ens serveixen una determinada jugueta i a quin preu ho fan.
        System.out.println(dades.proveidorsDeJugeta(dades.getJugeta("Super Nes")));
        // Necessitam saber la facturació d'un determinat client en el més actual.
        System.out.println(dades.facturacioClientMesActual(dades.getClient("Jugettos")));
        // Necessitam saber la facturació d'una determinada jugueta en el més anterior.
        System.out.println(dades.facturacioJugetaMesAnterior(dades.getJugeta("Wii")));
        // Hem de poder saber totes les juguetes que tenim d'una determinada marca.
        System.out.println(dades.llistaJugetesMarca(dades.getMarca("Nintendo")));
    }
}
