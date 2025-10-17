public class PostachannyaProdukciyi{
    private int id;
    private int id_tochka;
    private int id_pereviznyk;
    private int id_postachalnyk;
    private String productName;
    private double price;
    private int quantity;
    private String expdate;

    public PostachannyaProdukciyi(TorhovaTochka tochka, Pereviznyk pereviznyk, Postachalnyk postachalnyk,
                                  String productName, double price, int quantity, String expdate) {
        this.id_tochka = tochka.getId();
        this.id_pereviznyk = pereviznyk.getId();
        this.id_postachalnyk = postachalnyk.getId();
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.expdate = expdate;
    }

    public int getId() {
        return id;
    }

    public void printDeliveryDetails() {
        System.out.println("Товар: " + productName + ", кількість: " + quantity + ", ціна: " + price + ", придатний до: " + expdate);
    }
}
