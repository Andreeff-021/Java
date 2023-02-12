package seminar_4;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        addAndRemoveElements();
    }

    private static void addAndRemoveElements() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        while (true) {
            String str = inputText();
            if (Objects.equals(str, "print")) {
                System.out.println(arrayDeque);
            } else if (Objects.equals(str, "revent")) {
                arrayDeque.removeFirst();
            } else if (Objects.equals(str, "exit")) {
                break;
            }
            else arrayDeque.addFirst(str);
        }
    }

    private static String inputText() {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        try {
            str = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
