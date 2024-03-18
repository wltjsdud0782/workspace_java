package wrapper;

import com.sun.jdi.Value;

//래퍼 클래스 : 기본 자료형을 클래스로 만든 것
//int > Integer
//double > Double
//boolean > Boolean
//float > Float
public class Wrapper01 {
    //모든 자료형의 객체가 매개변수로 전달될 수 있다.
    //원칙적으로 기본 자료형은 못 들어간다.
    public void getData(Object o){

    }

    public void test(){
        // > Integer ii = 50;
        // > ii = 50;
        // > getData(ii);
        getData(50); //오토박싱(auto boxing)

        Integer i2 = 5;
        // > int f = i2.intValue(5);
        // > int c = f;
        int c = i2; //오토언박싱(auto unboxing)

        //사실은 생략되어 있다는 걸 보여줌.
        //기본자료형 그냥 쓰면 된다.
    }
}
