public class Pereviznyk {
    private int id;
    private String prizvyshche;
    private String imya;
    private String pobatkovi;
    private double nomerTelefonu;

    public Pereviznyk(int id, String prizvyshche, String imya, String pobatkovi, double nomerTelefonu) {
        this.id = id;
        this.prizvyshche = prizvyshche;
        this.imya = imya;
        this.pobatkovi = pobatkovi;
        this.nomerTelefonu = nomerTelefonu;
    }

    public int getId() { return id; }

    public String getFullName() {
        return prizvyshche + " " + imya + " " + pobatkovi;
    }

    private String getPrivateData() {
        return "Номер телефону перевізника: " + nomerTelefonu;
    }
}
