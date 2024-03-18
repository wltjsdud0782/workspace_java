package first;

public class PhoneTest2 {
    public static void main(String[] args) {
        //객체는 여러개 만들 수 있다.
        Phone_class문제하나나옴 p1 = new Phone_class문제하나나옴();
        Phone_class문제하나나옴 p2 = new Phone_class문제하나나옴();

        p1. price = 5000;
        System.out.println(p1.price);//5000
        System.out.println(p2.price);//0
    }
}
