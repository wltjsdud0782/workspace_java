package basic;
//인터페이스 : 클래스의 설계도
//인터페이스 안의 메소드는 무조건 public으로 선언!
//접근제한자 생략 시 자동으로 public 으로 설정된다.
//인터페이스 안에는 오직 메소드의 정의만 존재한다.
//변수 X, 생성자 X
//★인터페이스는 단독 사용 불가!★
//★인터페이스는 클래스 구현 시 함께 사용된다.★

public interface Coffee_machine {
    void getCoffee();
}
