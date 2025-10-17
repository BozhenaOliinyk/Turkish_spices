public class Postachalnyk {
    private int id;
    private String nazvaMerezhi;
    private String adres;
    private double nomerTelefonu;

    public Postachalnyk(int id, String nazvaMerezhi, String adres, double nomerTelefonu) {
        this.id = id;
        this.nazvaMerezhi = nazvaMerezhi;
        this.adres = adres;
        this.nomerTelefonu = nomerTelefonu;
    }

    public int getId() {
        return id;
    }

    public void printInfo() {
        System.out.println("Постачальник: " + nazvaMerezhi + ", адреса: " + adres);
    }

    private String getPrivateData() {
        return "Номер телефону постачальника: " + nomerTelefonu;
    }

}
