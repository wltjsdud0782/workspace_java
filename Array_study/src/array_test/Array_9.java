package array_test;

import java.util.Scanner;

public class Array_9 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("입력 결과");

            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
        }
    }
}
