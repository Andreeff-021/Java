package seminar_03;

import java.util.ArrayList;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> listNums = createNewIntList();
        System.out.print(listNums);
        delEvenNumbers(listNums);
    }

    private static void delEvenNumbers(ArrayList<Integer> lstInt) {
        lstInt.removeIf(n -> n % 2 == 0);

        System.out.print(lstInt);
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
