package first;
//클래스 : 객체를 만들기 위한 설계도
//클래스의 구성 요소 : 변수(데이터), 메소드의 정의(기능), 생성자
//★ 클래스는 자료형이다. ★

//변수의 선언 위치에 따른 분류
//(1)지역 변수(local variable) : 메소드 안에 선언된 변수
//                            : 반드시 초기화 작업을 진행한 후 사용 가능
//(2)매개 변수(parameter) : 메소드 정의문 소괄호 안에 선언된 변수
//(3)맴버 변수, 필드 : 메소드 외 클래스 안에 선언된 변수
//                 : 초기화 하지 않으면 자동으로 default 값을 가진다.

public class Phone_class문제하나나옴 {
    //phone이 가진 데이터 - 변수
    String brand;
    int price;
    String modelName;

    //phone이 가진 기능 - 메소드 정의
    public void powerOn(){
        System.out.println("폰의 전원을 켭니다.");
    }
    public void powerOff(){
        System.out.println("폰의 전원을 끕니다.");
    }
}
