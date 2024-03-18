package exception;

import java.util.Scanner;

//예외 : 코드 작업의 미숙함으로 인해 발생하는 오류
//      개발자의 실수, 코드의 수정으로 해결할 수 있는 문제
//오류 : 개발자의 실력으로 처리할 수 없는 코드
public class Exception_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
           //예외가 발생할 소지가 있는 코드 작성
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("두 수의 나눗셈 결과 : " + a / b);
        }catch (Exception e){ //() 안에는 발생한 예외 정보를 담고 있는 객체
            //예외 발생 시 실행할 코드 작성
            System.out.println("예외 발생");
            //예외 발생 이유 e.getMessage
            System.out.println(e.getMessage());

            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
