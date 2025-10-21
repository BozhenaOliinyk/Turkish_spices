package com.example.mahasun.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "клієнти")
public class Klyent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "прізвище")
    public String prizvyshche;
    @Column(name = "ім'я")
    public String imya;
    @Column(name = "по-батькові")
    public String pobatkovi;
    @Column(name = "дата входження в систему")
    public String data;
    @Column(name = "кількість бонусів")
    public int bonusy;
    @Column(name = "id типу картки")
    public int id_kartka;

    public Klyent(){}
    public Klyent(String prizvyshche, String imya, String pobatkovi,
                  String data, int bonusy, TypBonusnoiKartky kartka) {
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

    @Override
    public String toString() {
        return "Клієнт "  + id +
                ": прізвище - " + prizvyshche + '\'' +
                ", ім’я - " + imya + '\'' +
                ", по батькові - " + pobatkovi + '\'' +
                ", дата входження - " + data +'\'' +
                ", кількість бонусів - " + bonusy +'\'' +
                ", id типу картки - " + id_kartka +'\'';
    }

}
