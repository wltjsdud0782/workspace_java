package list_test_2;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService {
    private Scanner sc;
    private List<List_EmpProgram> empInfo;

    public EmpService() {
        sc = new Scanner(System.in);
        this. empInfo = new ArrayList<>();

        empInfo.add(new List_EmpProgram(1001, "홍길동", "개발부", "010-1234-1234", 1500));
        empInfo.add(new List_EmpProgram(1002, "김길동", "개발부", "010-1234-1235", 1500));
        empInfo.add(new List_EmpProgram(1003, "최길동", "개발부", "010-1234-1236", 2500));

        empInfo.add(new List_EmpProgram(1004, "홍길동", "인사부", "010-1234-1237", 1000));
        empInfo.add(new List_EmpProgram(1005, "김길동", "인사부", "010-1234-1238", 1000));
        empInfo.add(new List_EmpProgram(1006, "최길동", "인사부", "010-1234-1239", 1000));

        empInfo.add(new List_EmpProgram(1007, "홍길동", "영업부", "010-1234-1240", 2000));
        empInfo.add(new List_EmpProgram(1008, "김길동", "영업부", "010-1234-1241", 1500));
        empInfo.add(new List_EmpProgram(1009, "최길동", "영업부", "010-1234-1242", 2500));
    }

    public void login() {
        boolean a = true;
        while (a) {
            System.out.print("사번 : ");
            int num = sc.nextInt();
            System.out.print("비밀번호(연락처의 마지막 4자리) : ");
            String tel = sc.next();

            for (int i = 0; i < empInfo.size(); i++) {
                if (empInfo.get(i).getNum() == num &&
                        empInfo.get(i).getTel().substring(9).equals(tel)) {
                    System.out.println("로그인 하였습니다.");
                    System.out.println("'" + empInfo.get(i).getName() + "'님 반갑습니다.");
                    a = false;
                    break;
                }
                else {
                    System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
                    break;
                }
            }
        }
    }

    public void moneyInfo() {
        int total = 0;
        double avr = 0;
        int cnt = 0;

        System.out.print("부서명 : ");
        String team = sc.next();
        System.out.println("==" + team + " 월급 현황==");
        for (int i = 0; i < empInfo.size(); i++) {
            if (empInfo.get(i).getTeam().equals(team)) {
                cnt++;
                System.out.println("이름 : " + empInfo.get(i).getName()
                        + "\t" + " 월급 : " + empInfo.get(i).getMoney());

                total = total + empInfo.get(i).getMoney();
                avr = (double)total / cnt;

            }
        }
        System.out.println(team + "서의 월급 총액은 " + total
                + "원이며, 평균 급여는 " + avr + "원입니다.");
    }

    public void moneyUp() {
        System.out.print("부서명 : ");
        String team = sc.next();
        System.out.print("인상급여 : ");
        int money = sc.nextInt();
        System.out.println(team + " 각 사원의 급여가 각각 " + money + "원씩 인상됩니다.");
        System.out.println("==월급 인상 후 " + team + " 월급 현황==");

        for (int i = 0; i < empInfo.size(); i++) {
            if (empInfo.get(i).getTeam().equals(team)) {

                empInfo.get(i).setMoney(empInfo.get(i).getMoney()+money);

                System.out.println("이름 : " + empInfo.get(i).getName()
                        + "\t" + " 월급 : " + (empInfo.get(i).getMoney()));
            }

        }
    }

    public void allInfo() {

        List<List_EmpProgram> devList = new ArrayList<>();
        List<List_EmpProgram> humanList = new ArrayList<>();
        List<List_EmpProgram> saleList = new ArrayList<>();

        for (List_EmpProgram e : empInfo){
            if (e.getTeam().equals("개발부")){
                devList.add(e);
            }
            else if (e.getTeam().equals("영업부")){
                saleList.add(e);
            }
            else if (e.getTeam().equals("인사부")){
                humanList.add(e);
            }
        }
        System.out.println("==모든 사원의 월급 현황==");
        int total = 0;
        int total1 = 0;
        int total2 = 0;

        for (List_EmpProgram e : humanList) {
            System.out.println(e);
            total = total + e.getMoney();
        }
        System.out.println("인사부 월급 소계 : " + total);

        for (List_EmpProgram e : devList) {
            System.out.println(e);
            total1 = total1 + e.getMoney();
        }
        System.out.println("개발부 월급 소계 : " + total);

        for (List_EmpProgram e : saleList) {
            System.out.println(e);
            total2 = total2 + e.getMoney();
        }
        System.out.println("영업부 월급 소계 : " + total);

        int alltotal = 0;

        alltotal = total + total1 + total2;
        System.out.println("전 직원 월급 총계 : " + alltotal);
        }

//        for (int i = 0; i < empInfo.size(); i++) {
//            if (empInfo.get(i).getTeam().equals("인사부")) {
//                System.out.println("부서 : 인사부 \t 이름 : " + empInfo.get(i).getName()
//                        + "\t 월급 : " + empInfo.get(i).getMoney());
//                total = total + empInfo.get(i).getMoney();
//
//            }
//        }
//        System.out.println("인사부 월급 소계 : " + total);
//
//        for (int i = 0; i < empInfo.size(); i++) {
//            if (empInfo.get(i).getTeam().equals("개발부")) {
//                System.out.println("부서 : 개발부 \t 이름 : " + empInfo.get(i).getName()
//                        + "\t 월급 : " + empInfo.get(i).getMoney());
//                total1 = total1 + empInfo.get(i).getMoney();
//
//            }
//        }
//                System.out.println("개발부 월급 소계 : " + total1);
//
//        for (int i = 0; i < empInfo.size(); i++) {
//            if (empInfo.get(i).getTeam().equals("영업부")) {
//                System.out.println("부서 : 영업부 \t 이름 : " + empInfo.get(i).getName()
//                        + "\t 월급 : " + empInfo.get(i).getMoney());
//                total2 = total2 + empInfo.get(i).getMoney();
//
//                }
//            }
//                System.out.println("영업부 월급 소계 : " + total2);
//
    }

