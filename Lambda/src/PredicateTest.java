// Predicate<T> : boolean test(T t)
// BiPredicate<T, U> : boolean test (T t, U u)

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        // 매개변수로 전달 된 수가 짝수면 리턴 true
        Predicate<Integer> p1 = num -> {return num % 2 == 0;};
        System.out.println(p1.test(2));

        // 매개변수로 전달된 두 정수의 합이 짝수면 리턴 true
        BiPredicate<Integer, Integer> bp = (num1, num2) -> {return (num1 + num2) % 2 == 0;};
        System.out.println(bp.test(5, 2));

        ccc(10, 20, bp);
        ccc(10, 20, (num1, num2) -> num1 + num2 < 10);
        ccc(10, 20, (num1, num2) -> num1 == num2);
    }
    // 두 정수를 매개변수로 받아 합이 10보다 작으면 리턴 true
    public static boolean aaa(int num1, int num2){
        return num1 + num2 < 10;
    }

    // 두 정수를 매개변수로 받아 두 수가 같으면 리턴 true
    public static boolean bbb(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean ccc(int num1, int num2, BiPredicate<Integer, Integer> p){
        return p.test(num1, num2);
    }
}
