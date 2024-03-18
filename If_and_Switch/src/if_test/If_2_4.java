package if_test;

import java.util.Scanner;

public class If_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("- 결과 -");
        System.out.print("국어점수 : ");
        int kor = sc.nextInt();

        System.out.print("영어점수 : ");
        int eng = sc.nextInt();

        System.out.print("수학점수 : ");
        int math = sc.nextInt();

        int total = kor + eng + math;
        System.out.println("총점 : " + total);
        System.out.print("평균 : " + (total/3.0));
                                    //(double)total/3 도 가능
    }
}
