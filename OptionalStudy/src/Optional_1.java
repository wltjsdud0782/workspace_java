import java.util.Optional;
import java.util.function.Consumer;

public class Optional_1 {
    public static void main(String[] args) {
        // 옵셔널 사용 : null 체크를 하기 위해! (보다 간단히?)
        // 객체의 null 체크 기능이 있는 박스에 담아서 사용

        String str = "java";

        Optional<String> o1 = Optional.of(str); // of 메소드는 null 허용 X
        Optional<String> o2 = Optional.ofNullable(str); // ofNullable 메소드는 null 허용 O

        //o1.isPresent(); // null 이 맞는가 아닌가?

        if (o1.isPresent()){ // 박스 안 데이터가 null 이 아니면..
            // get() : 박스 안 데이터 가져오기
            System.out.println(o1.get());
        }
        // functional interface 함수형 인터페이스
        // Consumer<String> : void accept(String s)
        // Consumer<String> c = (s) -> System.out.println(s);

        o1.ifPresent((s) -> System.out.println(s));



        // o1.ifPresent(); // 만약에 null 이 있으면


    }
}
