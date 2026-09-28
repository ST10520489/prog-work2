
import java.util.Scanner;
void main() {

    Scanner input = new Scanner(System.in);
    String[] cities = {"Durban", "Bloemfontein", "Pretoria", "East London"};
    String[] typeSales = {"Online Sales", "In-store sales"};
    int[][] sales = new int[cities.length][typeSales.length];

    for (int i = 0; i < cities.length; i++) {
        for (int j = 0; j < typeSales.length; j++) {
            System.out.print("Enter the number of " + typeSales[j] + " for " + cities[i] + ": ");
            sales[i][j] = input.nextInt();

        }
    }
    System.out.println("----------------------------------------------");
    System.out.println("QUARTERLY SALES REPORT");
    System.out.println("----------------------------------------------");
    System.out.printf("%-18s%-16s%s\n", "", "ONLINE SALES", "IN-STORE SALES");
    for (int i = 0; i < cities.length; i++) {
        System.out.printf("%-18s%-16d%d\n", cities[i], sales[i][0], sales[i][1]);
    }
    System.out.println("---------------------------------------------------------");
    System.out.println("SALES STATICS");
    System.out.println("-----------------------------------------------------------");

    int total = 0;
    int max = sales[0][0];
    int min = sales[0][0];

    for (int i = 0; i < sales.length; i++) {
        for (int j = 0; j < sales[i].length; j++) {
            total += sales[i][j];

            if (sales[i][j] > max) {
                max = sales[i][j];
            }
            if (sales[i][j] < min) {
                min = sales[i][j];
            }
        }
    }
    System.out.println("TOTAL SALES: " + total);
    System.out.println("MAXIMUM SALES: " + max);
    System.out.println("MINIMUM SALES: " + min);

    input.close();
}
