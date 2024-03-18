package array_test;

import java.util.Scanner;

public class Array_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int total = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            avg = total / (double)arr.length;
        }
        System.out.println(avg);
    }
}
