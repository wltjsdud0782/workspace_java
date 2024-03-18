package if_test;

import java.util.Scanner;

public class If_case_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.print("성별을 입력하세요 : ");
        String s = sc.next();

        if (s.equals("남")){
            System.out.println("남자입니다.");
        }
        else if (s.equals("여")){
            System.out.println("여자입니다.");
        }
        else{
            System.out.println("다시 입력하세요.");
        }
    }
}
