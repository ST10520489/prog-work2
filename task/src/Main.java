//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                String[] brands = {"NIKE", "ADIDAS", "REEBOK"};
                String[] quarters = {"Q1", "Q2", "Q3", "Q4"};
                int[][] sales = {{100, 88, 75, 65},{150, 92, 45, 95},{70, 103, 90, 175}};

                System.out.println("ULTIMATE SHOE SALES");
                System.out.println("*****************************************************");
                System.out.printf("%-12s %-12s %-12s %-12s\n", "QUARTER", brands[0], brands[1], brands[2]);
                System.out.println("*****************************************************");


                for (int i = 0; i < quarters.length; i++) {
                    System.out.printf("%-12s %-12d %-12d %-12d\n",quarters[i],sales[0][i],sales[1][i],sales[2][i]);
                }
                System.out.println("**********************************************************");

                int[] totals = new int[3];
                double[] averages = new double[3];
                int[] mini = new int[3];
                int[] maxi = new int[3];

                for (int b = 0; b < sales.length; b++) {
                    int total = 0;
                    int min = sales[b][0];
                    int max = sales[b][0];

                    for (int q = 0; q < sales[b].length; q++) {
                        int value = sales[b][q];
                        total += value;

                        if (value < min) min = value;
                        if (value > max) max = value;
                    }

                    totals[b] = total;
                    averages[b] = (double) total / sales[b].length;
                    mini[b] = min;
                    maxi[b] = max;
                }

                System.out.printf("%-12s %-12d %-12d %-12d\n", "TOTAL:", totals[0], totals[1], totals[2]);
                System.out.printf("%-12s %-12.1f %-12.1f %-12.1f\n", "AVERAGE:", averages[0], averages[1], averages[2]);
                System.out.printf("%-12s %-12d %-12d %-12d\n", "MIN:", mini[0], mini[1], mini[2]);
                System.out.printf("%-12s %-12d %-12d %-12d\n", "MAX:", maxi[0], maxi[1], maxi[2]);
                System.out.println("********************************************************");
            }
        }

