    interface Basic{
        void print();
    }

    interface PrintMsg {
        void print(String msg);
    }

    interface Calculator{
        int cal(int a, int b);
    }

public class Lambda_1 {
    public static void main(String[] args) {
        // 1. 베이직 인터페이스의 프린트 메소드를 람다식을 사용하여
        // "java"라는 출력기능을 구현하고 구현한 람다식 사용
        Basic basic = () -> {
            System.out.println("java");
            System.out.println("java");
        }; // 두 개일 때는 중괄호 생략 안됨
        basic.print();


        // 2. 프린트메시지 인터페이스의 프린트 메소드를 람다식으로 구현하여
        // 매개변수로 전달된 문자열을 출력하는 기능 구현 및 호출
        PrintMsg printMsg = msg -> // 매개 변수가 하나일 때는 소괄호 생략 가능
                System.out.println(msg);
        printMsg.print("문제 2번");


        // return 값이 있는 메소드를 람다식으로 구현할 때는 중괄호 생략 불가능
        Calculator calculator = (a, b) -> {return a+b;};
        // 다른 함축적 문법을 제공하는데 이 문법을 사용 시에는 중괄호도 생략 가능
        // 메소드 구현부의 마지막 코드 결과가 값일 때는 자동으로 리턴으로 간주
        // 중괄호, return 을 지운다.
        Calculator calculator2 = (a, b) -> a+b;

    }
}
