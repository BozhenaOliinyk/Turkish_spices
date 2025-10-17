class ZnyzhkaNaSpecii implements Znyzhka  {
    private int id;
    private double znyzhka;
    private int idKarty;
    private int idSpecii;

    @Override
    public double zn(int id,double suma, TypBonusnoiKartky kartka, Product product) {
        this.id=id;
        this.znyzhka = 0;
        this.idKarty = kartka.getId();
        this.idSpecii = product.getId();

        int[] first = new int[]{2, 2, 0, 0, 0, 0};
        int[] second = new int[]{4, 4, 3, 0, 3, 0};
        int[] third = new int[]{6, 6, 5, 3, 5, 3};

        switch (idKarty) {
            case 1:
                znyzhka = first[idSpecii - 1];
                break;

            case 2:
                znyzhka = second[idSpecii - 1];
                break;

            case 3:
                znyzhka = third[idSpecii - 1];
                break;
        }

        return suma - (( suma / 100) * znyzhka);
    }


    public int getId() {
        return id;
    }
}
