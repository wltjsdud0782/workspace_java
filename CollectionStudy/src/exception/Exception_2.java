package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }catch(InputMismatchException e){ //정수가 아닌 다른 걸로 입력 받았을 때
            System.out.println("입력값이 잘못되었습니다.");
            e.printStackTrace();
        }catch(ArithmeticException e){ // 두 수 중 하나 이상 0 숫자로 받았을 때
            System.out.println("0으로 나눌 수 없습니다.");
        }

        System.out.println("프로그램 종료");
    }
}
