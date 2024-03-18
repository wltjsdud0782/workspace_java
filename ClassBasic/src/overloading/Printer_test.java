package overloading;

public class Printer_test {
    public static void main(String[] args) {
        Printer p1 = new Printer();  //첫번째 생성자 실행.

        System.out.println(p1.number);

        Printer p2 = new Printer(5);  //두번째 생성자 실행.
        System.out.println(p2.number);
    }
}
