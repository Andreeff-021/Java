package seminar_03;

import java.util.*;

public class Task_03 {
    public static void main(String[] args) {
        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars",
                                        "jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> lst = createRandomListSizeN(solarSystemPlanets, 15);
        System.out.print(lst + "\n");
        System.out.print(delDuplicates(lst));
    }

    private static ArrayList<String> delDuplicates(ArrayList<String> lst) {
        Set<String> st = new HashSet<>(lst);
        lst.clear();
        lst.addAll(st);
        return lst;
    }

    private static ArrayList<String> createRandomListSizeN (String[] array, int size) {
        ArrayList<String> resultArray = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            resultArray.add(array[random.nextInt(array.length)]);
        }

        return resultArray;
    }


}
