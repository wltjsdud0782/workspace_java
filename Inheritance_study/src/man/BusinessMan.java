package man;

//BusinessMan 클래스는 Man 클래스를 상속.
//상속하게 되면 부모 클래스의 변수와 메소드를 물려받는다.
//자바에서 다중 상속은 문법적으로는 불가능하다. > 하나씩 단계별로 상속하면 가능 > Test_1

//부모클래스, 슈퍼클래스, 상위클래스
//자식클래스, 서브클래스, 하위클래스

//기존 클래스를 재활용해서 구현해야 하는 코드의 양을 줄인다.
//관련없는 클래스들에게 하나의 공통된 성격을 부여하여
        //관련없던 다수의 클래스를 한 번에 관리할 수 있는 기능이다.
//상속의 오버라이딩 + 다형성
public class BusinessMan extends Man{
    String company;

    public void tellCompany(){
        System.out.println("제 회사는 " + company);
    }
}
