package while_study;

public class While_01 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        //필수 1:반복 시작을 위한 초기화
        //필수 2:반복 조건
        //필수 3:반복 파기 조건

        int i = 1;       // 1번 단계
        while(i <= 3){   // 2번 단계
            System.out.println(i);   // 1 , 2 , 3 출력
            i++; // 3번 단계
        }

        System.out.println("프로그램 종료");
    }
}
