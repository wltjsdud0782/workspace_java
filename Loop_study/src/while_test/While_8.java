package while_test;

import java.util.Scanner;

public class While_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int a = sc.nextInt();
        int total = 0;

        while (1 < a + 1) {
            if (a % 2 == 0) {
                total++;
            }
            a--;
        }
        System.out.println(total);
    }
}
