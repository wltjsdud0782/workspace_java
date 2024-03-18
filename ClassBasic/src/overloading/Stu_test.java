package overloading;

public class Stu_test {
    public static void main(String[] args) {

        Stu s1 = new Stu();
        s1.name = "김자바";
        Stu s2 = s1;
        System.out.println(s1.name); //김자바
        System.out.println(s2.name); //김자바

        s2.name = "홍길동";   //s1 과 s2 가 같은 메모리의 주소를 가지고 있음.
        //↓ 주소 안 내용을 바꿨기 때문에 s1 도 자동으로 바뀐다.
        System.out.println(s1.name); //홍길동
        System.out.println(s2.name); //홍길동
    }
}
