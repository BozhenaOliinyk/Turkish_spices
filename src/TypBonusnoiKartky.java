public class TypBonusnoiKartky {
    private int id;
    private String typ;
    private static int narBon;

    public TypBonusnoiKartky(int id, String typ, int narBon) {
        this.id = id;
        this.typ = typ;
        this.narBon = narBon;
    }

    public int getId() {
        return id;
    }

    public static int calculateBonus(int suma) {
        return suma + ((suma/ 100) * narBon);
    }
}
