package overloading;

public class Circle {
    //접근제한자 : 변수나 메소드, 클래스에 접근할 수 있는 영역을 지정
    //   :private - 변수나 메소드를 선언한 '클래스' 내에서만 접근 가능 (멤버 변수)
    //   :protected
    //   :default - 변수나 메소드를 선언한 같은 '패키지' 내에서 접근 가능 (기본 자동 생성)
    //   :public - 변수나 메소드를 같은 '프로젝트' 내에서 접근 가능

    private int rad; //원의 반지름      ,    private 필수

    public Circle(){
        //생성자
    }

    //원의 넓이를 리턴하는 메소드
    public double getArea(){
        return 3.14 * rad * rad;
    }
    //rad 값을 전달되는 매개변수로 변경하는 메소드
    public void setRad(int rad){
        this.rad = rad < 0 ? 0 : rad;
    }

}
