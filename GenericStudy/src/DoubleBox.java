// Map<Object, String>

// generic의 <>을 표현할때는 대문자 알파벳 하나로 정의한다.
// 대표적으로 많이 표현하는 <E>, <T>, <K>, <V>, <N> 등이 있다.
// Element, Type, Key, Value, Number
public class DoubleBox<L, R>{
    private L left;
    private R right;

    public void set(L a, R b){
        this.left = a;
        this.right = b;
    }

    public String toString(){
        return left + "&" + right;
    }
}
