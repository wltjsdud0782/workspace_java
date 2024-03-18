package overloading;

//메소드 오버로딩(method overloading)
//원칙적으로 메소드명은 중복될 수 없다.
//매개변수의 정보가 다르다면 메소드명 중복 가능.
//매개변수의 정보 : 매개변수의 갯수, 매개변수 자료형
public class Printer {
    int number;
    //모든 클래스는 객체 생성을 위해 반드시 생성자가 필요.
    //만약 클래스 안 생성자를 하나도 구현하지 않으면 기본 생성자를 자동 생성.
    public Printer(){ //생성자
        number = 10;
    }
    public Printer(int a){ //생성자2 메소드 오버로딩
        number = a;
    }

    public void print(){
    }
    public void print(int a){
    }
    public void print(int a, int b){
    }
    public void print(String a){
    }

}
