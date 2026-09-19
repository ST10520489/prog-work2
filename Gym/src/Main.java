//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeightLossModel model = new WeightLossModel();
        model.CustomerName = "JOE BLOGGS";
        model.WeightLoss = 10.0;

        PrintWeightLoss printWeightLoss = new PrintWeightLoss(model);
        printWeightLoss.Print();
        }
    }
