import java.util.Scanner;

public class SecondTask {

    public static void secondTaskRun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature for First day");
        float temperature_First_day = scanner.nextFloat();
        System.out.println("Enter temperature for Second day");
        float temperature_Second_day = scanner.nextFloat();
        System.out.println("Enter temperature for Third day");
        float temperature_Third_day = scanner.nextFloat();
        System.out.println("Enter temperature for Fourth day");
        float temperature_Fourth_day = scanner.nextFloat();
        System.out.println("Enter temperature for Fifth day");
        float temperature_Fifth_day = scanner.nextFloat();
        float average_temperature = (temperature_First_day + temperature_Second_day + temperature_Third_day + temperature_Fourth_day + temperature_Fifth_day)/5;
        System.out.println(average_temperature + " Average temperature");
        scanner.nextLine();
        scanner.close();
    }
}
