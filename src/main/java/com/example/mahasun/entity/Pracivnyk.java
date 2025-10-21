package com.example.mahasun.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "працівники")
public class Pracivnyk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "прізвище")
    public String prizvyshche;
    @Column(name = "ім'я")
    public String imya;
    @Column(name = "по-батькові")
    public String pobatkovi;
    @Column(name = "статус")
    public String status;
    @Column(name = "Зміна", nullable = true)
    public Integer zmina;
    @Column(name = "id торгової точки", nullable = true)
    public Integer id_tochka;
    @Column(name = "номер телефону")
    public String nomerTelefonu;

    public Pracivnyk() {}

    public Pracivnyk(int id, String prizvyshche, String imya, String pobatkovi,
                     String status, Integer zmina, TorhovaTochka tochka, String nomerTelefonu) {
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