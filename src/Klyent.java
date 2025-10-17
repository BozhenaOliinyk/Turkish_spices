public class Klyent {
    private int id;
    private String prizvyshche;
    private String imya;
    private String pobatkovi;
    private String data;
    private int bonusy;
    private int id_kartka;

    public Klyent(int id, String prizvyshche, String imya, String pobatkovi,
                  String data, int bonusy, TypBonusnoiKartky kartka) {
        this.id = id;
        this.prizvyshche = prizvyshche;
        this.imya = imya;
        this.pobatkovi = pobatkovi;
        this.data = data;
        this.bonusy = bonusy;
        this.id_kartka = kartka.getId();
    }

    public int getId() {
        return id;
    }

    public void addBonus(int sum) {
        this.bonusy += TypBonusnoiKartky.calculateBonus(sum);
    }

    public void printClientInfo() {
        System.out.println("Клієнт: " + prizvyshche + " " + imya + " " + pobatkovi + " - " + bonusy);
    }
}
