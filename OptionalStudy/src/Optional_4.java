import java.util.Optional;

public class Optional_4 {
    public static void main(String[] args) {
        String data = "java";
        Optional<String> o1 = Optional.ofNullable(data);

        // 기본적으로 map 메소드의 리턴타입은 Optional이다.
        // 다만, map 메소드 다음에 orElse 메소드가 연속적으로 실행되면
        // 리턴타입은 Optional이 아니라 저장된 데이터의 자료형으로 리턴
        String r1 = o1.map(s -> s.toUpperCase()).orElse("None");
        System.out.println(r1);
    }
}
