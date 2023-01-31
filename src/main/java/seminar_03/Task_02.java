package seminar_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> listNums = createNewIntList();
        System.out.print(listNums);
        int max = maxElement(listNums);
        int min = minElement(listNums);
        double mean = arithmeticMean(listNums);
        System.out.printf("\nМаксимальное значение списка - %s, " +
                        "\nминималное - %s,  " +
                        "\nср.арифметическое - %.1f", max, min, mean);
    }

    private static Double arithmeticMean(ArrayList<Integer> lst) {
        double sum = 0;
        for (int num : lst) {
            sum += num;
        }
        return  sum / lst.size();
    }
    private static Integer maxElement(ArrayList<Integer> lst) {
        return Collections.max(lst);
    }

    private static Integer minElement(ArrayList<Integer> lst) {
        return Collections.min(lst);
    }

    private static ArrayList<Integer> createNewIntList() {
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(1, 11));
        }
        return nums;
    }
}
