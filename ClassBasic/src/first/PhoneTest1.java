package first;

//단순히 코드 실행을 위한 클래스
public class PhoneTest1 {
    public static void main(String[] args) {
        //Phone 클래스(설계도)대로 실체(객체)를 만들어야 함.
        //객체를 생성하는 문법
        //new : 새로운 객체를 만들어주세요.
        //클래스명 객체명 = new 클래스명 ();
        Phone_class문제하나나옴 p1 = new Phone_class문제하나나옴(); //p1 이라는 Phone 객체를 생성

        //객체가 가진 데이터 읽기
        //★☆ (객체명.변수명) ☆★
        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.modelName);

        //객체가 가진 데이터 수정
        p1.brand = "삼성";
        p1.price = 10000;
        p1.modelName = "갤럭시";

        //객체가 가진 메소드 호출
        p1.powerOn();
        p1.powerOff();
    }
}
