import java.util.ArrayList;
import java.util.List;

public class AfterGeneric {
    public static void main(String[] args) {

        // <T>를 모두 String으로 변경되어 들어간다.
        GBox<String> b1 = new GBox<String>();
        b1.set("a");
        b1.get();

        // List<Apple> list = new ArrayList< >();
        GBox<Apple> b2 = new GBox< >();
        // b2.set("Apple"); 오류 막아줌
        b2.set(new Apple());
        Apple a = b2.get(); // 형변환 불필요 [장점]

        // DoubleBox 클래스
        DoubleBox<Integer, String> db = new DoubleBox<>();
        db.set(10, "문자열");

        System.out.println(db);
    }
}
