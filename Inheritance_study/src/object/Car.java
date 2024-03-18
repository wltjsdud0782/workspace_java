package object;

//모든 클래스는 Object 클래스를 상속한다.
//Object 는 모든 클래스의 부모이다.

public class Car extends Object{
    public void a(int a){
    }
    public void a(String a){
    }
    public void a(Object a){ //매개변수로 자료형 상관없이 다 받겠습니다.
    }
}

class SuperCar extends Car{

}
