package IntroToJava;

import java.util.Scanner;

public class FirstTask {

    public static void firstTaskRun() {
        Scanner scanner = new Scanner(System.in);
        double VAT = 0.2;
        System.out.println("Enter the price of a product excluding VAT");
        Double price_excluding_VAT = scanner.nextDouble();
        Double price_including_VAT = price_excluding_VAT * VAT + price_excluding_VAT;
        System.out.println(price_excluding_VAT + " - Price excluding VAT");
        System.out.println(price_including_VAT + " - Price including VAT");
        scanner.nextLine();
        scanner.close();
    }
}
