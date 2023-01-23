package seminar_01;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 4, 3, 2, 7, 4, 3, 3};
        System.out.println(Arrays.toString(array));
        int val = 3;
        int[] newArray = moveElementToEnd(array, val);
        System.out.println(Arrays.toString(newArray));
    }

    // Переносит заданные элементы в конец массива
    private static int[] moveElementToEnd(int[] arr, int val) {
        int i = 0;
        int r = arr.length - 1;
        while (i < r) {
            while (arr[r] == val) r--;
            if (arr[i] == val) swap(arr, i, r);
            i++;
        }
        return arr;
    }

    // Меняет местами элементы в мвссиве
    private static int[] swap(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return arr;
    }
}
