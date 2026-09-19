import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        void main() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Vehicle Type: ");
                String AccidentVehicleType = scanner.nextLine();
                System.out.println("Enter the city of the accident: ");
                String City = scanner.nextLine();
                System.out.println("Enter the total accidents: ");
                int AccidentTotal = scanner.nextInt();

                RoadAccidentReports roadAccidentReport = new RoadAccidentReports(AccidentVehicleType, City, AccidentTotal);
                roadAccidentReport.printAccidentReport();
        }
}
