package if_study;
//이름, 나이, 연락처 정보를 키보드로 입력받아 입력받은 정보를 출력하시오.

import java.util.Scanner;

public class 정보입력받기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("연락처 : ");
        String tel = sc.next();

        System.out.println("입력받은 정보는 아래와 같습니다.");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + tel);
    }
}
