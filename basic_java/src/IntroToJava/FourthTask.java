package IntroToJava;

import java.util.Scanner;

public class FourthTask {

        public static void fourthTaskRun() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your integer number:");
            int number = scanner.nextInt();
            if (number % 2 == 0){
                System.out.println(number + " is even");
            }else {
                System.out.println(number + " is odd");
            }
        }
}
