//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] months = {"MONTH 1", "MONTH 2", "MONTH 3", "TOTAL", "AVG", "MIN", "MAX"};
        String[] gym = {"GYM 1", "GYM 2", "GYM 3"};
        int[][] weight = {{10, 20, 27}, {22, 5, 20}, {30, 20, 10}};

        System.out.println("GYM WEIGHTLOSS APPLICATION");
        System.out.println("*******************************");

        System.out.printf("%-12s", "");
        for (String mon : months) {
            if (mon.equals("TOTAL")) {
                System.out.printf("| %-12s", mon);
            } else {
                System.out.printf("%-12s", mon);
            }
        }
        System.out.println();
        System.out.println("*****************************************");

        for(int i = 0; i < gym.length; i++);

    }
}
