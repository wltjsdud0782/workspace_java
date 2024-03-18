package math;

//아래 제시된 인터페이스를 구현하는 클래스 MyMath 를 만들고 해당 클래스 안에 요구사항에 맞는 메소드 구현하시오.

public interface MathUtil {
    //매개변수로 받은 두 수 중 작은 수를 리턴
    int getMin(int a, int b);

    //매개변수로 받은 반지름을 가진 원의 둘레(2파이r)를 리턴
    //단, 반지름이 0 이하라면 둘레는 0이 되어야 함.
    double getCircleArea(int radius);

    //첫번째 매개변수로 받은 수의 n제곱 값을 리턴
    //ex) 첫번째 매개변수 : 2
    //    두번째 매개변수 : 4
    // 결과 : 2 * 2 * 2 * 2
    int getMultipul(int num1, int num2);
}
