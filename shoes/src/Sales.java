public abstract class Sales implements ISales {
    private final String brand;
    private final int sales;

    public Sales(SalesModel model) {
        this.brand=model.ShoeBrand;
        this.sales=model.BrandSales;
    }
    @Override
    public String getShoeBrand() {
        return brand;
    }

    @Override
    public int getBrandSales() {
        return sales;
    }
}
