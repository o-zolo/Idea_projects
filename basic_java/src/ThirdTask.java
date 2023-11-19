import java.util.Scanner;

public class ThirdTask {
    public static void thirdTaskRun() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i ++) {
            if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Vowels count = " + count);
    }
}