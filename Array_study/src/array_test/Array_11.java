package array_test;

import java.util.Scanner;

public class Array_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[4];  //평균 뺀 정수만
        double avg; //평균

        //과목명 배열
        String[] subjects = {"국어", "영어", "수학", "총점"};

        for (int i = 0; i < scores.length - 1; i++) {   //-1 은 총점 분야를 뺀 과목수
            while (true) {
                System.out.print(subjects[i] + " 점수 : ");
                scores[i] = sc.nextInt();

                if (-1 < scores[i] && scores[i] < 101) {
                    break;
                }
            }
        }
        //총점 및 평균 계산
        for (int i = 0; i < scores.length - 1; i++) {
            scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
        }
        avg = scores[scores.length - 1] / (double) (scores.length - 1);

        for (int i = 0; i < scores.length; i++){
            System.out.println(subjects[i] + " 점수 : " + scores[i]);
        }
        System.out.println("평균 점수 : " + avg);
    }
}
