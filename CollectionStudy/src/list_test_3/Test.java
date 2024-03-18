package list_test_3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("김자바", 13, 80);
        Student s2 = new Student("최자바", 10, 80);
        Student s3 = new Student("박자바", 11, 90);

        List<Student> students1 = new ArrayList<>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);

        StudyClass c1 = new StudyClass(students1,"병아리반", "동동이");
///////////////////////////
        Student s4 = new Student("김캐드", 14, 70);
        Student s5 = new Student("박캐드", 13, 80);
        Student s6 = new Student("최캐드", 14, 95);

        List<Student> students2 = new ArrayList<>();
        students2.add(s4);
        students2.add(s5);
        students2.add(s6);

        StudyClass c2 = new StudyClass(students2, "개나리반", "홍길동");
////////////////////////////
        Student s7 = new Student("김이썬", 17, 80);
        Student s8 = new Student("박이썬", 18, 90);
        Student s9 = new Student("최이썬", 18, 75);

        List<Student> students3 = new ArrayList<>();
        students3.add(s7);
        students3.add(s8);
        students3.add(s9);

        StudyClass c3 = new StudyClass(students3, "구름반", "동동이");

        List<StudyClass> classList = new ArrayList<>();
        classList.add(c1);
        classList.add(c2);
        classList.add(c3);

        School school = new School(classList);

//        school.teacherClassStudentsAllInfo("동동이");
//        school.classStudentsAllInfo();
//        school.allClassTopScoreStudent();

    }
}
