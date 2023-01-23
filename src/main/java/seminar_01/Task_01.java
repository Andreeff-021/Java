package seminar_01;

import java.util.Arrays;
import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        maxAndMinValue(array);
    }

    // Создаёт новый массив
    private static int[] createArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(16);
        }
        return arr;
    }

    // Выводит максимальное и минимальное значения массива в консоль
    private static void maxAndMinValue(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num: array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.printf("Максимальный: %d, минимальный: %d", max, min);
    }
}
