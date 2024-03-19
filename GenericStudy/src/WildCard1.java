public class WildCard1 {

    public static void peekBox(GBox<?> box){
        System.out.println(box);
    }

    // 와일드카드의 상한제한 / 하한제한
    public static void peekBox1(GBox<? extends C1> box){ // 상한제한
        System.out.println(box);
    }

    public static void peekBox2(GBox<? super C2> box){ // 하한제한 > super
        System.out.println(box);
    }




    // 와일드카드는 그저 개발자의 실수를 없애기 위한 하나의 방법이다.
}
