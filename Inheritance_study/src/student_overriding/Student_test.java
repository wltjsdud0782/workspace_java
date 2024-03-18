package student_overriding;

public class Student_test {
    public static void main(String[] args) {
        NewStudent ns = new NewStudent();

        //오버라이딩 된 메소드는 무조건 자식 클래스에서 재정의된 메소드만 실행된다.
        //부모클래스에게 정의한 tellName 메소드를 더이상 호출할 수 없다.

        ns.tellName();
    }
}
