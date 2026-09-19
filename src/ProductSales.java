public class ProductSales implements IProduct {

    public int MaxSales(int[][] productSales) {
        int MaxSales = productSales[0][0];

        for(int row = 0; row < productSales.length; row++){
            for(int col = 0; col < productSales[row].length; col++){
                if(MaxSales < productSales[row][col]){
                    MaxSales = productSales[row][col];
                }
            }
        }
        return MaxSales;
    }
    public int MinSales(int[][] productSales) {
        int MinSales = productSales[0][0];

        for(int row = 0; row < productSales.length; row++){
            for(int col = 0; col < productSales[row].length; col++){
                if(MinSales > productSales[row][col]){
                    MinSales = productSales[row][col];
                }
            }
        }
        return MinSales;
    }
    public double AverageSales(int[][] productSales) {
        double tot = 0;

        for(int row = 0; row < productSales.length; row++){
            for(int col = 0; col < productSales[row].length; col++){
                tot += productSales[row][col];
            }
        }
        double ave = Math.round((double) tot/6);
        return ave;
    }

    public int TotSales(int[][] productSales) {
        int tot = 0;
        for(int row = 0; row < productSales.length; row++){
            for(int col = 0; col < productSales[row].length; col++){
                tot += productSales[row][col];
            }
        }
        return tot;
    }
}
