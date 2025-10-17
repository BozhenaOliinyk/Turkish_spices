class ZnyzhkaNaSukhofrukty implements Znyzhka {
    private int id;
    private double znyzhka;
    private int idKarty;
    private int idFrukta;

    @Override
    public double zn(int id, double suma, TypBonusnoiKartky kartka, Product product) {
        this.id=id;
        this.znyzhka = 0;
        this.idKarty = kartka.getId();
        this.idFrukta = product.getId();

        int[] first = new int[]{0, 4, 0, 0};
        int[] second = new int[]{3, 5, 0, 3};
        int[] third = new int[]{5, 7, 3, 4};

        switch (idKarty) {
            case 1:
                znyzhka = first[idFrukta - 1];
                break;

            case 2:
                znyzhka = second[idFrukta - 1];
                break;

            case 3:
                znyzhka = third[idFrukta - 1];
                break;
        }

        return suma - (( suma / 100) * znyzhka);
    }


    public int getId() {
        return id;
    }
}
