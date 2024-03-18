package For_test;

import java.util.Scanner;

public class For_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = sc.nextInt(); i > 0; i--){
            if (i % 2 == 0){
                total++;
            }
        }
        System.out.println(total);
    }
}
