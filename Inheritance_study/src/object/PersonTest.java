package object;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "java";
        p1.age = 20;
        Person p2 = new Person();
        p2.name = "java";
        p2.age = 20;

        System.out.println(p1.equals(p2));
        p1.equals(p2);  //object 가 person의 부모라 가능하다.
        //오버라이딩 만들어서 새로운 기준을 만들어줘야 equals 기능 사용 가능

        //객체를 문자열로 표현
        //객체를 출력하면 자동으로 toString()메소드를 실행한다.
        System.out.println(p1.toString());
        System.out.println(p1); //출력 결과 동일

    }
}
