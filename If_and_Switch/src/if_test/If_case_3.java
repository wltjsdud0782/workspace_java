package if_test;

import java.util.Scanner;

public class If_case_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.print("첫 번째 수 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int b = sc.nextInt();

        System.out.print("연산자 : ");
        String x = sc.next();

        int result = 0;

        if (x.equals("+")){
            result = a + b;
        }
        else if (x.equals("-")){
            result = a - b;
        }
        else if (x.equals("*")){
            result = a * b;
        }
        else if (x.equals("/")){
            result = a / b;
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }

        System.out.println(a + " " + x + " " + b + " = " + result);
    }
}
