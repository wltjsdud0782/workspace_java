public class GMethodTest {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Box box= GMethod.makeBox(apple);
        Apple a = (Apple) box.get(); // 사과


        // <T> 자료형이 매개변수로 인해 정해진다 (형변환 필요X)
        GBox<String> g1 = GMethod.makeGBox("apple");
        String data1 = g1.get();

        GBox<Apple> g2 = GMethod.makeGBox(apple);
        Apple data2 = g2.get();
    }
}
