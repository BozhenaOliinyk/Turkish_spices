public class Main {
    public static void main(String[] args) {

        TorhovaTochka tochka1 = new TorhovaTochka(1, "Магазин 'Прянощі'", "м. Львів, вул. Галицька, 10");
        TorhovaTochka tochka2 = new TorhovaTochka(2, "Лавка Смаків", "м. Київ, вул. Хрещатик, 22");

        Pracivnyk prac1 = new Pracivnyk(1, "Коваленко", "Ірина", "Михайлівна",
                "продавець", 1, tochka1, 380971234567.0);

        TypBonusnoiKartky kartka1 = new TypBonusnoiKartky(1, "Silver", 5);
        TypBonusnoiKartky kartka2 = new TypBonusnoiKartky(2, "Gold", 10);

        Klyent k1 = new Klyent(1, "Олійник", "Божена", "Ігорівна",
                "2022-06-15", 200, kartka2);

        Postachalnyk post1 = new Postachalnyk(1, "Spices", "м. Одеса, вул. Пряна, 4", 0441112233);
        Pereviznyk per1 = new Pereviznyk(1, "Шевченко", "Олег", "Васильович", 0671112233);

        Product spec = new Specii(1, "Паприка", "мелена", "для м’яса", 8);
        Product frukt = new Sukhofrukty(2, "Курага", "фрукт", "сонячне сушіння");

        Product[] produkty = {spec, frukt};
        for (Product p : produkty) {
            System.out.println(p.info());
        }

        PostachannyaProdukciyi postach = new PostachannyaProdukciyi(tochka1, per1, post1,
                spec.info(), 500.0, 20, "2025-12-31");
        postach.printDeliveryDetails();

        Reklama reklama = new Reklama(1, "Львів", "Банер", tochka2, prac1);
        reklama.printAdInfo();

        System.out.println("\nКількість створених торгових точок: " + TorhovaTochka.getCount());
    }
}
