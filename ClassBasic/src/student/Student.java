package student;

public class Student {
    //데이터 : 이름, 나이, 학번, 점수
    String name;
    int age;
    String stuNum;
    int score;

    //기능
    //매개변수로 전달될 이름값으로 name 값을 변경하는 메소드
    public void setName(String name1){
        name = name1;
    }
    //매개변수로 전달될 나이값으로 age 값으로 변경하는 메소드
    public void setAge (int age1){
        age = age1;
    }
    //매개변수로 전달될 학번값으로 stuNum 값으로 변경하는 메소드
    public void setStuNum (String stuNum1){
        stuNum = stuNum1;
    }
    //매개변수로 전달될 점수값으로 score 값으로 변경하는 메소드
    public void setScore (int score1){
        if (score1 < 0){
            score = 0;
        }
        else {
            score = score1;
        }
        score = score1;
    }
    //학생의 모든 정보를 출력하는 showInfo() 메소드 구현
    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("학번 : " + stuNum);
        System.out.println("점수 : " + score);
    }
}
