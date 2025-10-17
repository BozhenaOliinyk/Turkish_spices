public class Pracivnyk {
    private int id;
    private String prizvyshche;
    private String imya;
    private String pobatkovi;
    private String status;
    private int zmina;
    private int id_tochka;
    private double nomerTelefonu;

    public Pracivnyk(int id, String prizvyshche, String imya, String pobatkovi,
                     String status, int zmina, TorhovaTochka tochka, double nomerTelefonu) {
        this.id = id;
        this.prizvyshche = prizvyshche;
        this.imya = imya;
        this.pobatkovi = pobatkovi;
        this.status = status;
        this.zmina = zmina;
        this.id_tochka = tochka.getId();
        this.nomerTelefonu = nomerTelefonu;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return prizvyshche + " " + imya + " " + pobatkovi;
    }
}
