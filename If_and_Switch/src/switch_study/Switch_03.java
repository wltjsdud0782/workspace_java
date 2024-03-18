package switch_study;
//키보드로 점수를 입력(0~100까지의 정수)
//점수가 90 <= x <= 100 "A" 출력
//점수가 80 <= x <= 89 "B" 출력
//점수가 70 <= x <= 79 "C" 출력
//점수가 x < 70 "D" 출력

import java.util.Scanner;

public class Switch_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int x = sc.nextInt();

        switch (x/10){
            case 10:  //작성하지 않아도 case 9 출력 후 작동 멈춤
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
    }
}
