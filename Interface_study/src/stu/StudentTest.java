package stu;

public class StudentTest implements StudentUtil {

    @Override
    public int getTotalScore(Student student) {
        return student.getEngScore() +
                student.getKorScore() +
                student.getMathScore();
    }

    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        return getTotalScore(stu1) > getTotalScore(stu2) ? stu1 : stu2 ;
    }

    @Override
    public String getGradeByStudentName(Student[] students, String name) {
        String grade = "학생 정보 없음";
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                double avr = (getTotalScore(students[i]) / 3.0);
                if (avr >= 90 && avr <= 100) {
                    grade = "A";
                }
                if (avr >= 80 && avr <= 89) {
                    grade = "B";
                }
                if (avr >= 70 && avr <= 79) {
                    grade = "C";
                }
                if (avr < 70) {
                    grade = "D";
                }
            }
        }
            return grade;
    }



    @Override
    public int[] getTotalScoresToArray(Student[] students) {
        int[] total = new int[students.length];
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(students)) {
                total[i] = getTotalScore(students[i]);
            }
        }
        return total;
    }
}
