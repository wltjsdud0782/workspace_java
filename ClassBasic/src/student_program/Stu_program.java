package student_program;

import java.util.Scanner;

public class Stu_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stu_manager stu_manager = new Stu_manager();

        System.out.println("학생관리 프로그램을 실행합니다.");

        while (true){
            System.out.print(
                    "1)학생등록  2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력  5)프로그램 종료 : ");
            int option = sc.nextInt();
            switch (option){
                case 1 :
                    stu_manager.regStudent();
                    break;
                case 2 :
                    stu_manager.changeInfo();
                    break;
                case 3 :
                    stu_manager.showInfo();
                    break;
                case 4 :
                    stu_manager.showInfoAll();
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0); //코드 실행 시 프로그램 종료
            }
        }
    }
}
