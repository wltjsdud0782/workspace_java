// 무엇이든 저장하고 저장한 내용을 리턴할 수 있는 클래스
public class Box {
    private Object obj;

    // 무엇이든 넣을 수 있는 메소드 (setter와 비슷함)
    public void set(Object obj){
        this.obj = obj;
    }

    // 저장된 데이터를 리턴하는 메소드 (getter와 비슷함)
    public Object get(){
        return obj;
    }
}
// ///////////////////////////////////////////////////////////////

class Apple{
    // Object 클래스에서 정의되는 toString() 메소드 오버라이딩
    public String toString(){
        return "나는 사과";
    }
}

class Orange{
    public String toString(){
        return "나는 오렌지";
    }
}

class Parent{
    public void p1(){
        System.out.println("111");
    }
}
class Child extends Parent{
    public void c1(){}
    public void p1(){ // 부모 클래스의 메소드 재정의(=오버라이딩)
        System.out.println("222");
    }
}

// 클래스에서는 변수 선언, 생성자, 메소드의 정의만 가능
class Test1{
    public void aaa(){
        Child ch1 = new Child();
        ch1.c1(); ch1.p1(); // 둘 다 가능

        Parent p = new Child(); // 다형성
        //p.c1(); 오류 (호출 안됨)
        p.p1(); // 오버라이딩 전에는 111 출력, 후에는 222 출력

        // p는 자신이 Parent 자료형이라 착각하고 있기 때문에 p1 만 사용 가능
    }
}