// 제네릭 타입의 메소드 정의

public class GMethod {

    public static Box makeBox(Object obj){
        Box box = new Box();
        box.set(obj);
        return box;
    }

    //제네릭 메소드 : 호출될 때 자료형 정한다.
    public static <T> GBox<T> makeGBox(T obj){
        GBox<T> box = new GBox<>();
        box.set(obj);

        return box;
    }
    // (2) 제한된 제네릭 메소드
    public static <T extends C2> GBox<T> makeGBox2(T obj){
        GBox<T> box = new GBox<>();
        box.set(obj);

        return box;
    }
    // ///////////////////////////////////////////////////////////////

    public static <T> void peekBox1(GBox<T> box){ //제네릭
        System.out.println(box);
    }

    public static void peekBox3(GBox<?> box){ // 와일드카드 : 제네릭이 아니지만 똑같다

    }

    public static void peekBox2(GBox<Object> box){ //일반
        System.out.println(box);
    }

    public void aaa(){
        GBox<Integer> b1 = new GBox<>();
        peekBox1(b1); // 가능
        //peekBox2(b1); // 오류
    }
}
