package JavaPartTwo;

public class Task1Part2 {
    public static void task1Part2Run(String firstWord, String secondWord) {
        String first = firstWord.toLowerCase();
        String second = secondWord.toLowerCase();
        if (first.equals(second)) {
            System.out.println("true");
        } else System.out.println("false");
    }

    public static void task1_Part2Run(String firstWord, String secondWord) {
        String first = firstWord.substring(2);
        String second = secondWord.substring(1, 2);
        System.out.println(first);
        System.out.println(second);
    }

    public static void task1_1Part2Run(String firstWord, String secondWord) {
        String first = firstWord.toLowerCase();
        String second = secondWord.toLowerCase();
        if (firstWord.contains(secondWord)) {
            System.out.println(true);
            System.out.println(first.indexOf(second));
        } else System.out.println(false);
    }

    public static void task1_2Part2Run(String firstWord, String secondWord) {
        String first = firstWord.toLowerCase();
        String second = secondWord.toLowerCase();
        if (first.contains(second)) {
            System.out.println(firstWord.replace(secondWord, "orl"));
        }
    }

    public static void task1_3Part2Run(String firstWord, String secondWord) {
        String first = firstWord.toLowerCase();
        String second = secondWord.toLowerCase();
        String[] digits = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        for (int i = 0; i < digits.length; i++) {
            if (first.contains(digits[i])) {
                System.out.println(digits[i] + " " + true);
            } else System.out.println(digits[i] + " " + false);
        }
    }

    public static void task1_4Part2Run(String firstWord, String secondWord) {
        String first = firstWord.toLowerCase();
        String second = secondWord.toLowerCase();
        System.out.println(firstWord.trim());
    }
}