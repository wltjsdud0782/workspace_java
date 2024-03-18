package method_study;

//메소드 : 기능 상자
//(1)메소드 정의 : 특정한 기능을 하는 상자를 만드는 것
//              ★ 위치 : 클래스 안, 다른 메소드 밖에서 생성 ★
//(2)메소드 호출 : 만들어진 메소드를 실행하는 것.

public class Method_01 {

    public static void main(String[] args) {
        //(2)메소드 호출 단계
        hello(); //메소드 명 입력
    }
    //(1)메소드 정의 단계
    public static void hello(){   //main 메소드 외에는 출력 X
        System.out.println("hello");
    }
}
