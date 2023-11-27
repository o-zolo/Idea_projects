package JavaPartTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionAnalysis {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();
    Random random = new Random();
    int sum = 0;
    int givenNumber = 22;

    public void listHandler() {
        for(int i = 0; i < 20; i ++) {
            int item = random.nextInt(100);
            list.add(item);
            sum = sum + item;
        }
        System.out.println("List items = " + list);
        System.out.println("Minimum number in the collection = " + Collections.min(list));
        System.out.println("Maximum number in the collection = " + Collections.max(list));
        System.out.println("Average value of the numbers in the collection = " + sum / list.size());
        if (list.contains(givenNumber)) {
            System.out.println("List contains " + givenNumber);
        } else {
            System.out.println("List doesn't contain " + givenNumber);
        }
        Collections.sort(list);
        System.out.println("Sorted list - " + list);
        for (int i = 0; i < list.size(); i ++) {
            int itemToCheck = list.get(i);
            if (itemToCheck % 2 != 0) {
                oddNumbers.add(itemToCheck);
            }
        }
        System.out.println("Odd numbers - " + oddNumbers);
    }
}
