package if_study;

import java.util.Scanner;

public class 문자열_입력받기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        System.out.println(name);
    }
}
