package switch_study;

import java.util.Scanner;

public class Switch_02 {
    public static void main(String[] args) {
        //키보드로 문자열을 입력받는다.
        //입력받은 문자열이 '자바'이면 'java'출력
        //입력받은 문자열이 '파이썬'이면 'python'출력
        //입력받은 문자열이 둘 다 아니면 '잘못입력'출력
        //switch  case break문을 이용하시오.

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        switch (a){
            case "자바" :
                System.out.println("java");
                break;

            case "파이썬" :
            System.out.println("python");
                break;

            default :
                System.out.println("잘못입력");
        }
    }
}
