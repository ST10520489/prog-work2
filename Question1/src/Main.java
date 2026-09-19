//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] renovations ={"BATHROOMS","KITCHENS","GARDEN"};
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int[][] monthly = {{8,2,5,},{7,4,5},{5,5,2},{2,2,3}, {7,7,9},{7,8,5}};

        System.out.println("HOME MAKEOVER");
        System.out.println("-----------------------------------------------------------------");


        System.out.printf("%-12s", "");
        for (String reno : renovations){
            System.out.printf("%-16s", reno);
        }
        System.out.println();
        for (int month = 0; month < months.length; month++){
            System.out.printf("%-12s", months[month]);
            for (int renovation = 0; renovation < renovations.length; renovation++){
                System.out.printf("%-16d", monthly[month][renovation]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-----------------------------------------------------------------");

        for(int month = 0; month < months.length; month++){
            int total = 0;
            for (int renovation = 0; renovation < renovations.length; renovation++){
                total += monthly[month][renovation];
            }
            String marker = (total > 12) ? "***" : "";
            System.out.printf("%-12s%-16s%s\n", months[month], total, marker);
        }
    }
    }
