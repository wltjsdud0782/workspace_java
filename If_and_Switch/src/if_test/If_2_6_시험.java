package if_test;

import java.util.Scanner;

public class If_2_6_시험 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int a = sc.nextInt();

        System.out.print("두번째 수 : ");
        int b = sc.nextInt();

        System.out.print("세번째 수 : ");
        int c = sc.nextInt();

        int max = 0, mid = 0, min = 0;
        //a가 가장 클 때
        if (a > b && a > c){
            max = a;
            if (b > c){
                mid = b;
                min = c;
            }
            else{
                mid = c;
                min = b;
            }
        }

        //b가 가장 클 때
        else if (b > a && b > c){
            max = b;
            if (a > c){
                mid = a;
                min = c;
            }
            else{
                mid = c;
                min = a;
            }
        }

        //c가 가장 클 때
        else{
            max = c;
            if (b > a) {
                mid = b;
                min = a;
            }
            else{
                mid = a;
                min = b;
            }
        }

        System.out.println(max + " > " + mid + " > " + min);
    }
}