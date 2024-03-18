package student_program;

import java.util.Scanner;

public class Stu_manager {
    private Scanner sc;
    private Student info;
    private Student[] students;
    private int index; //배열의 index를 저장

    public Stu_manager() { //객체 생성 공간 , 초기화 공간
        students = new Student[3];  //학생 3명이 저장할 공간 생성
        sc = new Scanner(System.in);
        index = 0;
    }

    //학생 등록 기능
    public void regStudent() {
        if (index >= 3) {
            System.out.println("더 이상 학생을 등록할 수 없습니다.");
        }
        else {
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
            //키보드로 학생 정보를 입력받음
            //입력받은 정보로 학생 객체 생성
            //생성한 학생 객체를 배열에 저장
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("연락처 : ");
            String tel = sc.next();
            System.out.print("학점 : ");
            String grade = sc.next();

            Student stu = new Student(name, age, tel, grade);
            students[index++] = stu;
        }
    }


    //학생 정보 변경 (연락처) 기능
    public void changeInfo() {
        System.out.println("학생의 연락처를 변경합니다.");
        boolean isFind = false;

        while (!isFind){
            System.out.print("변경 학생 : ");
            String name = sc.next();
            for (int i = 0; i < index; i++){
                if (students[i].getName().equals(name)){
                    System.out.println("연락처 : ");
                    String tel = sc.next();
                    students[i].SetTel(tel);
                    isFind = true;
                }
            }
        }
        if (!isFind){
            System.out.println("해당하는 학생이 존재하지 않습니다.");
        }

    }

    //학생 정보 출력 (1명) 기능
    public void showInfo() {
        boolean isFind = false;

        while(!isFind) {
            System.out.print("정보를 열람할 학생 : ");
            String name = sc.next();

            for (int i = 0; i < index; i++) {//aa, bb, cc      cc
                if (students[i].getName().equals(name)) {
                    System.out.println("요청하신 학생의 정보입니다.");
                    students[i].ShowInfo();
                    isFind = true;
                }
            }
            if (!isFind){
                    System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }
    }

        //학생 정보 출력 (모든 학생) 기능
    public void showInfoAll(){
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + index + "명 입니다.");
        for (int i = 0; i < index; i++) {
            students[i].ShowInfo();
        }
    }
}
