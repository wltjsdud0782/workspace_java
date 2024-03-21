// Consumer<T> : void accept (T t)

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("a");
        list.add("b");
        list.add("c");

        // 리스트에 저장된 모든 데이터 출력
        // Consumer<String> c = s -> System.out.println(s);
        list.forEach(s -> System.out.println(s));

        // UnaryOperator<T> : T apply(T t)
        list.replaceAll(s -> {
            return s.equals("a") ? "A" : s;
        });
        System.out.println(list);
        
    }
}
