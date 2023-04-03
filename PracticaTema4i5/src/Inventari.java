import java.util.ArrayList;

public class Inventari {
    private Jugeta jugetesInv;
    private Marca marcaInv;
    private int quantitatInv;

    // lista para guardar los objetos de inv.
    private ArrayList<String> inventari1 = new ArrayList<>();

    // constructor
    public Inventari(Jugeta jugetesInv, int quantitatInv) {
        this.jugetesInv = jugetesInv;
        this.quantitatInv = quantitatInv;
    }

    public Jugeta getJugetesInv() {
        return jugetesInv;
    }

    public int getQuantitatInv() {
        return quantitatInv;
    }

    public void setJugetesInv(Jugeta jugetesInv) {
        this.jugetesInv = jugetesInv;
    }

    public Marca getMarcaInv() {
        return marcaInv;
    }

    public void setMarcaInv(Marca marcaInv) {
        this.marcaInv = marcaInv;
    }

    public void setQuantitatInv(int quantitatInv) {
        this.quantitatInv = quantitatInv;
    }

    public void quedaEnStock(int quantitatInv) {
        if (quantitatInv < 1) {
            System.out.println("No stock");
        } else {
            System.out.println("En inventario se tiene" + quantitatInv);
        }
    }
    public void agregarProducte(String producte) {
        inventari1.add(producte);
    }
    public void imprimirListaProductos() {
        System.out.println("List de productes:");
        for (String producte : inventari1) {
            System.out.println(producte);
        }
    }
}