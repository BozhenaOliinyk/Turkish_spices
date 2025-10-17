class Sukhofrukty extends Product {
    String mv;
    public Sukhofrukty(int id, String nazva, String vyd, String metVys) {
        super(id, nazva, vyd, metVys);
        mv = metVys;
    }

    @Override
    public String getProductType() {
        return "Сухофрукти";
    }

    @Override
    public String getSpecifier() {
        return mv;
    }

    @Override
    public String info() {
        return super.info() + ", метод висушення: " + getSpecifier();
    }
}
