package test.two;

public class Man_test {
    public static void main(String[] args) {
        //객체 생성 문법
        //클래스명 객체명 = new 생성자();
        Man m = new Man(); //이 부분이 사실은 생성자 호출임.

        //초기화 : 제품이 생산되면 값을 처음으로 세팅하는 작업.
        //      : 제품이 만들어지면 초기에 딱 한 번 세팅
        //m.initMan("선영", 23, "반구동");


        m.printInfo();
    }
}
