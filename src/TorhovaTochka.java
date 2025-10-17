public class TorhovaTochka {
    private int id;
    private String nazva;
    private String adres;

    private static int count = 0;

    public TorhovaTochka(int id, String nazva, String adres) {
        this.id = id;
        this.nazva = nazva;
        this.adres = adres;
        count++;
    }

    public int getId() {
        return id;
    }

    public void printInfo() {
        System.out.println("Торгова точка: " + nazva + ", адреса: " + adres);
    }

    public String getNazva() {
        return nazva;
    }

    public static int getCount() {
        return count;
    }
}
