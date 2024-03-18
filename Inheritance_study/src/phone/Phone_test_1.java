package phone;

public class Phone_test_1 {
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone();
        SmartPhone p2 = new SmartPhone();

        //상속관계의 클래스에서 '부모 클래스'로 '자식 클래스'의 객체를 생성 가능.
        //다형성 - 객체가 다양한 형태를 지닌다.
        //다형성을 통해 만들어진 객체는 자식클래스의 메소드,변수 사용 불가능.
        MobilePhone p3 = new SmartPhone(); // → 허용됨.
        //SmartPhone p4 = new MobilePhone(); // → 불가능.

        //p3.playApp(); → 오류 (실체는 SmartPhone 이지만 변수 사용 불가능)


        //형변환 → 상속 관계에서만 가능
        SmartPhone p5 = (SmartPhone)p3;
    }
}
