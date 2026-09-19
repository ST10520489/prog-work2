//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
                int[] carAccidents = {155, 178, 112};
                int[] bikeAccidents = {1120, 143, 89};

                System.out.println("**********************************************************");
                System.out.println("ROAD ACCIDENT REPORT");
                System.out.println("************************************************************");
                System.out.printf("%-18s %-18s %-18s\n", "CITY", "CAR", "MOTORBIKE");
                System.out.println("*****************************************************************");

                int totalAccidents = 0;

                for (int i = 0; i < cities.length; i++) {
                    System.out.printf("%-18s %-18d %-18d\n", cities[i], carAccidents[i], bikeAccidents[i]);
                    totalAccidents += carAccidents[i] + bikeAccidents[i];
                }

                System.out.println("************************************************************");
                System.out.println("Total Recorded Accidents across all cities: " + totalAccidents);
                System.out.println("************************************************************");
            }
        }
