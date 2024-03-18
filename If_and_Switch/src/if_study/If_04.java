package if_study;

public class If_04 {
    public static void main(String[] args) {
        //정수 num 변수 선언 및 임의의 값 저장
        //해당 변수가 양수면 1, 음수면 2, 0이면 0을 출력하는 코드
        int num = 3;

        if(num > 0) {
            System.out.println(1);
        }
        //그렇지 않고 만약에 ~라면
        else if(num < 0){
            System.out.println(2);
        }
        else{
            System.out.println(0);
        }

        int a = 5;   //1만 출력된다.
        if(a >= 5){
            System.out.println(1);
        }
        else if(a ==5){
            System.out.println(2);
        }
        else if (a < 10){
            System.out.println(3);
        }
        //조건이 참일 때 실행할 명령어가 1개라면 중괄호 생략 가능
        int x = 5;
        if(x > 3)//{
            System.out.println(1);
        //}
    }
}
