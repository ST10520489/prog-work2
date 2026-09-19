public class Main {
    public static void main(String[] args) {

        int[][] sales = {{300,150,700}, {250,200,600}};
        String [] Quarter = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        String [] year = {"YEAR 1", "YEAR 2"};
        int tot = 0;
        int totEle = 0;
        int min = sales[0][0];
        int max = sales[0][0];

        System.out.println();

        ProductSales product = new ProductSales();

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("----------------------------------------------------");
        System.out.println("Total sales: " +product.TotSales(sales));
        System.out.println("Average Sales: " +product.AverageSales(sales));
        System.out.println("Minimum Sale: " +product.MinSales(sales));
        System.out.println("Maximum Sale: " +product.MaxSales(sales));
    }
}