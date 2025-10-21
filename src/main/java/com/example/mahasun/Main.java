//package com.example.mahasun;
//
//import com.example.mahasun.entity.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        TorhovaTochka tochka1 = new TorhovaTochka(1, "Магазин 'Прянощі'", "м. Львів, вул. Галицька, 10");
//        TorhovaTochka tochka2 = new TorhovaTochka(2, "Лавка Смаків", "м. Київ, вул. Хрещатик, 22");
//
//        Klyent.Pracivnyk prac1 = new Klyent.Pracivnyk(1, "Коваленко", "Ірина", "Михайлівна",
//                "продавець", 1, tochka1, "380971234567");
//
//        TypBonusnoiKartky kartka1 = new TypBonusnoiKartky(1, "Silver", 5);
//        TypBonusnoiKartky kartka2 = new TypBonusnoiKartky(2, "Gold", 10);
//
//        Klyent k1 = new Klyent(1, "Олійник", "Божена", "Ігорівна",
//                "2022-06-15", 200, kartka2);
//
//        Postachalnyk post1 = new Postachalnyk(1, "Spices", "м. Одеса, вул. Пряна, 4", "0441112233");
//        Pereviznyk per1 = new Pereviznyk(1, "Шевченко", "Олег", "Васильович", "0671112233");
//
//        Product spec = new Specii(1, "Паприка", "мелена", "для м’яса", 8);
//        Product frukt = new Sukhofrukty(2, "Курага", "фрукт", "сонячне сушіння");
//
//        Product[] produkty = {spec, frukt};
//        for (Product p : produkty) {
//            System.out.println(p.info());
//        }
//
//        PostachannyaProdukciyi postach = new PostachannyaProdukciyi(tochka1, per1, post1,
//                spec.info(), 500.0, 20, "2025-12-31");
//        postach.printDeliveryDetails();
//
//        Reklama reklama = new Reklama(1, "Львів", "Банер", tochka2, prac1);
//        reklama.printAdInfo();
//
//        System.out.println("\nКількість створених торгових точок: " + TorhovaTochka.getCount());
//    }
//}


package com.example.mahasun;

import com.example.mahasun.entity.*;
import com.example.mahasun.service.RepositoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private RepositoryManager repositoryManager;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
        repositoryManager.klyenty().read().forEach(System.out::println);

        List<Pracivnyk> pracivnyky = repositoryManager.pracivnyky().read();
        TypBonusnoiKartky kartka = repositoryManager.bonusniKartky().getById(1);

        Klyent newKlyent = new Klyent("Олійник", "Божена", "Ігорівна", "2023-12-01", 300, kartka);
        repositoryManager.klyenty().create(newKlyent);
        repositoryManager.klyenty().read().forEach(System.out::println);

        newKlyent.addBonus(500);
        repositoryManager.klyenty().update(newKlyent);
        repositoryManager.klyenty().read().forEach(System.out::println);

        repositoryManager.klyenty().delete(newKlyent);
        repositoryManager.klyenty().read().forEach(System.out::println);

        for (Pracivnyk p : pracivnyky) {
            if(p.id_tochka != null) {
                TorhovaTochka tochka = repositoryManager.torhoviTochky().getById(p.id_tochka);
                System.out.println("Працівник " + p.prizvyshche + " " + p.imya + " " + p.pobatkovi
                        + " працює у торговій точці " + tochka.nazva);
            }
        }

    }
}

