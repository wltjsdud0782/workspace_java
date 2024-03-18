package student_program;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String tel;

    //생성자
    public Student(String name, int age, String tel, String grade) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.grade = grade;
    }

    public void SetTel(String tel) {

    }
        public void ShowInfo () {
            System.out.println("이름 : " + name +
                    ", 나이 : " + age +
                    ", 연락처 : " + tel +
                    ", 학점 : " + grade);
        }
        public String getName() {
            return name;
        }
}
