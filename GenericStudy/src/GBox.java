// 클래스 구현 시 자료형을 정하지 않고 기능 구현 ▶ 제네릭 사용 <T> 대문자는 아무거나
// 자료형이 정해지지 않았어요 = T
// 정해지지 않은 자료형은 객체 생성 시 결정.
public class GBox<T>{
    private T obj;

    public void set(T obj){
        this.obj = obj;
    }

    public T get(){
        return obj;
    }
}
