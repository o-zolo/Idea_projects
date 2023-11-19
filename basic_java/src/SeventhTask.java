import java.util.Scanner;

import static java.lang.Math.round;

public class SeventhTask {
    public static void seventhTaskRun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial deposit amount");
        double initial_amount = scanner.nextDouble();
        System.out.println("Enter annual interest rate");
        float interest_rate = scanner.nextFloat()/100;
        System.out.println("Enter number of years");
        double years = scanner.nextDouble();
        double get_deposit = initial_amount * Math.pow(1 + interest_rate, years);
        for (int i = 0; i < years; i++){
            double  annual = initial_amount * Math.pow(1 + interest_rate, i);
            System.out.println("annual income = " + Math.round(annual * 100.0)/100.0);
        }
        System.out.println(Math.round(get_deposit * 100.0)/100.0);
    }
}
