package if_test;

import java.util.Scanner;

public class If_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int a = sc.nextInt();

        System.out.print("두번째 수 : ");
        int b = sc.nextInt();

        int max = 0, min = 0;    //임의의 수 초기화 필수

        if (a > b){
            max = a; min = b;
        }
        else if (a < b){
            max = b; min = a;
        }
        System.out.println(max + " > " + min);
    }
}
