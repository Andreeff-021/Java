package seminar_4;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> digitList = new LinkedList<>();
        Collections.addAll(digitList, "1", "2", "3", "4", "5", "6", "7", "8", "9");
        System.out.println(digitList);
        reversLinkedList(digitList);
    }

    private static void reversLinkedList(LinkedList<String> str) {
        List<String> linkedList = new LinkedList<>();
        for (int i = str.size() - 1; i >= 0; i--) {
            linkedList.add(str.get(i));
        }
        System.out.println(linkedList);
    }
}
