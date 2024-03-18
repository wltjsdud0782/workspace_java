package stu;

// 1. 아래 요구사항에 만족하는 추상메소드를 정의
// 2. StudentTest 클래스에서 만든 메소드를 구현

public interface StudentUtil {
    //매개변수로 들어온 학생의 총점을 리턴
    int getTotalScore(Student student);

    //매개변수로 들어온 두 학생 중 총점이 높은 학생 리턴
    //단, 총점이 같은 경우는 없다
    Student getHighScoreStudent(Student stu1, Student stu2);

    //메소드명 : getGradeByStudentName  학생이름으로 점수얻기
    //학생 여러명을 매개변수로 받아, 또 다른 매개변수로 받은 학생의 이름과 일치하는 학생의 점수 등급을 문자열로 리턴
    //만약, 매개변수로 받은 이름과 일치하는 학생이 없다면 "학생 정보 없음"이라는 문자열 리턴
    //90 <= 평균 <= 100 : A
    //80 <= 평균 <= 89 : B
    //70 <= 평균 <= 79 : C
    //      평균 < 70 : D
    String getGradeByStudentName(Student[] students, String name);

    //메소드명 : getTotalScoresToArray
    //매개변수로 학생 여러명을 받아, 해당 학생들의 총점을 배열로 리턴
    //ex)각각의     int[] getTotalScoresToArray(Student[] students);학생 총점이 270점 280점 250점이라고 한다면 세 값을 갖는 배열을 리턴
    int[] getTotalScoresToArray(Student[] students);
}
