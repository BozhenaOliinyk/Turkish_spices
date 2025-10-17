public class Specii extends Product implements Aroma{
    String pr;
    private int aromaIntensity;
    public Specii(int id, String nazva, String vyd, String pryznachennya, int aromaIntensity) {
        super(id, nazva, vyd, pryznachennya);
        this.pr = pryznachennya;
        this.aromaIntensity = aromaIntensity;
    }

    @Override
    public String getProductType() {
        return "Спеція";
    }

    @Override
    public String getSpecifier() {
        return pr;
    }

    @Override
    public int getAromaIntensity() {
        return aromaIntensity;
    }

    @Override
    public String info() {
        return super.info() + ", призначення: " + getSpecifier();
    }

}
