package if_study;

import java.util.Scanner;

public class 키보드로_정수입력받기 {
    public static void main(String[] args) {
        //sc가 하나의 볼펜이라고 생각
        Scanner sc = new Scanner(System. in);

        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();  //키보드로 정수 하나 입력받으시오.

        System.out.println(num1);
    }
}
