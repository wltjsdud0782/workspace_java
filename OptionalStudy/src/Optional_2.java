import java.util.Optional;
import java.util.function.Function;

public class Optional_2 {
    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("Optional String");
        // Function<String, U> : U apply(String s)
        // Function<String, U> : String apply(String s)
        // Function<String, String> f = s -> {return s.replace(" ", "");};

        o1.map(s -> s.replace(" ", ""));
        System.out.println(o1.get());

        // map() : apply 메소드가 반환하는 데이터를 새로운 박스에 담아서 리턴해준다.
        Optional<String> o2 = o1.map(s -> s.replace(" ", ""));
        System.out.println(o2.get());

        String result = o1.map(s -> s.replace(" ", "")).get();
        System.out.println(result);
    }
}
