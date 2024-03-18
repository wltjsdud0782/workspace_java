package list_test_3;

import list_test_1.List_Student;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<StudyClass> classList;

    public School(List<StudyClass> classList){
        this.classList = classList;
    }
    //1)
    public void teacherClassStudentsAllInfo(String teacherName){
        for (StudyClass s : classList){
            if (s.getTeacherName().equals(teacherName)){
                s.studentsInfo();
            }
        }
    }
    //2)
    public void classStudentsAllInfo(){
        for (StudyClass s : classList){
            System.out.println(s.getClassName() + "의 평균 : " + s.getClassAvg());
        }

        double sum = 0.0;
        int totalStuCnt = 0;
        for (StudyClass s : classList){
            sum = sum + s.getClassAvg() * s.getStudentsCnt();
            totalStuCnt = totalStuCnt + s.getStudentsCnt();
        }
        System.out.println("전체 학생의 평균 : " + sum / totalStuCnt);
    }
    //3) 각 반 1등
    public void allClassTopScoreStudent(){
        for (StudyClass s : classList){
            System.out.println(s.getClassTop());
        }

    }
    //4)
    public double getClassAvg(String className){
        double avg = 0.0;
        for (StudyClass s : classList){
            if(s.getClassName().equals(className)){
                avg = s.getClassAvg();
            }
        }
        return avg;
    }

}
