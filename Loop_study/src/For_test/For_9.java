package For_test;

import java.util.Scanner;

public class For_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a > b ? a : b;
        int min = a > b ? b : a;

        for (int i = min + 1; i < max; i++){
            total = total + i;
        }
        System.out.println(total);
    }
}
