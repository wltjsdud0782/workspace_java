package array_test;

import java.time.OffsetDateTime;

public class Array_18 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.println(max);

        }
    }
}
