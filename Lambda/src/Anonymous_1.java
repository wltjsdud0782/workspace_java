// 인터페이스 -> 익명 이너 클래스 -> 람다
    interface Printable{
        void print();
    }

    class MyPrinter implements Printable{
        @Override
        public void print() {
            System.out.println("안녕하세요");
        }
    }

public class Anonymous_1 {
    public static void main(String[] args) {
        // Printable 인터페이스의 print() 메소드 호출, 결과 '안녕하세요'가 출력되면 된다.
        Printable printable = new MyPrinter();
        printable.print();

        // 익명 이너 클래스
        //      : 클래스 만들기 귀찮은데 일회성의 인터페이스가 필요할 때 보통 사용함
        Printable p1 = new Printable() {
            @Override
            public void print() {
                System.out.println(111);
            }
        }; // 세미콜론 필요

        p1.print(); // 111 출력

        /////////////////////////////////////////////////////////////////////////////////
        // 람다 : 인터페이스 안에 정의 된 내용을 간단히 쓰겠다.
        Printable p2 = //new Printable() {
            //public void print
                () -> {
                System.out.println(111);
            }
        //}
        ;

        Printable p3 = () -> System.out.println(123);

    }

}
