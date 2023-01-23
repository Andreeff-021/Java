package seminar_01;

import java.util.Scanner;


public class Task_02 {
    public static void main(String[] args) {
       int x = inputDate();
       System.out.println(leapYearVerification(x));
    }

    // Провереяет год на високосность
    private static boolean leapYearVerification(int x) {
        if (x % 1000 == 400) return true;
        else if (x % 4 == 0 && x % 100 != 0) return true;
        else return false;
    }

    // Ввод данных
    private static int inputDate() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        return year;
    }


}
