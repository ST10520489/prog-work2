//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       SalesModel model = new SalesModel();
       model.ShoeBrand = "Nike";
       model.BrandSales = 100;

       PrintSales printSales = new PrintSales(model);
       printSales.Print();
        }
    }
