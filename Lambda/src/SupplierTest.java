
// Supplier<T> : T get()

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        // 1~10까지의 수 중 랜덤 한 정수를 리턴
        Supplier<Integer> s1 = () -> {
            int rand = (int)(Math.random() * 10 + 1);
            return rand;
        };

        s1.get();
    }
}
