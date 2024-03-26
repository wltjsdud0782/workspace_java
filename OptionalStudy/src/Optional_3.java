import java.util.Optional;

public class Optional_3 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("java python");

        Optional<String> r1 = o1.map(s -> s.replace(" ", ""))
                                .map(s -> s.toUpperCase());

        System.out.println(r1.get());

        String r2 = o1.map(s -> s.replace(" ", ""))
                        .map(s -> s.toUpperCase())
                        .get();
    }
}
