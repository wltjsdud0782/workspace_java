package if_study;
//키보드로 두 정수를 입력받아 두 정수의 합을 출력

import java.util.Scanner;

public class 키보드로_정수입력받기_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int x = sc.nextInt();
        System.out.print("두번째 수 : ");
        int y = sc.nextInt();

        System.out.println("두 정수의 합 = " + (x + y));

    }
}
