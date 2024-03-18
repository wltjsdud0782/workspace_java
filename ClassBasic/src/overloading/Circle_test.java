package overloading;

public class Circle_test {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        //반지름의 값을 변경
//        c1.rad = 5;   //직접적이게 변수를 건들지 말 것. 접근제한자로 오류가 뜬다.
        c1.setRad(5);   //동일하지만 이 방법을 써야한다.

    }
}
