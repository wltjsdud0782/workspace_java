package if_test;

import java.util.Scanner;

public class If_심화_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int a = sc.nextInt();

        if (a / 10 == 3 || a / 10 == 6 || a / 10 == 9){ //십의자리
            System.out.print("박수짝");
            if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9){
                System.out.print("짝");
            }
        }
        else if (a % 10 == 3 || a % 10 == 6 || a % 10 == 9){
            System.out.print("박수짝");
        }

        //int tens = a / 10;
        //int ones = a % 10;
        //int cnt;   > 박수 횟수
        //if (tens == 3 || tens == 6 || tens == 9){
            //cnt++;}
        //if (ones == 3 || ones == 6 || tens == 9){
            //cnt++;}
        //switch(cnt){
        //  case 1 : sout("박수짝") break;
        //  case 2 : sout("박수짝짝")}
    }
}
