public class Reklama {
    private int id;
    private String adres;
    private String vyd;
    private int id_tochka;
    private int id_pracivnyk;

    public Reklama(int id, String adres, String vyd, TorhovaTochka tochka, Pracivnyk pracivnyk) {
        this.id = id;
        this.adres = adres;
        this.vyd = vyd;
        this.id_tochka = tochka.getId();
        this.id_pracivnyk = pracivnyk.getId();
    }


    public void printAdInfo() {
        System.out.println("Реклама типу " + vyd + " в точці №" + id_tochka);
    }
}
