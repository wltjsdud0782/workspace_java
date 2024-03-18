package list_test_3;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
    private List<Student> students;
    private String className;
    private String teacherName;

    public StudyClass(List<Student> students, String className, String teacherName) {
        this.students = students;
        this.className = className;
        this.teacherName = teacherName;
    }

    public int getStudentsCnt(){
        return students.size();
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return students;
    }
    public String getClassName() {
        return className;
    }
    public String getTeacherName() {
        return teacherName;
    }

    //1)
    public void studentsInfo() {
        for (Student s : students){
            System.out.println(s);
        }
    }
    //2)
    public double getClassAvg() {
        int total = 0;
        double avg = 0;
        for (Student s : students) {
            total = total + s.getScore();
            avg = (double) total / students.size();
        }
        return avg;
    }
    //3)
    public Student getClassTop() {
        Student max = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            max = max.getScore() < students.get(i).getScore()
                    ? students.get(i)
                    : max;
        }
        return max;
    }

//    public double allClassAvg(){
//        int sum = 0;
//        double avg = 0;
//        for (Student e : students){
//            sum = sum + e.getScore();
//        }
//            avg = (double) sum / students.size();
//        return avg;
//    }

}


