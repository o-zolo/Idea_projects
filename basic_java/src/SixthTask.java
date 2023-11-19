import java.util.Scanner;

public class SixthTask {
    public static void sixthTaskRun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age from 0 to 100:");
        double age = scanner.nextDouble();
        if(60 <= age) {
            System.out.println("Senior");
        }else if(20 <= age && age <=59){
            System.out.println("Adult");
        }else if(13 <= age && age <=19){
            System.out.println("Teenager");
        }else if(0 <= age && age <=12){
            System.out.println("Child");
        }else if(0 > age){
            System.out.println("Age cannot be negative. Please try again");
        }
        scanner.nextLine();
        scanner.close();
    }
}

