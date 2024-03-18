package student;

import overloading.Circle;

public class overloading_Test {
    public static void main(String[] args) {
        Circle c = new Circle();  //접근제한자가 public 이라서 가능하다.
        //c.rad=3; 접근제한자가 private 이기 때문에 오류 발생
    }
}
