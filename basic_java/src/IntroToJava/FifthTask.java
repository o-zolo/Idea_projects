package IntroToJava;

import java.util.Scanner;

public class FifthTask {
    public static void fifthTaskRun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer number up to 100:");
        int score = scanner.nextInt();
        if(90 <= score && score <=100) {
            System.out.println('A');
        }else if(80 <= score && score <=89){
            System.out.println('B');
        }else if(70 <= score && score <=79){
            System.out.println('C');
        }else if(60 <= score && score <=69){
            System.out.println('D');
        }else if(score <=59){
            System.out.println('F');
        }
        scanner.nextLine();
        scanner.close();
    }
}
