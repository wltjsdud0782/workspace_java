package student_overriding;

//오버로딩 - 메소드명은 원래 중복 선언 불가능 > but,매개변수의 정보가 다르면 중복 가능
//오버라이딩(overriding) - 상속 관계의 클래스에서 메소드를 자식 클래스에서 재정의 한다.
//          그렇게 오버라이딩 된 메소드는 자식 클래스에서 재정의된 메소드만 실행된다.
//매개변수가 다르면 오버로딩 / 같은데 내용만 다르면 오버라이딩
public class Student {
    public void tellName(){
        System.out.println("제 이름은 홍길동입니다.");
    }
}
//this(); - 이 클래스의 생성자
//super(); - 부모 클래스의 생성자
//생성자안에서 생성자 호출

class NewStudent extends Student{
    public void tellName(){
//        super.tellName();   -> 이러면 사라지지 않는다.
        System.out.println("제 이름은 이순신입니다.");
        //Student 클래스의 tellName 메소드가 없어진다.
    }
}
