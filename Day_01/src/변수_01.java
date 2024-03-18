//변수 - 변하는 값을 저장하는 '공간' or '공간의 이름'

public class 변수_01 {
    public static void main(String[] args) {
        //변수 선언(특정값을 저장할 수 있는 공간 생성)
        //변수 선언 문법 : 자료형 변수명;

        //int : integer(정수)
        int num;    //정수를 저장할 수 있는 num 이라는 공간을 생성

        // = : 우측값을 왼쪽에 저장, 대입, 할당
        num = 5;   //5를 num에 저장

        //변수가 저장하고 있는 값을 출력
        System.out.println("num = " + num);

        num = 10;
        System.out.println("num = " + num);

        //num = 1.1; → 오류
        //num = "java"; → 오류
    }
}
