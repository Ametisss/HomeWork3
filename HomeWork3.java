import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

    }

    public static void invertArray() {
        int[] arr = new int[]{1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[1] == 1) {
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
        }
    }

    public static void ChangeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) ;
            System.out.println(arr[i] * 2);
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    public static void lenAndInitialValue(int len, int initialValue) {
            int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
        }
    }
}