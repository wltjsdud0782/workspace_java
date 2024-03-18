package student;

public class StudentTest1 {
    public static void main(String[] args) {
        //학생 객체 s1 생성
        Student s1 = new Student();

        //학생이 가진 모든 정보를 출력
        s1.showInfo();

        //s1 학생의 이름을 홍길동으로 변경
        s1.setName("홍길동");
        //s1 학생의 점수 변경
        //데이터를 직접 컨트롤하면 잘못된 데이터가 들어갈 때 문제가 발생하며 대체 할 방법이 X
        s1.setScore(100);
    }
}
