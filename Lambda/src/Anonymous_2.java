// 함수형 인터페이스(Functional Interface)
//      : 안에 구현되어 있는 메소드가 하나인 인터페이스
interface GetNum{
        void get(int num1, int num2);
    }
    // 합
    class GetSum implements GetNum{
        @Override
        public void get(int num1, int num2) {
            System.out.println(num1 + num2);
        }
    }
    // 차
    class GetSub implements GetNum{
        public void get(int num1, int num2){
            System.out.println(num1 - num2);
        }
    }

public class Anonymous_2 {
    public static void main(String[] args) {
        // 기본 문법
        GetNum n1 = new GetSum();
        n1.get(4,2); // 6

        GetNum n2 = new GetSub();
        n2.get(4,2); // 2

        /////////////////////////////////////////////////////////////////////////////////
        // 익명 클래스
        GetNum n3 = new GetNum() {
            public void get(int num1, int num2) {
                System.out.println(num1 + num2);
            }
        };
        n3.get(4,2); // 6


        GetNum n4 = new GetNum() {
            public void get(int num1, int num2) {
                System.out.println(num1 - num2);
            }
        };
        n4.get(4,2); // 2

    /////////////////////////////////////////////////////////////////////////////////
        // 람다

        GetNum n5 = (num1, num2) ->
                System.out.println(num1 + num2);
        n5.get(4,2);

        // 람다식을 이용해서 get 메소드의 내용을 매개변수로 들어온 두 수의 곱을 출력
        GetNum n6 = (a, b) ->
                System.out.println(a * b);
        n6.get(4,2);
    }

}
