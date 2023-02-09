package seminar_5;

import java.util.ArrayList;
import java.util.HashMap;


public class Task_1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        String name1 = "Вова";
        String name2 = "Саша";
        String number1 = "89088336565";
        String number2 = "89093994545";
        String number3 = "89998557878";
        structurePhoneBook(phoneBook, name1, number1);
        structurePhoneBook(phoneBook, name1, number2);
        structurePhoneBook(phoneBook, name2, number3);
    }

    private static void structurePhoneBook(HashMap <String, ArrayList<String>> phoneBook,
                                           String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            ArrayList<String> listNumber = new ArrayList<>();
            listNumber.add(number);
            phoneBook.put(name, listNumber);
        }
        
        System.out.print(phoneBook);
        System.out.println(" ");
    }
}
