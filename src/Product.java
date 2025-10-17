abstract class Product {
    private int id;
    private String nazva;
    private String vyd;
    private String specifier;

    public Product(int id, String nazva, String vyd, String specifier) {
        this.id = id;
        this.nazva = nazva;
        this.vyd = vyd;
        this.specifier = specifier;
    }

    public int getId() {
        return id;
    };

    public abstract String getProductType();
    public abstract String getSpecifier();

    public String info() {
        return getProductType() +": " + nazva + ", вид: " + vyd;
    }
}
