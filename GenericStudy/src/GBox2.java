// 제네릭 클래스의 타입 인자 제한하기
// 제한하는 이유 : 제한이 없을 때는 코드 구현에 필요한 메소드 호출 제한되기 때문
// 제한이 없을 때 호출할 수 있는 메소드는 Object 클래스에서 선언한 메소드만 사용 가능함.

// <T extends C1> = T에는 C1 클래스를 상속받은 클래스 or C1 클래스만 가능
// C1, C2, C3 만 가능
public class GBox2<T extends C2> {
    private T obj;

    public void set(T obj){
        this.obj = obj;
        obj.aaa(); // obj.bbb(); 가능 , obj.ccc(); 불가능
    }

    public T get(){
        return obj;
    }
}

class C1{
    public void aaa(){}
}
class C2 extends C1{
    public void bbb(){}
}
class C3 extends C2{
    public void ccc(){}
}
