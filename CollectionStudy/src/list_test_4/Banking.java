package list_test_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banking {
    List<Customer> customers;
    Scanner sc;

    public Banking(){
        customers = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    //1
    public void newAcc(){
        System.out.println("계좌개설을 시작합니다.");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("주민등록번호 : ");
        int number = sc.nextInt();
        System.out.print("연락처 : ");
        String tel = sc.next();
        System.out.println("계좌번호 : ");
        int accNumber = sc.nextInt();

    }
    //2
    public void deposit(){

    }
    //3
    public void withdraw(){

    }
    //4
    public void depositInfo(){

    }
    //5
    public void accountCancel(){

    }
    //6
    public void customerAllInfo(){
        for (Customer e : customers){
            System.out.println(e);
        }
    }
}
